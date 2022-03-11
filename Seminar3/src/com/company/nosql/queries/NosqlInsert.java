package com.company.nosql.queries;

import com.company.nosql.contracts.NosqlQuery;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class NosqlInsert implements NosqlQuery {

    @Override
    public void run(MongoDatabase mongoDb) {

        MongoCollection<Document> collection = mongoDb.getCollection("employees");

        Document employee1 = new Document().append("name", "Popescu Ion").
                append("address", "Bucharest").append("salary", 4000);

        collection.insertOne(employee1);

        Document employee2 = new Document().append("name", "Ionescu Vasile").
                append("salary", 4500);
        collection.insertOne(employee2);

    }
}

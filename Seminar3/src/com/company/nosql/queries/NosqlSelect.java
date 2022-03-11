package com.company.nosql.queries;

import com.company.nosql.contracts.NosqlQuery;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class NosqlSelect implements NosqlQuery {
    @Override
    public void run(MongoDatabase mongoDb) {
        MongoCollection<Document> collection = mongoDb.getCollection("employees");

        FindIterable<Document> result = collection.find();
        for(Document doc : result) {
            System.out.println(doc);
        }

    }
}

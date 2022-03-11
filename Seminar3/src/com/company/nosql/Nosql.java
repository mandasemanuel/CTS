package com.company.nosql;


import com.company.nosql.contracts.NosqlConnection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


public class Nosql implements NosqlConnection {

    MongoClient mongoClient;
    MongoDatabase mongoDb;

    @Override
    public void connect() {
        mongoClient = new MongoClient("localhost", 27017);
        mongoDb = mongoClient.getDatabase("test");

        if(mongoDb.getCollection("employees") != null) {
            mongoDb.getCollection("employees").drop();
        }
    }

    @Override
    public MongoDatabase getConnection() {
        return this.mongoDb;
    }

    @Override
    public void close() {
        mongoClient.close();
    }

}

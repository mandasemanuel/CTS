package com.company.nosql.queries;

import com.company.nosql.contracts.NosqlQuery;
import com.mongodb.client.MongoDatabase;


public class NosqlCreate implements NosqlQuery {

    @Override
    public void run(MongoDatabase mongoDb) {
        mongoDb.createCollection("employees");
    }

}

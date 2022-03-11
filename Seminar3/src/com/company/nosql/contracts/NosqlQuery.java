package com.company.nosql.contracts;

import com.mongodb.client.MongoDatabase;


public interface NosqlQuery {

    void run(MongoDatabase mongoDb);

}

package com.company.nosql.contracts;

import com.mongodb.client.MongoDatabase;


public interface NosqlConnection {

    void connect();
    MongoDatabase getConnection();

    void close();
}

package com.company.nosql;

import com.company.Orchestrator;
import com.company.nosql.contracts.NosqlConnection;
import com.company.nosql.contracts.NosqlQuery;
import com.mongodb.client.MongoDatabase;

public class NosqlOrchestrator implements Orchestrator {

    private NosqlConnection connection;
    private NosqlQuery query;

    public NosqlOrchestrator(NosqlConnection connection, NosqlQuery query) {
        this.connection = connection;
        this.query = query;
    }

    @Override
    public void execute() {
        connection.connect();
        query.run(connection.getConnection());
    }

    @Override
    public void closeConnections() {
        connection.close();
    }
}

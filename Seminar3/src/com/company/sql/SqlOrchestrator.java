package com.company.sql;

import com.company.Orchestrator;
import com.company.sql.contracts.SqlConnection;
import com.company.sql.contracts.SqlQuery;

public class SqlOrchestrator implements Orchestrator {
    private SqlConnection connection;
    private SqlQuery query;

    public SqlOrchestrator(SqlConnection connection, SqlQuery query) {
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

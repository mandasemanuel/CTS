package com.company;

import com.company.nosql.Nosql;
import com.company.nosql.NosqlOrchestrator;
import com.company.nosql.contracts.NosqlConnection;
import com.company.nosql.contracts.NosqlQuery;
import com.company.nosql.queries.NosqlCreate;
import com.company.sql.*;
import com.company.sql.contracts.SqlConnection;
import com.company.sql.contracts.SqlQuery;
import com.company.sql.queries.SqlCreate;
import com.company.sql.queries.SqlInsert;
import com.company.sql.queries.SqlSelect;

public class Main {
    public static String databaseType = "SQL";

    public static void main(String[] args) {

        Orchestrator orchestrator;

        if("SQL".equals(databaseType)) {
            SqlConnection connection = new Sql();
            SqlQuery query = new SqlSelect();
            orchestrator = new SqlOrchestrator(connection, query);

        } else {
            NosqlConnection connection = new Nosql();
            NosqlQuery query = new NosqlCreate();
            orchestrator = new NosqlOrchestrator(connection, query);
        }

        orchestrator.execute();
        orchestrator.closeConnections();

    }
}

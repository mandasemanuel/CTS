package com.company.sql.queries;

import com.company.sql.contracts.SqlQuery;

import java.sql.Connection;
import java.sql.Statement;

public class SqlCreate implements SqlQuery {

    @Override
    public void run(Connection connection) {

        try {
            String sqlDrop = "DROP TABLE IF EXISTS employees";
            String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
                    + "name TEXT, address TEXT, salary REAL)";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlDrop);
            statement.executeUpdate(sqlCreate);
            statement.close();
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

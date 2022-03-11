package com.company.sql;

import com.company.sql.contracts.SqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sql implements SqlConnection {

    private Connection connection;


    @Override
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }

    @Override
    public void close() {
        try{
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }


}

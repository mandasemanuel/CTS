package com.company.sql.contracts;

import java.sql.Connection;

public interface SqlConnection {

    void connect();
    Connection getConnection();
    void close();

}

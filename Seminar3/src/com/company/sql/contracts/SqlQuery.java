package com.company.sql.contracts;

import java.sql.Connection;

public interface SqlQuery {

    void run(Connection connection);

}

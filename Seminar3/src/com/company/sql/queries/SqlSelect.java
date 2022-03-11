package com.company.sql.queries;

import com.company.sql.contracts.SqlQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlSelect implements SqlQuery {

    @Override
    public void run(Connection connection) {
        try {
            String sqlSelect = "SELECT * FROM employees";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlSelect);
            while(rs.next()) {
                int id = rs.getInt("id");
                System.out.println("id: " + id);
                String name = rs.getString(2);
                System.out.println("name: " + name);
                String address = rs.getString("address");
                System.out.println("address: " + address);
                double salary = rs.getDouble("salary");
                System.out.println("salary: " + salary);
            }
            rs.close();
            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

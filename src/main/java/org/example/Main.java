package org.example;

import org.example.databaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection databaseConnection = new DatabaseConnection();
        try {
            Connection connection = databaseConnection.getConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection established");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
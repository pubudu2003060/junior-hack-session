package org.example.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements ConnectionI {

    private static String databaseUrl = "jdbc:mysql://localhost:3306/junior_hack_session";
    private static String databaseUser = "root";
    private static String databasePassword = "";

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(databaseUrl, databaseUser, databasePassword);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return createConnection();
    }
}

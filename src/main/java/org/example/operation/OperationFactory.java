package org.example.operation;

import org.example.databaseConnection.ConnectionI;
import org.example.databaseConnection.DatabaseConnection;

import java.sql.SQLException;

public class OperationFactory {

    public Operation getOperation(String operation) throws SQLException {

        ConnectionI connection = new DatabaseConnection();

        switch (operation) {
            case "create":return new Crearte(connection.getConnection());
            case "delete":return new Delete(connection.getConnection());
            case "update":return new Update(connection.getConnection());
            case "select":return new Select(connection.getConnection());
            case "selectall":return new SelectAll(connection.getConnection());
            default: return null;
        }

    }
}

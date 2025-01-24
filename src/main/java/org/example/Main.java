package org.example;

import org.example.DTO.EmployeeDTO;
import org.example.databaseConnection.DatabaseConnection;
import org.example.operation.*;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Delete operation = new Delete();

        EmployeeDTO employeeDTO = new EmployeeDTO(1,"pubudu",19,"2000","hr");

        DatabaseConnection databaseConnection = new DatabaseConnection();
        try {
            Connection connection = databaseConnection.getConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection established");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            Object result = operation.operation(1,databaseConnection.getConnection());
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
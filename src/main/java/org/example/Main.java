package org.example;

import org.example.DTO.EmployeeDTO;
import org.example.databaseConnection.DatabaseConnection;
import org.example.operation.Crearte;
import org.example.operation.Operation;
import org.example.operation.Update;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Update operation = new Update();

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
            String result = operation.operation(1,"age",45,databaseConnection.getConnection());
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
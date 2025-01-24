package org.example;

import org.example.DTO.EmployeeDTO;
import org.example.DTO.UpdateDTO;
import org.example.databaseConnection.DatabaseConnection;
import org.example.operation.*;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Operation operation = new Delete();

        EmployeeDTO employeeDTO = new EmployeeDTO(1,"pubudu",19,"2000","hr");
        UpdateDTO updateDTO = new UpdateDTO(2,"name","rashmika");

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
            Object result = operation.operation(3,databaseConnection.getConnection());
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }
}
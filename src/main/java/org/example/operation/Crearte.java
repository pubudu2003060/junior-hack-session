package org.example.operation;

import org.example.DTO.EmployeeDTO;
import org.example.databaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Crearte implements Operation {



    public String operation(EmployeeDTO employeeDTO, Connection connection) {
        return addOperation(employeeDTO, connection);
    }

    public String addOperation(EmployeeDTO employeeDTO, Connection connection) {
        String sql = "insert into employee(name,age,salary,department) values(?,?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, employeeDTO.getName());
            preparedStatement.setInt(2, employeeDTO.getAge());
            preparedStatement.setString(3, employeeDTO.getSalary());
            preparedStatement.setString(4, employeeDTO.getDepartment());

            int responce = preparedStatement.executeUpdate();

            if (responce > 0) {
                return "Successfully add Employee : " + employeeDTO.getName();
            } else {
                return "Cant add Employee : " + employeeDTO.getName();
            }

        } catch (Exception e) {
            return "Error adding Employee : " + e.getMessage();
        }

    }
}

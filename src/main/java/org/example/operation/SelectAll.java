package org.example.operation;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectAll implements Operation{

    Connection connection;

    public SelectAll(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Object operation(Object object) {
        try {
            int id = Integer.parseInt(object.toString());
            return selection(this.connection);
        }catch (Exception e) {
            return e.getMessage();
        }

    }

    public Object selection(Connection connection) {
        String sql = "select * from employee";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            List<String> employees = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String salary = resultSet.getString("salary");
                String department = resultSet.getString("department");
                employees.add("ID: " + id + " Name: " + name + " Age: " + age + " Salary: " + salary + " Department: " + department);
            }

            return employees;

        } catch (Exception e) {
            return "Update Error" + e.getMessage();
        }
    }

}


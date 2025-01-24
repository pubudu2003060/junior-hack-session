package org.example.operation;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

    public Object operation(int id, Connection connection) {
        return selection(id,connection);
    }

    public Object selection(int id, Connection connection) {
        String sql = "select * from employee where id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                String name = result.getString("name");
                int age = result.getInt("age");
                String salary = result.getString("salary");
                String department = result.getString("department");

                return name+","+age+","+salary+","+department ;
            } else {
                return null;
            }
        } catch (Exception e) {
            return "Update Error" + e.getMessage();
        }
    }

}

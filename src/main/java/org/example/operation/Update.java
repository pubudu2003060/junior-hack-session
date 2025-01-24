package org.example.operation;

import org.example.DTO.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class Update implements Operation {

    public String operation(int id, String attribute, Object value, Connection connection) {
        return update(id,attribute,value,connection);
    }

    public String update(int id, String attribute, Object value, Connection connection) {

        String sql = "update employee set " + attribute + " =? where id=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            if (attribute.equals("age")) {
                preparedStatement.setInt(1, Integer.parseInt(value.toString()));
            } else {
                preparedStatement.setString(1, value.toString());
            }
            preparedStatement.setInt(2, id);

           int responce =  preparedStatement.executeUpdate();

           if (responce > 0) {
               return "Success update";
           }else{
               return "Unsuccess update";
           }

        } catch (Exception e) {
            return "Update Error : "+e.getMessage();
        }
    }

}

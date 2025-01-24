package org.example.operation;

import org.example.DTO.EmployeeDTO;
import org.example.DTO.UpdateDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class Update implements Operation {

    @Override
    public String operation(Object object, Connection connection) {
        try {
            UpdateDTO updateDTO = (UpdateDTO) object;
            return update(updateDTO.getId(),updateDTO.getAttribute(),updateDTO.getValue(),connection);
        }catch (Exception e){
            return e.getMessage();
        }

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

package org.example.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete implements Operation {

    Connection connection;

    public Delete(Connection connection) {
        this.connection = connection;
    }

    public Object operation(Object object) {
        try {
            int id = (Integer) object;
            return delete(id, this.connection);
        }catch (Exception e) {
            return e.getMessage();
        }

    }

    private String delete(int id, Connection conection) {
        String sql = "delete from employee where id = ?";

        try (PreparedStatement preparedStatement = conection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int responce = preparedStatement.executeUpdate();

            if (responce > 0) {
                return "Success delete";
            } else {
                return "Fail delete";
            }
        } catch (Exception e) {
            return "Error delete "+e.getMessage();
        }
    }
}

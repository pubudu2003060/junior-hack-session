package org.example.appComponent;

import org.example.DTO.UpdateDTO;
import org.example.operation.Operation;

import java.io.File;
import java.sql.SQLException;

public class UpdateImpl implements Component{

    private int id;
    private String attribute;
    private String value;

    UpdateDTO updateDTO = new UpdateDTO();

    @Override
    public int getComponent() {

        System.out.println();
        System.out.println("------Update Employee-----");
        System.out.print("Enter User Id : ");
        id = Integer.parseInt(input.getInput());
        System.out.print("Enter Attribute : ");
        attribute = input.getInput();
        System.out.print("Enter Value : ");
        value = input.getInput();

        updateDTO.setId(id);
        updateDTO.setAttribute(attribute);
        updateDTO.setValue(value);

        try {
            Operation operation = operationFactory.getOperation("update");
            String result = (String) operation.operation(updateDTO);
            System.out.println("*** "+result+" ***");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 1;
    }

}

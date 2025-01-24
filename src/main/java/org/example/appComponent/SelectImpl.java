package org.example.appComponent;

import org.example.operation.Operation;

import java.sql.SQLException;

public class SelectImpl implements Component{

    @Override
    public int getComponent() {
        System.out.println();
        System.out.println("------Select Employee-----");
        System.out.print("Enter Id to select: ");
        int inp = Integer.parseInt(input.getInput());

        try {
            Operation operation = operationFactory.getOperation("select");
            String result = (String) operation.operation(inp);
            System.out.println("*** "+result+" ***");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        return 1;
    }

}

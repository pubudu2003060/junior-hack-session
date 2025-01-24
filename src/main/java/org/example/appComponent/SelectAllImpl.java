package org.example.appComponent;

import org.example.operation.Operation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SelectAllImpl implements Component{

    @Override
    public int getComponent() {
        System.out.println();
        System.out.println("------Select All Employee-----");

        try {
            Operation operation = operationFactory.getOperation("selectall");
            List<String> result = (List<String>) operation.operation("1");

            for(String s : result){
                System.out.println(s);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        return 1;
    }

}


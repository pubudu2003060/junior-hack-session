package org.example.operation;

import org.example.DTO.EmployeeDTO;

import java.sql.Connection;

public interface Operation {

    Object operation(Object object, Connection connection);


}

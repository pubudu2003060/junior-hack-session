package org.example.operation;

import org.example.DTO.EmployeeDTO;

import java.sql.Connection;

public interface Operation {

    public String operation(EmployeeDTO employeeDTO, Connection connection);

}

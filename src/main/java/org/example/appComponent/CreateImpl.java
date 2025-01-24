package org.example.appComponent;

import org.example.DTO.EmployeeDTO;
import org.example.operation.Operation;

import java.sql.SQLException;

public class CreateImpl implements Component{

    private String name;
    private int age;
    private String salary;
    private String department;

    EmployeeDTO employee = new EmployeeDTO();


    @Override
    public int getComponent() {

        System.out.println("-------------------------");
        System.out.print("Enter name : ");
        name = input.getInput();
        System.out.print("Enter Age : ");
        age = Integer.parseInt(input.getInput());
        System.out.print("Enter Salary : ");
        salary = input.getInput();
        System.out.print("Enter Department : ");
        department = input.getInput();

        employee.setName(name);
        employee.setAge(age);
        employee.setSalary(salary);
        employee.setDepartment(department);

        try {
            Operation operation = operationFactory.getOperation("create");
            String result = (String) operation.operation(employee);
            System.out.println(result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-------------------------");

        return 1;
    }

}

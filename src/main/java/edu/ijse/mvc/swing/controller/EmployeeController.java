package edu.ijse.mvc.swing.controller;

import edu.ijse.mvc.swing.dto.EmployeeDto;
import edu.ijse.mvc.swing.model.EmployeeModel;

public class EmployeeController {

    private final EmployeeModel employeeModel = new EmployeeModel();

    public String addEmployee(EmployeeDto employeeDto) throws Exception{
        return employeeModel.saveEmployee(employeeDto);
    }

    public String updateEmployee(EmployeeDto employeeDto) throws Exception{
        return employeeModel.updateEmployee(employeeDto);
    }

    public String deleteEmployee(String id) throws Exception{
        return employeeModel.deleteEmployee(id);
    }
}

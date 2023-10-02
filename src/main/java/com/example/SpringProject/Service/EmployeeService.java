package com.example.SpringProject.Service;

import com.example.SpringProject.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    int addEmployee(EmployeeDTO employeeSaveDTO);

    List<EmployeeDTO> getAll();

    String updateEmployee(EmployeeDTO employeeUpdateDTO);

    boolean deleteEmployee(int id);
}

package com.example.SpringProject.Controller;


import com.example.SpringProject.DTO.EmployeeDTO;
import com.example.SpringProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @PostMapping(path="/save")
    public int save(@RequestBody EmployeeDTO employeeDTO){
        int id = employeeService.addEmployee(employeeDTO) ;
        System.out.println(id);
        return id ;
    }

    @GetMapping(path="/getAll")
    public List<EmployeeDTO> getAll(){
        List<EmployeeDTO> allemployees = employeeService.getAll();
        return allemployees ;
    }

    @PutMapping(path="/update")
    public String update(@RequestBody EmployeeDTO employeeDTO){
        String id = employeeService.updateEmployee(employeeDTO) ;
        return id ;
    }

    @DeleteMapping(path="/delete/{id}")
    public String delete(@PathVariable(value="id")int id){
        boolean deleteEmployee = employeeService.deleteEmployee(id) ;
        return "deleted" ;
    }

}

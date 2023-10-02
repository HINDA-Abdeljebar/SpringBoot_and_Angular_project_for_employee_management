package com.example.SpringProject.Service;

import com.example.SpringProject.DTO.EmployeeDTO;
import com.example.SpringProject.Entity.Employee;
import com.example.SpringProject.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo ;
    @Override
    public int addEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee(
                employeeDTO.getEmployeename(),
                employeeDTO.getEmployeeadress(),
                employeeDTO.getMobile()
        ) ;

        employeeRepo.save(employee) ;

        return employee.getEmployeeid();
    }

    @Override
    public List<EmployeeDTO> getAll() {
       List<Employee> employees = employeeRepo.findAll();

       List<EmployeeDTO> empoyeeListDto = new ArrayList<>();

       for(Employee e : employees){
           EmployeeDTO employeeDTO = new EmployeeDTO(
                   e.getEmployeeid(),
                   e.getEmployeename(),
                   e.getEmployeeadress(),
                   e.getMobile()
           );
           empoyeeListDto.add(employeeDTO);
       }
        return empoyeeListDto;
    }

    @Override
    public String updateEmployee(EmployeeDTO employeeDTO) {

        if(employeeRepo.existsById(employeeDTO.getEmployeeid())){
            Employee employee = employeeRepo.getById(employeeDTO.getEmployeeid());
            employee.setEmployeename(employeeDTO.getEmployeename());
            employee.setEmployeeadress(employeeDTO.getEmployeeadress());
            employee.setMobile(employeeDTO.getMobile());

            employeeRepo.save(employee);
        }
        else {
            System.out.println("Id not found!");
        }

        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {

        if(employeeRepo.existsById(id)){
            employeeRepo.deleteById(id);
        }
        else{
            System.out.println("id not found");
        }

        return true ;

}
}
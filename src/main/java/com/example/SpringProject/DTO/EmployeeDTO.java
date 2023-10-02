package com.example.SpringProject.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class EmployeeDTO {


    private int employeeid ;
    private String employeename ;
    private String employeeadress ;
    private int mobile ;

    public EmployeeDTO(int employeeid, String employeename, String employeeadress, int mobile){
        this.employeeid = employeeid ;
        this.employeename = employeename;
        this.employeeadress = employeeadress;
        this.mobile = mobile;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getEmployeeadress() {
        return employeeadress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setEmployeeadress(String employeeadress) {
        this.employeeadress = employeeadress;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}


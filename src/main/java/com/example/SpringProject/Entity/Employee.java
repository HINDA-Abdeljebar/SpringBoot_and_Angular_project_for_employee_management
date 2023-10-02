package com.example.SpringProject.Entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name="employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid ;
    @Column(name="employee_name")

    private String employeename ;
    @Column(name="employee_adress")

    private String employeeadress ;
    @Column(name="employee_mobile")

    private int mobile ;

    public Employee(String employeename, String employeeadress, int mobile) {
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

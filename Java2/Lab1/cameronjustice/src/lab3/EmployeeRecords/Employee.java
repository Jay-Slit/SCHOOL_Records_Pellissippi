/*
 * File: Employee
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package lab3.EmployeeRecords;

import java.time.LocalDate;




public class Employee {
    protected String employeeName;
    protected String employeeNumber;
    protected LocalDate hireDate;
    
    public Employee(String employeeName){
        this.employeeName = employeeName;
        this.employeeNumber = EmployeeIDManager.getID();
        hireDate = LocalDate.now();
    }
    
    public Employee(String employeeName, LocalDate hireDate){
        this.employeeName = employeeName;
        this.hireDate = hireDate;
        this.employeeNumber = EmployeeIDManager.getID();
    }
    
    public void removeEmployee(){
        employeeName = null;
        hireDate = null;
        employeeNumber = null;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }
    
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    
    public String getHireDate(){
        return hireDate.toString();
    }
    
    public void setEmployeeName(String newName){
        employeeName = newName;
    }
}

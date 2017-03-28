/*
 * File: ShiftSupervisor
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package lab3.EmployeeRecords;

import java.time.LocalDate;


public class ShiftSupervisor extends Employee {
    
    protected final int DEFAULT_SALARY = 40000;
    protected final int DEFAULT_BONUS = 1000;
    
    private int annualSalary;
    private int annualBonus;
    
    public ShiftSupervisor(String employeeName){
        super(employeeName);
        annualSalary = DEFAULT_SALARY;
        annualBonus = DEFAULT_BONUS;
    }
    
    public ShiftSupervisor(String employeeName, LocalDate hireDate){
        super(employeeName, hireDate);
        annualSalary = DEFAULT_SALARY;
        annualBonus = DEFAULT_BONUS;
    }
    
    public ShiftSupervisor(String employeeName, int annualSalary){
        super(employeeName);
        this.annualSalary = annualSalary;
        annualBonus = DEFAULT_BONUS;
    }
    
    public ShiftSupervisor(String employeeName, LocalDate hireDate, int annualSalary){
        super(employeeName, hireDate);
        this.annualSalary = annualSalary;
        annualBonus = DEFAULT_BONUS;
    }
    
    public ShiftSupervisor(String employeeName, LocalDate hireDate,
            int annualSalary, int annualBonus){
        
        super(employeeName);
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    public int getAnnualSalary(){
        return annualSalary;
    }
    
    public int getAnnualBonus(){
        return annualBonus;
    }
    
    public void setAnnualSalary(int newSalary){
        annualSalary = newSalary;
    }
    
    public void setAnnualBonus(int newBonus){
        annualBonus = newBonus;
    }
    
}

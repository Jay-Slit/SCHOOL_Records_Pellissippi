/*
 * File: ProductionWorker
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package lab3.EmployeeRecords;

import java.time.LocalDate;


public class ProductionWorker extends Employee {

    protected final double DEFAULT_PAY_RATE = 7.25;
    
    protected int shift;
    protected double payRate;
    
    public ProductionWorker(String employeeName, int shift){
        super(employeeName);
        verifyShift(shift);
        payRate = DEFAULT_PAY_RATE;
    }
    
    public ProductionWorker(String employeeName, int shift, double payRate){
        super(employeeName);
        verifyShift(shift);
        this.payRate = payRate;
    }
    
    public ProductionWorker(String employeeName, LocalDate hireDate, int shift){
        super(employeeName, hireDate);
        verifyShift(shift);
        payRate = DEFAULT_PAY_RATE;
    }
    
    public ProductionWorker(String employeeName, LocalDate hireDate,
            int shift, double payRate){
        super(employeeName, hireDate);
        verifyShift(shift);
        this.payRate = payRate;
    }
    
    public int getShift(){
        return shift;
    }
    
    public void setShift(int newShift){
        verifyShift(newShift);
    }
    
    protected void verifyShift(int shift){
        if(shift <= 1){
            this.shift = 1;
        }
        else{
            this.shift = 2;
        }
    }
    
}

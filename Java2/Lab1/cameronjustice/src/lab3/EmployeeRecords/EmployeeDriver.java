/*
 * File: EmployeeDriver
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package lab3.EmployeeRecords;

import java.util.concurrent.TimeUnit;


public class EmployeeDriver {

    
    public static void main(String[] args) throws InterruptedException{
        
        EmployeeIDManager.generateIDLists();
        
        TeamLeader sean = new TeamLeader("Sean", 1);
        ProductionWorker micheal = new TeamLeader("Micheal", 2);
        ShiftSupervisor sharon = new ShiftSupervisor("Sharon");
        
        System.out.println("Printing Information For: Sean");
        Thread.sleep(2000);
        
        
        System.out.println("Name: " + sean.getEmployeeName());
        System.out.println("ID: " + sean.getEmployeeNumber());
        System.out.println("Hire Date: " + sean.getHireDate());
        System.out.println("Shift: " + sean.getShift());
        System.out.println("Monthly Bonus: " + sean.getMonthlyBonus());
        System.out.println("Required Training Hours: " + sean.getRequiredTrainingHours());
        System.out.println("Attended Training Hours: " + sean.getTrainingHoursAttended());
        
        System.out.println("");
        
        System.out.println("Printing Information For: Micheal");
        Thread.sleep(2000);
        
        System.out.println("Name: " + micheal.getEmployeeName());
        System.out.println("ID: " + micheal.getEmployeeNumber());
        System.out.println("Hire Date: " + micheal.getHireDate());
        System.out.println("Shift: " + micheal.getShift());
        
        System.out.println("");
        
        System.out.println("Printing Information For: Sharon");
        Thread.sleep(2000);
        
        System.out.println("Name: " + sharon.getEmployeeName());
        System.out.println("ID: " + sharon.getEmployeeNumber());
        System.out.println("Hire Date: " + sharon.getHireDate());
        System.out.println("Annual Bonus: " + sharon.getAnnualBonus());
        System.out.println("Annual Salary: " + sharon.getAnnualSalary());
        
        System.out.println("");
        
        System.out.println("Testing ID System...");
        Thread.sleep(2000);
        
        System.out.println("I have created 1000 dummy employees."
                + " I will now print their IDs.");
        Thread.sleep(2000);
        
        for(int i = 0; i < 1000; i++){
            ProductionWorker bee = new ProductionWorker("WorkerBee", 1);
            System.out.println(bee.getEmployeeNumber());
        }
    }
}

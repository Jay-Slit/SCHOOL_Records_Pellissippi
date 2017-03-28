/*
 * File: EmployeeDriver
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package lab3.EmployeeRecords;


public class EmployeeDriver {

    
    public static void main(String[] args){
        
        EmployeeIDManager.generateIDLists();
        
        TeamLeader sean = new TeamLeader("Sean", 1);
        ProductionWorker micheal = new TeamLeader("Micheal", 2);
        ShiftSupervisor sharon = new ShiftSupervisor("Sharon");
        
        System.out.println(sean.getEmployeeName());
        System.out.println(sean.getEmployeeNumber());
        System.out.println(sean.getHireDate());
        System.out.println(sean.getShift());
        System.out.println(sean.getMonthlyBonus());
        System.out.println(sean.getRequiredTrainingHours());
        System.out.println(sean.getTrainingHoursAttended());
        
        System.out.println("");
        
        System.out.println(micheal.getEmployeeName());
        System.out.println(micheal.getEmployeeNumber());
        System.out.println(micheal.getHireDate());
        System.out.println(micheal.getShift());
        
        System.out.println("");
        
        System.out.println(sharon.getEmployeeName());
        System.out.println(sharon.getEmployeeNumber());
        System.out.println(sharon.getHireDate());
        System.out.println(sharon.getAnnualBonus());
        System.out.println(sharon.getAnnualSalary());
        
        System.out.println("");
        
        for(int i = 0; i < 1000; i++){
            ProductionWorker bee = new ProductionWorker("WorkerBee", 1);
            System.out.println(bee.getEmployeeNumber());
        }
    }
}

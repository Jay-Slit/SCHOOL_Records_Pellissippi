/*
 * File: TeamLeader
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package lab3.EmployeeRecords;

import java.time.LocalDate;


public class TeamLeader extends ProductionWorker {
    
    protected final int DEFAULT_HOURS_REQUIRED = 15;
    protected final int DEFAULT_MONTHLY_BONUS = 250;
    
    private int trainingHoursAttended;
    private int requiredTrainingHours;
    private int monthlyBonus;
    
    public TeamLeader(String employeeName, int shift){
        super(employeeName, shift);
        trainingHoursAttended = 0;
        requiredTrainingHours = DEFAULT_HOURS_REQUIRED;
        monthlyBonus = DEFAULT_MONTHLY_BONUS;
    }
    
    public TeamLeader(String employeeName, int shift, double payRate){
        super(employeeName, shift, payRate);
        trainingHoursAttended = 0;
        requiredTrainingHours = DEFAULT_HOURS_REQUIRED;
        monthlyBonus = DEFAULT_MONTHLY_BONUS;
    }
    
    public TeamLeader(String employeeName, LocalDate hireDate, int shift){
        super(employeeName, hireDate, shift);
        trainingHoursAttended = 0;
        requiredTrainingHours = DEFAULT_HOURS_REQUIRED;
        monthlyBonus = DEFAULT_MONTHLY_BONUS;
    }
    
    public TeamLeader(String employeeName, LocalDate hireDate,
            int shift, double payRate){
        super(employeeName, hireDate, shift, payRate);
        trainingHoursAttended = 0;
        requiredTrainingHours = DEFAULT_HOURS_REQUIRED;
        monthlyBonus = DEFAULT_MONTHLY_BONUS;
    }
    
    public TeamLeader(String employeeName, int shift,
            double payRate, int requiredTrainingHours){
        super(employeeName, shift, payRate);
        trainingHoursAttended = 0;
        this.requiredTrainingHours = requiredTrainingHours;
        monthlyBonus = DEFAULT_MONTHLY_BONUS;
    }
    
    public TeamLeader(String employeeName, int shift,
            double payRate, int requiredTrainingHours, int monthlyBonus){
        super(employeeName, shift, payRate);
        trainingHoursAttended = 0;
        this.requiredTrainingHours = requiredTrainingHours;
        this.monthlyBonus = monthlyBonus;
    }
    
    public int getRequiredTrainingHours(){
        return this.requiredTrainingHours;
    }
    
    public int getTrainingHoursAttended(){
        return this.trainingHoursAttended;
    }
    
    public int getMonthlyBonus(){
        return monthlyBonus;
    }
    
    public void setTrainingHoursAttended(int newHours){
        this.trainingHoursAttended = newHours;
    }
            
}

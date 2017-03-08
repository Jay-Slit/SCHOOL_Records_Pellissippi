
/**
 * File: DriverExamTest
 * Author: Cameron Justice
 * Date: Feb 20, 2017
 * Summary: A test interface for the DriverExam program
*/

package lab2.DriverExam;

import java.util.ArrayList;
import java.util.List;

public class DriverExamTest {
    
    private static List<Character> userAnswers = new ArrayList<Character>();
    
    private static DriverExam driver;
    
    public static void main(String[] args){
        System.out.println("Welcome to the Driver's Exam Grading Program."
                + "You will now input the user's answers.");
        
        driver = new DriverExam();
        
        //collect user answers
        userAnswers = driver.getUserAnswers();
        //determine passed status
        boolean passed = driver.determinePassed();
        
        //output result
        if(passed){
            System.out.println("Congratulations, the user passed.");
            if(driver.totalIncorrect > 0){
                System.out.println("The user missed: ");
                List<Integer> incorrect = driver.getIncorrectQuestions();
                for(int i = 0; i < incorrect.size(); i++){
                    System.out.println("Question #" + incorrect.get(i));
                }
            }
        }
        else{
            System.out.println("Unfortunately, the user failed.");
            System.out.println("The user missed: ");
                List<Integer> incorrect = driver.getIncorrectQuestions();
                for(int i = 0; i < incorrect.size(); i++){
                    System.out.println("Question #" + incorrect.get(i));
                }
        }
    }
    
}

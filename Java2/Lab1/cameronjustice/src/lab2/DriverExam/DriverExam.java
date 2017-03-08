
/**
 * File: DriverExam
 * Author: Cameron Justice
 * Date: Feb 20, 2017
 * Summary: A grading program for a Driver's Exam or any other Exam using ABCD
*/

package lab2.DriverExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DriverExam {
    
    private final int NUMBER_OF_QUESTIONS = 20;
    
    int totalIncorrect = 0;
    
    private char[] correctAnswers = {
                'b','d','a','a','c',
                'a','b','a','c','d',
                'b','c','d','a','d',
                'c','c','b','d','a'};
    private List<Character> userAnswers = new ArrayList<Character>();
    private List<Integer> correctQuestions = new LinkedList<Integer>();
    private List<Integer> incorrectQuestions = new LinkedList<Integer>();
    
    private Validation.Input inputValidator;
    
    //Loops throgh NUMBER_OF_QUESTIONS times and gets an answer for each
    public List<Character> getUserAnswers(){
        inputValidator = new Validation.Input();
        for(int i = 0; i < NUMBER_OF_QUESTIONS; i++){
            userAnswers.add(inputValidator.getValidTestAnswer(
                    "Answer to question #" + (i+1)));
        }
        
        return userAnswers;
    }
    
    public boolean determinePassed(){
        int totalCorrect = calculateTotalCorrect(NUMBER_OF_QUESTIONS);
        totalIncorrect = calculateTotalIncorrect(totalCorrect, NUMBER_OF_QUESTIONS);
        
        return (totalIncorrect >= NUMBER_OF_QUESTIONS * .75);
    }
    
    public List getIncorrectQuestions(){
        return incorrectQuestions;
    }
    
    private int calculateTotalCorrect(int questionAmount){
        int totalCorrect = 0;
        //Compare each answer to correctAnswer and determine correct status
        for(int i = 0; i < questionAmount; i++){
            if(correctAnswers[i] == userAnswers.get(i)){
                correctQuestions.add(i);
                totalCorrect++;
            }
            else {
                incorrectQuestions.add(i);
            }
        }
        
        return totalCorrect;
    }
    
    private int calculateTotalIncorrect(int totalCorrect, int questionAmount){
        return questionAmount - totalCorrect;
    }
    
}


/**
 * File: Input
 * Author: Cameron Justice
 * Date: Feb 20, 2017
 * 
*/

package Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    
    private Scanner input;
    private List<Character> validAnswers = new ArrayList<>();
    
    public Input(){
        input = new Scanner(System.in);
        validAnswers.add('a');
        validAnswers.add('b');
        validAnswers.add('c');
        validAnswers.add('d');
    }
    
    public char getValidTestAnswer(){
        boolean valid = false;
        char answer = 0;
        while(valid != true){
            answer = input.next().toLowerCase().charAt(0);
            
            for(char validAnswer : validAnswers){
                if(answer == validAnswer){
                    valid = true;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    public char getValidTestAnswer(String question){
        boolean valid = false;
        char answer = 0;
        while(valid != true){
            System.out.println(question);
            answer = input.next().charAt(0);
            
            for(char validAnswer : validAnswers){
                if(answer == validAnswer){
                    valid = true;
                    break;
                }
            }
            
        }
        
        return answer;
    }
}

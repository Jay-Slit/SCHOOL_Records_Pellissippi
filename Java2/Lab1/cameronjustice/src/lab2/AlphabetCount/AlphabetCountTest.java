
/**
 * File: AlphabetCountTest
 * Author: Cameron Justice
 * Date: Feb 20, 2017
 * Summary: Test interface for the AplhabetCount program
*/

package lab2.AlphabetCount;

import java.util.Scanner;

public class AlphabetCountTest {
    
    private static Scanner input;
    private static AlphabetCount counter;
    
    public static void main(String[] args){
        
        input = new Scanner(System.in);
        counter = new AlphabetCount();
        
        System.out.println("Welcome to Alphabet Count.\nI'll count any line you"
                + " give me and tell you how many times each letter occurs.");
        System.out.println("Enter your line now: ");
        
        counter.countString(input.nextLine());
    }
    
}

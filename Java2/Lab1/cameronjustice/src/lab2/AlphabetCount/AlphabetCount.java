
/**
 * File: AlphabetCount
 * Author: Cameron Justice
 * Date: Feb 20, 2017
 * Summary: Takes a string and finds how often each letter of the alphabet occurs
*/

package lab2.AlphabetCount;

import java.util.ArrayList;
import java.util.List;

public class AlphabetCount {
    
    private final int LETTERS_IN_ALPHABET = 26;
    private final int ASCII_START_POSITION = 97;
    
    //List to store how often a letter occurs
    private List<Integer> occurrences;
    
    public void countString(String input){
        occurrences = new ArrayList<>();
        determineOccurrences(input);
        
        //loop through and print # of occurrences
        for(int i = 0; i < LETTERS_IN_ALPHABET; i++){
            System.out.println((char)(i + ASCII_START_POSITION) + 
                               " occurs " + occurrences.get(i));
        }
    }
    
    private void determineOccurrences(String input){
        input = input.toLowerCase();
        //outer loop runs through all letters
        for(int i = 0; i < LETTERS_IN_ALPHABET; i++){
            int occurrence = 0;
            //inner loop runs through each character in string
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j) == (i + ASCII_START_POSITION)){
                    occurrence++;
                }
            }
            //add number of occurences to the list at the same index as they're run through
            occurrences.add(occurrence);
        }
    }
    
}

/*
 * Author: Cameron Justice
 * Program Title: Problem2
 * Program Summary: Display the use of the ArrayLab class.
 */
package lab7;

import java.util.Scanner;

public class Problem2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] testArray = new int[6];
        
        for(int i = 0; i < 6; i++){
            System.out.println("Enter Next Array Number: ");
            testArray[i] = input.nextInt();
        }
        
        ArrayLab aLab = new ArrayLab();
        
        aLab.printArray(testArray);
        
        int[] distinct = aLab.distinctArray(testArray);
        
        aLab.printArray(distinct);
        
    }
}

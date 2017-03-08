/*
 * Author: Cameron Justice
 * Program Title: Problem1
 * Program Summary: Calculate whether a 3-sided shape of given inputs is a triangle.
 */
package lab5;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Number 1: ");
        double numOne = input.nextDouble();
        
        System.out.println("Enter Number 2: ");
        double numTwo = input.nextDouble();
        
        System.out.println("Enter Number 3: ");
        double numThree = input.nextDouble();
        
        displaySortedNumbers(numOne,numTwo,numThree);
    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double lowestNumber = 0;
        double mediumNumber = 0;
        double highestNumber = 0;
        
        if(num1 <= num2 && num1 <= num3){
            lowestNumber = num1;
            if(num2 <= num3){
                mediumNumber = num2;
                highestNumber = num3;
            }
            else{
                mediumNumber = num3;
                highestNumber = num2;
            }
        }
        else if(num2 <= num1 && num2 <= num3){
            lowestNumber = num2;
            if(num1 < num3){
                mediumNumber = num1;
                highestNumber = num3;
            }
            else{
                mediumNumber = num3;
                highestNumber = num1;
            }
        }
        else{
            lowestNumber = num3;
            if(num1 <= num2){
                mediumNumber = num1;
                highestNumber = num2;
            }
            else{
                mediumNumber = num2;
                highestNumber = num1;
            }
        }
        
        System.out.println(lowestNumber);
        System.out.println(mediumNumber);
        System.out.println(highestNumber);
    }
}

/*
 * Author: Cameron Justice
 * Program Title: Problem3
 * Program Summary:
 */
package Lab1;

//Imports
import java.util.Scanner;

public class Problem3 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        print("Enter the length: ");
        double length = input.nextDouble();
        
        print("Enter the width: ");
        double width = input.nextDouble();
        
        double area = length * width;       
        double perimeter = (length * 2) + (width * 2);
        System.out.format("The area of a rectangle with length %.2f and width %.2f is: %.2f\n", length, width, area);
        System.out.format("The perimeter of a rectangle with length %.2f and width %.2f is: %.2f\n", length, width, perimeter);
    }
    
    //Shorthanded print function
    public static void print(String toPrint){
        System.out.println(toPrint);
    }
}

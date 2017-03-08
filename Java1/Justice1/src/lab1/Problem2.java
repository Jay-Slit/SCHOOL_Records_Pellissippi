/*
 * Author: Cameron Justice
 * Program Title: Program 2
 * Program Summary: Print an image using a design of characters.
 */
package lab1;

public class Problem2 {
    public static void main(String []args){
        PrintImage();
    }
    
    //Shorthanded print function
    public static void print(String toPrint){
        System.out.println(toPrint);
    }
    
    public static void PrintImage(){
        print("    *    ");
        print("   ***   ");
        print("  *****  ");
        print(" ******* ");
        print("*********");
        print(" ******* ");
        print("  *****  ");
        print("   ***   ");
        print("    *    ");
    }
}

/*
 * Author: Cameron Justice
 * Program Title: Problem1
 * Program Summary: Print multiple forms of "Java Programming Language"
 */
package lab1;

public class Problem1 {
    
    public static void main(String []args){
        SingleLinePrint();
        MultiLinePrint();
        BoxedPrint();
    }
    
    //Shorthanded print function
    public static void print(String toPrint){
        System.out.println(toPrint);
    }
    
    public static void SingleLinePrint(){
        print("Java Programming Language");
    }
    
    public static void MultiLinePrint(){
        print("Java");
        print("Programming");
        print("Language");
    }
    
    public static void BoxedPrint(){
        print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        print("@  Java Programming Language  @");
        print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}

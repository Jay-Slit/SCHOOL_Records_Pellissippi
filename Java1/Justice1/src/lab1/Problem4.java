/*
 * Author: Cameron Justice
 * Program Title: 
 * Program Summary:
 */
package lab1;

//imports
import javax.swing.JOptionPane;

public class Problem4 {
    public static void main(String []args){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Integer #1:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Integer #2:"));
        
        double average = (num1 + num2) / 2;
        
        String output = "The average is: " + average;
        
        JOptionPane.showMessageDialog(null, output);
    }
}

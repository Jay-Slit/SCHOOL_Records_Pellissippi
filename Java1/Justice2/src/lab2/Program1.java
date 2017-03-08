/*
 * Author: Cameron Justice
 * Program Title: Program2
 * Program Summary: Formulate Quadratic Equation based on user input.
 */
package lab2;

//imports
import java.lang.Math;
import javax.swing.JOptionPane;

public class Program1 {
    static double a,b,c;
    static double discriminant;
    
    
    public static void main(String[] args) {
        getInput();
        
        calculateDiscriminant();
        
        int n = checkDiscriminant();
        
        if(n == 2)
            getTwoRoots();
        else if(n == 1)
            getOneRoot();
        else
            noRoots();
    }
    
    public static void getInput(){
        a = Double.parseDouble(JOptionPane.showInputDialog("A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("C:"));
    }
    
    public static void calculateDiscriminant(){
        discriminant = ((Math.pow(b, 2))+(-4*(a)*(c)));
    }
    
    public static int checkDiscriminant(){
        if(discriminant > 0)
            return 2;
        else if(discriminant == 0)
            return 1;
        else if(discriminant < 0)
            return 0;
        
        return 0;
    }
    
    public static void getTwoRoots(){
        double root1 = (-b + Math.sqrt(discriminant))/(2*a);
        double root2 = (-b - Math.sqrt(discriminant))/(2*a);
        
        JOptionPane.showMessageDialog(null, "Root 1: " + root1 + ", Root 2: " + root2);
    }
    
    public static void getOneRoot(){
        double root1 = (-b)/(2*a);
        JOptionPane.showMessageDialog(null, "Root: "  + root1);
    }
    
    public static void noRoots(){
        JOptionPane.showMessageDialog(null, "No real roots.");
    }
}

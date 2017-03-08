/*
 * Author: Cameron Justice
 * Program Title: Program1
 * Program Summary:
 */
package lab3;

//Imports
import java.lang.Math;

public class Problem1 {
    //Hold integer values for use in loop
    static double[] values = {0, 30, 45, 60};
    //Hold title values for use in loop
    static String[] titles = {"Angle", "Sin", "Cos", "Tan"};
    //Array of values used to discern info line from divider line
    static byte[] comparePoint = {0, 2, 6};
    //Current point in usage
    static byte placePoint = 0;
    //Boolean to report if info line or divider line
    static boolean divider = false;
    
    static byte lineLength = 50;
    
    public static void main(String[] args){
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < comparePoint.length; j++){
                divider = (i == comparePoint[j]);
                if(divider == true)
                    break;
            }
            //If this line is a divider, print accordingly
            if(divider == true){
                String output = "";
                
                for(int j = 0; j < lineLength; j++){
                    output += "=";
                }
                
                System.out.println(output);
            }
            //Otherwise print info line
            else if(divider == false){
                switch (placePoint) {
                    case 0:
                        System.out.printf("%-10s %-10d %-10d %-10d %-6d\n", titles[placePoint],
                                (int)values[0], (int)values[1], (int)values[2], (int)values[3]);
                        placePoint++;
                        break;
                    case 1:
                        System.out.printf("%-10s %-10.4f %-10.4f %-10.4f %-6.4f\n", titles[placePoint],
                                sin(values[0]), sin(values[1]), sin(values[2]), sin(values[3]));
                        placePoint++;
                        break;
                    case 2:
                        System.out.printf("%-10s %-10.4f %-10.4f %-10.4f %-6.4f\n", titles[placePoint],
                                cos(values[0]), cos(values[1]), cos(values[2]), cos(values[3]));
                        placePoint++;
                        break;
                    case 3:
                        System.out.printf("%-10s %-10.4f %-10.4f %-10.4f %-6.4f\n", titles[placePoint],
                                tan(values[0]), tan(values[1]), tan(values[2]), tan(values[3])); 
                        placePoint++;
                        break;
                    default:
                        break;
                }
            }
        }     
    }
    
    public static double sin(double input){
        return Math.sin(Math.toRadians(input));
    }
    
    public static double cos(double input){
        return Math.cos(Math.toRadians(input));
    }
    
    public static double tan(double input){
        return Math.tan(Math.toRadians(input));
    }
}
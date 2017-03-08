
/**
 * File: PaintJobEstimator
 * Author: Cameron Justice
 * Date: Jan 18, 2017
 * This program estimates the total cost to paint an area.
*/

package lab1.lab1_b;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PaintJobEstimator {
    private static final double PRICE_PER_WORK_HOUR = 18.00;
    private static final double SQFT_PER_WORK_HOUR = 14.375;
    private static final int SQFT_PER_GALLON = 115;
    
    private static Scanner input;
    
    public static void main(String[] args){
        input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(
                Locale.getDefault());
        
        int rooms = getRooms();
        int sqft = getSquareFeet(rooms);
        double total = getTotal(sqft);
        
        //Print out total
        System.out.println("The entire project would cost " + 
                currency.format(total));
    }
    
    private static int getRooms(){
        System.out.println("How many rooms need painted? ");
        return input.nextInt();
    }
    
    private static int getSquareFeet(int rooms){
        int sqft = 0;
        for(int i = 0; i < rooms; i++){
            System.out.println("What is the square feet of room " + (i+1) + "? ");
            sqft += input.nextInt();
        }
        
        return sqft;
    }
    
    private static double getPricePerGallon(){
        System.out.println("What is the price per gallon for your paint? ");
        return input.nextDouble();
    }
    
    private static double getPaintCost(double pricePerGallon, double sqft){
        double gallonsNeeded = sqft / SQFT_PER_GALLON;
        return gallonsNeeded * pricePerGallon;
    }
    
    private static double getLaborCost(double sqft){
        double workHours = sqft / SQFT_PER_WORK_HOUR;
        return workHours * PRICE_PER_WORK_HOUR;
    }
    
    private static double getTotal(double sqft){
        double pricePerGallon = getPricePerGallon();
        
        double paintCost = getPaintCost(pricePerGallon, sqft);
        
        double laborCost = getLaborCost(sqft);
        
        return paintCost + laborCost;
                
    }
}

//End Date: January 18th, 2017
//End Time: 2:31:19pm

/*Observations:
  *Very clean
  *Calculations could be squished into one return line, but this is fine
  *for readability 
*/

//Cleanliness:   5/5
//Formality:     5/5
//Readability:   5/5
//Working State: 5/5


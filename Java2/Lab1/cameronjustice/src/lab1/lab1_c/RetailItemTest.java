
/**
 * File: RetailItemTest
 * Author: Cameron Justice
 * Date: Jan 18, 2017
 * Test RetailItem
*/

package lab1.lab1_c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetailItemTest {
    
    private static Scanner input;
    
    public static void main(String[] args){
        input = new Scanner(System.in);
        
        List<RetailItem> items = new ArrayList<>();
        
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        items.add(item1);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        items.add(item2);
        
        String desc = getUserDesc();
        int units = getUserUnits();
        double price = getUserPrice();
        
        RetailItem item3 = new RetailItem(desc,units,price);
        items.add(item3);
        
        for(RetailItem item : items){
            item.printItemInfo();
        }
    }
    
    private static String getUserDesc(){
        System.out.println("Enter a description for the item.");
        return input.nextLine();
    }
    
    private static int getUserUnits(){
        //Keep asking until the user enters a valid number
        int units = 0;
        do{
            System.out.println("Enter the amount of units for the item.");
            while(!input.hasNextInt()){ //hasNextInt DOES NOT jump to next input
                System.out.println("I need a positive whole number. "
                        + "Please try again.");
                input.next(); //Jump to next input
            }
            units = input.nextInt();
        }while(units <= 0);
        
        return units;
    }
    
    private static double getUserPrice(){
        //Keep asking until the user enters a valid number  
        double price = 0;
        do{
            System.out.println("Enter the price for the item in #.## format.");
            while(!input.hasNextDouble()){//hasNextDouble DOES NOT jump to next
                System.out.println("I need a positive price."
                        + " Please try again.");
                input.next(); //jump to next input
            }
            price = input.nextDouble();
        }while(price <= 0.0);
        
        return price;
    }
    
}

//End Date: January 18th, 2017
//End Time: 2:015:51pm

/*Observations:
  *Could be cleaner, maybe comment a bit more?
  *Maybe export user input to outside class to handle getting multiple items?
  *Could also do for loop, might be more readable
*/

//Cleanliness:   5/5
//Formality:     5/5
//Readability:   5/5
//Working State: 5/5
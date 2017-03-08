
/**
 * File: Item
 * Author: Cameron Justice
 * Date: Jan 18, 2017
 * Obj-Ori Item representation
*/

package lab1.lab1_c;

import java.text.NumberFormat;
import java.util.Locale;

public class RetailItem {
    
    private String desc;
    private int unitsOnHand;
    private double price;
    
    //--Constructors--
    
    public RetailItem(){
        this.desc = "";
        this.unitsOnHand = 1;
        this.price = 0.0;
    }
    
    public RetailItem(String _desc){
        this.desc = _desc;
        this.unitsOnHand = 1;
        this.price = 0.0;
    }
    
    public RetailItem(String _desc, int _unitsOnHand){
        this.desc = _desc;
        this.unitsOnHand = _unitsOnHand;
        this.price = 0.0;
    }
    
    public RetailItem(String _desc, int _unitsOnHand, double _price){
        this.desc = _desc;
        this.unitsOnHand = _unitsOnHand;
        this.price = _price;
    }
    
    //---Accessor Methods
    
    public String getDesc(){
        return desc;
    }
    
    public void setDesc(String newDesc){
        desc = newDesc;
    }
    
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    
    public void setUnitsOnHand(int newUnitsOnHand){
        unitsOnHand = newUnitsOnHand;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double newPrice){
        if(price >= 0){
            price = newPrice;
        }
        else{
            price = 0;
        }
    }   
    
    public void printItemInfo(){
        NumberFormat currency = NumberFormat.getCurrencyInstance(
                Locale.getDefault());
        System.out.format("%s: %d units and "
                + "costs %s\n", desc,unitsOnHand,currency.format(price));
    }
}

//End Date: January 18th, 2017
//End Time: 1:59:04pm

/*Observations:
  *Perfect
*/

//Cleanliness:   5/5
//Formality:     5/5
//Readability:   5/5
//Working State: 5/5



/**
 * File: Item
 * Author: Cameron Justice
 * Date: Jan 18, 2017
 * Obj-Ori Item representation for use in SpendingSpree
*/

package lab1.lab1_a;

public class Item {
    
    private int id;
    private String itemName;
    private int price; //Can be changed to float if needed
    
    // For value clamping on set change
    final private int MIN_PRICE = 1; 
    final private int MAX_PRICE = 200; 
    
    public Item(String _itemName, int _price){
        this.itemName = _itemName;
        this.price = _price;
    }
    
    //---Accessor Methods
    public int getId(){
        return id;
    }
    
    public void setId(int newId){
        id = newId;
    }
    
    public String getName(){
        return itemName;
    }
    
    public void setName(String newName){
        itemName = newName;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int newPrice){
        //Check that new price does not exceed bounds
        //If so, clamp, if not, assign
        if(newPrice < MIN_PRICE){
            price = MIN_PRICE;
        }
        else if(newPrice > MAX_PRICE){
            price = MAX_PRICE;
        }
    }   
}

//End Date: January 18th, 2017
//End Time: 1:04:03pm

/*Observations:
  *Very clean
  *Comments where needed, functions explain themselves
*/

//Cleanliness:   5/5
//Formality:     5/5
//Readability:   5/5
//Working State: 5/5


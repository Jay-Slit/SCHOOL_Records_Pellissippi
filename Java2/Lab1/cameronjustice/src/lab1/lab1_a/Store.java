
/**
 * File: Store
 * Author: Cameron Justice
 * Date: Jan 18, 2017
 * Obj-Ori Store representation for use in SpendingSpree
*/

package lab1.lab1_a;

import java.util.Arrays;
import java.util.LinkedList;

public class Store {
    
    private String storeName;
    private String storeDesc = ""; //Not required
    //List to store all items,
    //Possible conversion to ArrayList if items grows past byte range
    //At this time, LinkedList allows for better performance
    //Due to continuos insertion
    LinkedList<Item> items;
    
    public Store(String _storeName){
        this.storeName = _storeName;
        this.items = new LinkedList<>();
    }
    
    //Add new item to store list
    public void addItem(Item item){
        //Try catch block to deal with sorting the items on creation
        try{
            //place item at the end of list
            items.addLast(item);
            //assign item id equivalent
            item.setId(items.size());
        }
        catch(IndexOutOfBoundsException error){
            System.out.println(Arrays.toString(error.getStackTrace()));
        }
    }
    
    public Item[] getAllItems(){
        return items.toArray(new Item[items.size()]);
    }
    
    //--Accessor Methods
    public String getStoreName(){
        return storeName;
    }
    
    public void setStoreName(String newStoreName){
        storeName = newStoreName;
    }
    
    public String getStoreDesc(){
        return storeDesc;
    }
    
    public void setStoreDesc(String newStoreDesc){
        storeDesc = newStoreDesc;
    }
}

//End Date: January 18th, 2017
//End Time: 12:46:14pm

/*Observations:
  *Very clean
  *Method names perfect
  *Comments where needed, functions explain themselves
*/

//Cleanliness:   5/5
//Formality:     5/5
//Readability:   5/5
//Working State: 5/5

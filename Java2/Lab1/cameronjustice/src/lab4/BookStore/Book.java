/*
 * File: Book
 * Author: Cameron Justice
 * Date: Apr 25, 2017
 * Summary:
*/
package lab4.BookStore;


public class Book {
    
    private String title = null;
    private String price = null;
    
    public String getTitle(){
        return title;
    }
    
    public String getPrice(){
        return price;
    }
    
    public void setTitle(String newTitle){
        title = newTitle;
    }
    
    public void setPrice(String newPrice){
        price = newPrice;
    }
}

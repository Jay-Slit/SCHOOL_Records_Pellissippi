/**
 * File: SpendingSpree
 * Author: Cameron Justice
 * Date: Jan 18, 2017
 * Guide the user through shopping with their gift card
 */
package lab1.lab1_a;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TODO: Create an Answer Comparison function to refactor switch cases
public class SpendingSpree {
    final private static int CERTIFICATE_AMOUNT = 200;
    final private static int MAX_PURCHASES = 3;
    final private static String EXIT_STRING = "q";
    
    private static int amountRemaining;
    private static Store currentStore;
    private static int storeSize;
    private static boolean stayInStore = false;
    
    //List to keep all stores
    private static List<Store> stores = new ArrayList<>();
    
    private static String[] storeNames;
    private static List<Item> itemsBought = new ArrayList<>();;
    
    private static Scanner input;
    
    public static void main(String[] args){
        
        amountRemaining = CERTIFICATE_AMOUNT;
        
        //If any new stores need added, put them in this function
        createStores();
        
        //Must be at the end of the stores creation
        storeSize = stores.size();
        
        //Updatable String object to limit memory usage
        //Downsides: readability falters
        String message = "Welcome to your shopping spree! You've won" +
                " a $200 gift card to any store in our mall!\nCareful though" +
                ", you have $200, but you can only buy a max of 3 items." +
                " Spend wisely!";
        System.out.println(message);
        
        message = "Would you like to start your shopping spree now? [Y/n] ";
        System.out.print(message);
        
        //Use for user input
        input = new Scanner(System.in);
        
        //Keep track of user's reluctance to continue
        boolean keepShopping = false;
        
        String answer = input.nextLine();
        char choice = answer.toLowerCase().charAt(0);
        
        //Check if the user wants to continue or not
        keepShopping = choice == 'y';
        
        //Store all stores
        storeNames = new String[storeSize];
        for(int i = 0; i < storeSize; i++){
            storeNames[i] = stores.get(i).getStoreName();
        }
        
        //Main loop for shopping
        while(keepShopping == true){
            keepShopping = mainGameLoop();
        }
        
        exitGame();
    }
    
    //Function used for the shopping loop
    private static boolean mainGameLoop(){
        
        //WARNING: Possible Recursive Function
        if(stayInStore == false){
            System.out.println("What store do you want to visit? Enter " + 
                            EXIT_STRING + " at any" +
                           " time to end your shopping spree.\n");
            chooseStore(storeNames);
        }
        
        Item[] items = currentStore.getAllItems();
        int[] itemIDs = new int[items.length];
        
        //Store item names for choice comparison
        for (int i = 0; i < itemIDs.length; i++){
            itemIDs[i] = items[i].getId();
        }
        
        
        //WARNING: Possible Recursive Function
        chooseItem(items, itemIDs);
        
        if(itemsBought.size() == 3){
            return false;
        }
        else return amountRemaining != 0;
    }
    
    //Take in user input and 
    private static void chooseItem(Item[] items, int[] itemIDs){
        
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());
        
        System.out.println("You have " + currency.format(amountRemaining) +
                " remaining.");
        
        //Possible Addition: run-time loop to find largest string size
        //To avoid overflow
        System.out.format("\n%-10s %-20s %-7s", "ID", "Name", "Price");
        for(Item item : items){
            System.out.format("\n%-10d %-20s %-7s", item.getId(), item.getName()
                    , currency.format(item.getPrice()));
        }
        
        System.out.println("\n\nEnter the id of the item you want to buy, or"
                + " enter \"back\" to change stores.\n As always, you can enter"
                + " " + EXIT_STRING + " to end your shopping spree.");
        
        //Take the answer and parse to string
        char answer = input.nextLine().toLowerCase().charAt(0);
        String choice = String.valueOf(answer);
        
        //Try to parse to int, if it works then move to purchasing
        //If not, decide whether to quit, change store, or try again
        try{
            int idChoice = Integer.parseInt(choice);
            
            //Find which item they selected
            for(int i = 0; i < itemIDs.length; i++)
            {
                if(idChoice == items[i].getId()){
                    if((amountRemaining - items[i].getPrice() < 0)){
                        System.out.println("You can't afford that.");
                        stayInStore = true;
                    }
                    else{
                        //Make the user confirm their purchase
                        System.out.println("Are you sure you want to buy " + 
                            items[i].getName() + "? [Y/n]");
                        answer = input.nextLine().toLowerCase().charAt(0);
                        switch (answer) {
                            case 'y':
                                amountRemaining -= items[i].getPrice();
                                itemsBought.add(items[i]);
                                if(amountRemaining != 0){
                                    System.out.println("Do you want to choose "
                                        + " another store?");
                                    answer = input.nextLine().toLowerCase().charAt(0);
                                }
                                else {
                                    //allow the switch to run, returning false
                                    answer = 'y';
                                }
                                switch(answer){
                                    case 'y':
                                        stayInStore = false;
                                        break;
                                    case 'q': 
                                        exitGame();
                                        break;
                                    default:
                                        stayInStore = true;
                                        break;
                                }
                                break;
                            case 'q':
                                exitGame();
                                break;
                            default:
                                stayInStore = false;
                                break;
                        }
                    }
                    //End the loop early
                    break;
                }
            }
        }
        catch(NumberFormatException error){
            switch(answer){
                case 'q':
                    exitGame();
                    break;
                case 'b':
                    stayInStore = false;
                    break;
                default:
                    System.out.println("I don't recognize that answer. Please"
                            + " try again.");
                    chooseItem(items, itemIDs);
                    break;
            }
        }
        
    }
    
    //Take in user input and decide which store it is
    //WARNING: Possible Recursive Function
    private static void chooseStore(String[] storeNames){
        
        //Must be set to null to allow for full-case exits
        currentStore = null;
        //Hold chosen store name
        String chosenStoreName = "";

        //Print all store names
        for(int i = 0; i < storeSize; i++){
            System.out.println(storeNames[i]);
        }
        
        System.out.print("\n");
        
        //Get Store choice
        String answer = input.nextLine();
        answer = answer.toLowerCase();
        
        if(answer.equals(EXIT_STRING)){
            exitGame();
        }
        
        //Loop through until it finds a match
        //Best case O(1) Worst Case O(n)
        //Change to search split if storeNames is greater than 46
        //List iteration, pre java8
        //For java8 only capability, use forEach lambda operator
        for (String storeName : storeNames) {
            if (answer.equals(storeName.toLowerCase())) {
                chosenStoreName = storeName;
                //Break could be moved back here for clarity
            } else {
                //Just skip the break
                continue;
            }
            //Cancel the for loop early to preserve performance
            break;
            //NOTE: The else/break is slightly redundant
            //I ran into a corner-case during testing when there was more here
            //That met the if-statement, but kept running past that, so I added
            //The else and outed the break to meet all cases
        }
        
        //If they didn't input anything, or they didn't put in a store name,
        //Ask again
        //WARNING: Recursive Function
        if(chosenStoreName.equals("")){
            System.out.println("Sorry, I can't find that store."
                    + " Try again, please.\n");
            chooseStore(storeNames);
        }
        
        //Loop through stores to assign store name
        //List iteration, pre java8
        //For java8 only capability, use forEach lambda operator
        for(Store store : stores){
            if(store.getStoreName().equals(chosenStoreName)){
                currentStore = store;
            }
        }
    }
    
    //Refactored store creation, add new stores here
    private static void createStores(){
        
        /*
            Style Guide: Store Creation
            //--Store Name--//
            Create store
            Add items
            Add store to stores list
        */
        
        
        //--JC Dollar--//
        Store jcDollar = new Store("JC Dollar");
        jcDollar.setStoreDesc("A clothing store for the mid-range shopper!");
        jcDollar.addItem(new Item("Designer Pink Shirt", 40));
        jcDollar.addItem(new Item("Low-Cut Jeans", 50));
        jcDollar.addItem(new Item("Bedazzled Beanie", 80));
        stores.add(jcDollar);
        
        //--JJ Fredds--//
        Store jjFredds = new Store("JJFredd\'s");
        jjFredds.setStoreDesc("A High-Tech retailer with the lowest prices"+
                              " this side of the river!");
        jjFredds.addItem(new Item("80\" Plasma TV", 180));
        jjFredds.addItem(new Item("GBox Game Console", 100));
        jjFredds.addItem(new Item("X80 Sound System", 60));
        stores.add(jjFredds);
        
        //---MandaWok--//
        Store mandaWok = new Store("MandaWok");
        mandaWok.setStoreDesc("A Classic chinese restaurant that offers great"+
                              " buffet deals!");
        mandaWok.addItem(new Item("Month-Long Buffet", 150));
        mandaWok.addItem(new Item("Single-Person Buffet", 5));
        stores.add(mandaWok);
    }
    
    private static void exitGame(){
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());
        
        System.out.println("Thanks for shopping! You used " +
                currency.format(CERTIFICATE_AMOUNT - amountRemaining) + 
                " of your card.");
        
        if(itemsBought.isEmpty()){
            System.out.println("You bought 0 items.");
        }
        else{
            System.out.println("You bought: ");
            for (Item item : itemsBought) {
                System.out.println(item.getName());
            }
        }
        
        System.exit(0);
    }
}

//End Date: January 18th, 2017
//End Time: 1:21:47pm

/*Observations:
  *Very sloppy, you need to refactor so much of this.
  *Variable names are okay, method names could use cleaning up
  *Could use a few more comments, but at some points you're talking too much
*/

//Cleanliness:   3/5
//Formality:     5/5
//Readability:   5/5
//Working State: 5/5

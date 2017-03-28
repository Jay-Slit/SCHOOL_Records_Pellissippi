/*
 * File: EmployeeIDManager
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package lab3.EmployeeRecords;

import java.util.LinkedList;


public class EmployeeIDManager {
    
    static LinkedList<String> usedIDs;
    static LinkedList<String> unusedIDs;
    
    static boolean hasGeneratedLists = false;
    
    /**
     * Fills the ID Lists 
     */
    public static void generateIDLists() {
        
        if(unusedIDs == null){
            unusedIDs = new LinkedList<String>();
        }
        if(usedIDs == null){
            usedIDs = new LinkedList<String>();
        }
        
        if(hasGeneratedLists == false){
            for(int i = 0; i < 13; i++){
                char idLetter = (char)(i+97);
                for(int j = 0; j < 999; j++){
                    String idToAdd = String.format("%03d-%c", j+1, Character.toUpperCase(idLetter));
                    unusedIDs.add(idToAdd);
                }
            }
        }
        
        hasGeneratedLists = true;
    }
    
    /**
     * Searches for the first unused ID to give the Employee
     * @return The first unused ID
     */
    static public String getID(){
        String idToReturn = null;
        
        int index = 0;
        while(idToReturn == null){
            idToReturn = unusedIDs.get(index);
            
            if(idToReturn == null){
                index++;
            }
        }
        
        usedIDs.add(unusedIDs.get(index));
        unusedIDs.remove(index);
        
        return idToReturn;
        
    }
    
    /**
     * Test function, not meant for practical use
     * @param ID 
     */
    static private void returnEmployeeID(String ID){
        boolean match = false;
        int usedIndex = 0;
        while(match == false){
            if(ID.equals(usedIDs.get(usedIndex))){
                match = true;
                break;
            }
            
            usedIndex++;
        }
        
        match = false;
        int indexBeforeID = Integer.parseInt(ID.substring(0, 3));
        String suffix = ID.substring(3,5);
        String IDToFind = String.format("%d%s", indexBeforeID, suffix);
        
        System.out.println(IDToFind);
        
        int unusedIndex = 0;
        
        while(match == false){
            
        }      
        
    }
    
}

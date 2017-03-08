/*
 * Author: Cameron Justice
 * Program Title: ArrayLab
 * Program Summary: Perform transformations on arrays.
 */
package lab7;

//Imports
import java.util.Arrays;

public class ArrayLab {
    
    //Class Methods
    public void printArray(int[] toPrint){
        System.out.println();
        
        for(int i = 0; i < toPrint.length; i++){
            System.out.println("Array Spot " + (i+1) + ": " + toPrint[i]);
        }
    }
    
    //Constructors
    
    public ArrayLab(){
        
    }
    
    //End Constructors
    
    //Instance Methods
    
    public int[] distinctArray(int[] arrayWithDuplicates){
       
        int uniqueCount = arrayWithDuplicates.length;
        int[] cleanArray;
        
        for(int i = 0; i < uniqueCount; i++){
            for(int j = i+1; j < uniqueCount; j++){
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j]){
                   arrayWithDuplicates[j] = arrayWithDuplicates[uniqueCount-1];
                   uniqueCount--;
                   j--;
                }
            }
        }
        
        cleanArray = Arrays.copyOf(arrayWithDuplicates, uniqueCount);
        
        return cleanArray;
    }
    
    //End Instance Methods
}

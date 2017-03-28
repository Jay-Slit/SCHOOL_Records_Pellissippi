/*
 * File: EmployeeValidation
 * Author: Cameron Justice
 * Date: Mar 23, 2017
 * Summary:
*/
package Validation;


public class EmployeeValidation {
    
    public static boolean validateID(String ID){
        
        boolean isValid = true;
        
        if(ID.length() != 5){
            isValid = false;
        }
        
        isValid = isInteger(ID.charAt(0));
        isValid = isInteger(ID.charAt(1));
        isValid = isInteger(ID.charAt(2));
        
        if(ID.charAt(3) != '-'){
            isValid = false;
        }
        
        //check if they passed an uppercase character
        isValid = (ID.charAt(4) >= 65 && ID.charAt(4) <= 90);
        
        return isValid;        
    }
    
    private static boolean isInteger(char s){
        try{
            int i = (int)s;
            if(i < 10 && i >= 0){
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        
        return true;
    }
    
}


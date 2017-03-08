/*
 * Author: Cameron Justice
 * Program Title: Program2
 * Program Summary:
 */
package lab3;

//Imports
import javax.swing.JOptionPane;

public class Problem2 {
    
    //Hold array spots for checking
    static byte[] comparePoint = {3, 6};
    
    static public void main(String[] args){
        //Get and Check SSN for validity
        if(checkSSN()){
            JOptionPane.showMessageDialog(null, "Valid SSN");
        }
        else
            JOptionPane.showMessageDialog(null, "Invalid SSN");
    }
    
    static public boolean checkSSN(){
        String ssn = JOptionPane.showInputDialog("Enter SSN in XXX-XX-XXXX Format");
        
        //Corner Case Checking
        if(ssn.length() < 11)
            return false;
        if(ssn.length() > 11)
            return false;
        
        //Loop through checking each position
        for(int i = 0; i < ssn.length(); i++){
            if(i == comparePoint[0] || i == comparePoint[1]){
                if(!(ssn.charAt(i) == 45)){
                    return false;
                }
            }
            else{
                if(!(isNumeric(ssn.charAt(i)))){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    //Check if relayed character is an integer
    static public boolean isNumeric(char input){
        try{
            int checker = (int)input;
            return true;
        }
        catch(NumberFormatException err){
            return false;
        }
    }
}

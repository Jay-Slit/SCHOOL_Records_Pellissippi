/*
 * Author: Cameron Justice
 * Program Title: Program2
 * Program Summary: Rock, Paper, Scissors
 */
package lab2;

//imports
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Program2 {
    //Define and Initialize outside of main() for class-wide use.
    static Random rand = new Random();
    
    //Array to hole choice strings.
    static String choices[] = {"Rock", "Paper", "Scissors"};
        
    static int playerPick;
        
    //Get computer pick.
    static int computerPick = rand.nextInt(2);
    
    public static void main(String args[]){
        
        //Initialize as True so the main game statement will run.
        boolean play = true;
        
        //Main Game loop. Will only exit with user input.
        while(play){
            play = game();
        }
    }
    
    public static boolean game(){
        boolean playCheck;
        
        pickChoice();
        
        playCheck = compareChoices();
        
        if(playCheck){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void pickChoice(){
        Object[] options = {"Rock", "Paper", "Scissors"};
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose One"));
        
        playerPick = JOptionPane.showOptionDialog(null, panel, "Choose One",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, null);
    }
    
    public static boolean compareChoices(){
        switch(playerPick){
            case 0:
                if(computerPick == 0){
                    return playerTie();
                }
                else if(computerPick == 1){
                    return playerLose();
                }
                else if(computerPick == 2){
                    return playerWon();
                }
            case 1:
                if(computerPick == 0){
                    return playerWon();
                }
                else if(computerPick == 1){
                    return playerTie();
                }
                else if(computerPick == 2){
                    return playerLose();
                }
            case 2:
                if(computerPick == 0){
                    return playerLose();
                }
                else if(computerPick == 1){
                    return playerWon();
                }
                else if(computerPick == 2){
                    return playerTie();
                }
            default:
                System.exit(0);
        }
        
        return false;
    }
    
    public static boolean playerWon(){
        int n = JOptionPane.showConfirmDialog(null, "You won! The computer chose " + choices[computerPick] + "! " +
                choices[playerPick] + "beats " + choices[computerPick] + "! Do you want to play again?");
        if(n == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean playerTie(){
        int n = JOptionPane.showConfirmDialog(null, "You tied! The computer chose " + choices[computerPick] + "! " +
                choices[playerPick] + "ties with " + choices[computerPick] + "! Do you want to pick again?");
        if(n == 0){
            return pickAgain();
        }
        else{
            return false;
        }
    }
    
    public static boolean playerLose(){
        int n = JOptionPane.showConfirmDialog(null, "You lost! The computer chose " + choices[computerPick] + "! " +
                choices[playerPick] + "loses to " + choices[computerPick] + "! Do you want to play again?");
        if(n == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean pickAgain(){
        computerPick = rand.nextInt(2);
        pickChoice();
        
        return compareChoices();
    }
}

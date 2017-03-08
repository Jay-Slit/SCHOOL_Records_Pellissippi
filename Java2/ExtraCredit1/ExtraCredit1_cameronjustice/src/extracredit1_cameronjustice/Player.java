
/**
 * File: Player
 * Author: Cameron Justice
 * Date: Feb 14, 2017
 * Summary: Obj-Ori representation of a baseball player
*/

package extracredit1_cameronjustice;

public class Player {
    
    private final String DEFAULT_NAME = "";
    private final int DEFAULT_NUMBER = 1;
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 99;
    private final double DEFAULT_BATTING_AVERAGE = 0.0;
    private final double MIN_BATTING_AVERAGE = 0.0;
    private final double MAX_BATTING_AVERAGE = 1.0;
    
    private String playerName;
    private int playerNumber;
    private double playerBattingAverage;
    
    //Constructors
    public Player(){
        playerName = DEFAULT_NAME;
        playerNumber = DEFAULT_NUMBER;
        playerBattingAverage = DEFAULT_BATTING_AVERAGE;
    }
    
    public Player(String name){
        playerName = name;
        playerNumber = DEFAULT_NUMBER;
        playerBattingAverage = DEFAULT_BATTING_AVERAGE;
    }
    
    public Player(String name, int number){
        playerName = name;
        playerNumber = number;
        playerBattingAverage = DEFAULT_BATTING_AVERAGE;
    }
    
    public Player(String name, int number, double battingAverage){
        playerName = name;
        playerNumber = number;
        playerBattingAverage = battingAverage;
    }
    
    //Property Methods
    public String getName(){
        return playerName;
    }
    
    public int getNumber(){
        return playerNumber;
    }
    
    public double getBattingAverage(){
        return playerBattingAverage;
    }
    
    public void setName(String newName){
        playerName = newName;
    }
    
    public void setNumber(int newNumber){
        playerNumber = newNumber;
    }
    
    public void setBattingAverage(double newBattingAverage){
        playerBattingAverage = newBattingAverage;
    }
    
    @Override
    public String toString(){
        return String.format("%s: He holds the number %d, and has a Batting Average of %f."
                              , playerName, playerNumber, playerBattingAverage);
    }
}

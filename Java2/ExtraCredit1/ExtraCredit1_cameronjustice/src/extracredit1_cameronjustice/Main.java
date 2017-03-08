/**
 * File: Main
 * Author: Cameron Justice
 * Date: Feb 14, 2017
 * Summary: A driver class for the Team/Player Obj-Ori system
 */
package extracredit1_cameronjustice;

import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static Team team;
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        team = new Team();
        team.setName("Best Team");
        
        System.out.println("Welcome to your team, the " + team.getName());
        
        short userOption = 0;
        
        do{
            printOptions();
            
            userOption = input.nextShort();
            
            judgeUserOption(userOption);
        }
        while(userOption != 4);
        
        System.out.println("Your team is in good hands until you return! Goodbye!");
    }
    
    private static void judgeUserOption(short userOption){
        switch(userOption){
            case 1:
                team.printRoster(false);
                break;
            case 2:
                lookForPlayer();
                break;
            case 3:
                team.sort();
                System.out.println("Team players have been sorted by number");
                break;
            case 4:
                break;
            default:
                System.out.println("That isn't an option!");
                break;
        }
    }
    
    private static void lookForPlayer(){
        System.out.println("What is the number of the player you would like to find?");
        int userOption = input.nextInt();
        Player foundPlayer = team.search(userOption);
        if(foundPlayer == null){
            System.out.println("Could not find player with that number");
        }
        else{
            System.out.println(foundPlayer.toString());
        }
    }
    
    private static void printOptions(){
        String[] choices = new String[4];
        choices[0] = "1 Print Roster";
        choices[1] = "2 Look in roster for player by number";
        choices[2] = "3 Sort roster by number";
        choices[3] = "4 Quit";
        
        for(String choice : choices){
            System.out.println(choice);
        }
    }
    
}

//You should update this with validation
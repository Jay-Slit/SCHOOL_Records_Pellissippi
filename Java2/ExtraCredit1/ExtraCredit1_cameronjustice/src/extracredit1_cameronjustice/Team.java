
/**
 * File: Team
 * Author: Cameron Justice
 * Date: Feb 14, 2017
 * Summary: Obj-Ori representation of a baseball team
*/

package extracredit1_cameronjustice;

import java.util.Arrays;
import java.util.Comparator;

public class Team {
    
    private final int MIN_NUM_PLAYERS = 9;
    private final String DEFAULT_NAME = "";
    
    private Player[] players;
    private String teamName;
    
    public Team(){
        players = buildDreamTeam();
        teamName = "Dream Team";
    }
    
    public Team(Player[] p){
        players = p;
    }
    
    public Team(Player[] p, String name){
        players = p;
        teamName = name;
    }
    
    //Property Methods
    public String getName(){
        return teamName;
    }
    
    public Player[] getPlayers(){
        return players;
    }
    
    public void setName(String name){
        teamName = name;
    }
    
    public void setPlayers(Player[] newPlayers){
        players = newPlayers;
    }
    
    //Sort the players by ID
    public void sort(){
        Arrays.sort(players, (Player p1, Player p2) -> Integer.toString(p1.getNumber()).compareTo(Integer.toString(p2.getNumber())));
    }
    
    //Search the players array for one player by their number
    public Player search(int num){
        for(Player player : players){
            if(player.getNumber() == num){
                return player;
            }
        }
        
        return null;
    }
    
    //Print the full roster depending on if it should be sorted or not
    public void printRoster(boolean sortByNumber){
        System.out.println(teamName);
        if(sortByNumber){
            sort();
            getFormattedRoster();
        }
        else{
            getFormattedRoster();
        }
    }
    
    //Format and print the roster
    private void getFormattedRoster(){
        
        System.out.format("%-15s %-13s %-4s\n", "Name", "Number", "BA");
        System.out.println("--------------------------------"); //Ugh. Fix this.
        for (Player player : players) {
            System.out.format("%-15s %-13d %-4f\n",
                    player.getName(), player.getNumber(),
                    player.getBattingAverage());
        }
    }
    
    @Override
    public String toString(){
        return teamName;
    }
    
    private Player[] buildDreamTeam(){
        Player[] dreamPlayers = new Player[9];
        
        dreamPlayers[0] = new Player("Berra", 8, 0.285);
        dreamPlayers[1] = new Player("Ryan", 34);
        dreamPlayers[2] = new Player("Aparicio", 11, 0.262);
        dreamPlayers[3] = new Player("Pujols", 5, 0.328);
        dreamPlayers[4] = new Player("Jackson", 9, 0.262);
        dreamPlayers[5] = new Player("Schoendienst", 10, 0.289);
        dreamPlayers[6] = new Player("Carew", 29, 0.328);
        dreamPlayers[7] = new Player("Aaron", 44, 0.305);
        dreamPlayers[8] = new Player("Mantle", 7, 0.298);
        
        return dreamPlayers;
    }
    
}

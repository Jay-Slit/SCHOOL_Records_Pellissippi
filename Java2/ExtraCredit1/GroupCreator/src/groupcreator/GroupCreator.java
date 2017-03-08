/**
 * File: GroupCreator
 * Author: Cameron Justice
 * Date: Mar 3, 2017
 *
 */
package groupcreator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GroupCreator {

    public static void main(String[] args) {
        boolean stillEntering = true;
        List<String> names = new LinkedList<String>();
        
        Object[] options = {"YES", "NO"};
        JPanel panel = new JPanel();
        
        Random random = new Random();
        
        while(stillEntering){
            
            if(names.size() >= 13){
                stillEntering = false;
                break;
            }
            
            
            names.add(JOptionPane.showInputDialog("Enter Next Name"));
        }
        
        for(String name : names){
            System.out.println(name);
        }
        
        int nameCount = names.size();
        String[] group1 = new String[4];
        boolean group1Full = false;
        int group1Index = 0;
        String[] group2 = new String[4];
        boolean group2Full = false;
        int group2Index = 0;
        String[] group3 = new String[5];
        boolean group3Full = false;
        int group3Index = 0;
        
        while(nameCount != 0){
            Collections.shuffle(names);
            if(!group1Full){
                group1[group1Index] = names.get(0);
                names.remove(0);
                group1Index++;
                if(group1Index == 4){
                    group1Full = true;
                }
            }
            else if(!group2Full){
                group2[group2Index] = names.get(0);
                names.remove(0);
                group2Index++;
                if(group2Index == 4){
                    group2Full = true;
                }
            }
            else if(!group3Full){
                group3[group3Index] = names.get(0);
                names.remove(0);
                group3Index++;
                if(group3Index == 5){
                    group3Full = true;
                }
            }
            
            nameCount--;
        }
        
        String output = "";
        for(String name : group1){
            output += name + " -- Group {A}\n";
        }
        
        for(String name : group2){
            output += name + " -- Group {B}\n";
        }
        
        for(String name : group3){
            output += name + " -- Group {C}\n";
        }
        
        JOptionPane.showMessageDialog(panel, output,"Groups", JOptionPane.PLAIN_MESSAGE);
    }
    
}

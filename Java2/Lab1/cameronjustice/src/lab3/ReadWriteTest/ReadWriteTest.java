/*
 * File: ReadWriteTest
 * Author: Cameron Justice
 * Date: Mar 25, 2017
 * Summary:
*/
package lab3.ReadWriteTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReadWriteTest {
    
    private static boolean filePrevExists = false;
    private static File file = new File("src/lab3/ReadWriteTest/MyFile.txt");
    private static List<Integer> randNums = new ArrayList<Integer>();
    
    public static void main(String[] args) throws InterruptedException{        
        int[] printArray;
        
        System.out.println("This program is made to read a list "
                + "of numbers from a file. If this is your first time "
                + "running this program, I will create the file for you.");
        Thread.sleep(2000);
        
        createFile();
        System.out.println("Checking OR Creating file...");
        Thread.sleep(1000);
        if(filePrevExists){
            readNumbersFromFile();
            printArray = new int[randNums.size()];
            for(int i = 0; i < randNums.size(); i++){
                printArray[i] = randNums.get(i);
            }
            insertionSort(printArray);
        }
        else{
            generateNumbers();
            writeNumbersToFile();
            randNums.clear();
            readNumbersFromFile();
            printArray = new int[randNums.size()];
            for(int i = 0; i < randNums.size(); i++){
                printArray[i] = randNums.get(i);
            }
            insertionSort(printArray);
        }
        
        System.out.println("Printing Numbers");
        Thread.sleep(1000);
        for(int i = 0; i < printArray.length; i++){
            System.out.println(printArray[i]);
        }
        
    }
    
    private static void writeNumbersToFile(){
        try{
            FileWriter writer = new FileWriter(file);
            BufferedWriter buffWriter = new BufferedWriter(writer);
            
            //Expand string for one central .Write() call
            //And to ensure 1 line
            String toWrite = "";
            for(int i = 0; i < randNums.size(); i++){
                toWrite += randNums.get(i);
                toWrite += ",";
            }
            
            buffWriter.write(toWrite); //Write or Dye
            buffWriter.flush(); //Make sure there's no garbage left over. Ugh.
            buffWriter.close();
            writer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    private static void generateNumbers(){     
        for(int i = 0; i < 100; i++){
            randNums.add((int)(Math.random() * 500));
        }
    }
    
    private static void readNumbersFromFile(){
        try(FileReader reader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(reader)){
                //Buffer the reader to prevent errors
                
                String numsLine = "";
                
                numsLine += buffReader.readLine();
                
                System.out.println(numsLine);
                
                //Parse from string to int
                ArrayList<String> tempList = new ArrayList<String>(Arrays.asList(numsLine.split(",")));
                try{
                    for(String s : tempList){
                        randNums.add(Integer.parseInt(s));
                    }
                }
                catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }
            catch(FileNotFoundException e){
                System.out.println("Could not find file.");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
    }
    
    private static void insertionSort(int[] arr){
        
        System.out.println(arr.length);
        
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j;
            for(j = i-1; j > 0 && temp < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            
            arr[j+1] = temp;
        }
    }
    
    private static void createFile(){
        try{
            //If the file does not exist, create it
            if(file.exists() == false){
                System.out.println("File has been created.");
                file.createNewFile();
                filePrevExists = false;
            }
            // Otherwise mark it as existing and move on
            else{
                System.out.println("File already exists.");
                filePrevExists = true;
            }  
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}

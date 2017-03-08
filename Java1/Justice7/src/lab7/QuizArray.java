package lab7;

/*
 * Author: Cameron Justice
 * Program Title: QuizArray
 * Program Summary: Perform calculations on arrays.
 */

public class QuizArray {
    
    //Class Variables
    private double[] quizArray;
    private double averageScore;
    private double maxScore;
    private double minScore;
    private short belowAvgCount;
    private int quizLength;
    
    //Class Methods
    public void printArray(double[] toPrint){
        for(int i = 0; i < toPrint.length; i++){
            System.out.println("Quiz #" + i + ": " + toPrint[i]);
        }
    }
    
    //End Class Methods
    
    //Constructors
    public QuizArray(double[] _quizArray){
        
        quizArray = _quizArray;
        
        quizLength = quizArray.length;
        
        averageScore = computeAverageScore();
        
        maxScore = computeMaxScore();
        
        minScore = computeMinScore();
        
        belowAvgCount = computeBelowAvgCount(averageScore);
        
    }
    
    //End Constructors
    
    //Instance Methods
    public double getAverageScore(){
        return averageScore;
    }
    
    public double getMaxScore(){
        return maxScore;
    }
    
    public double getMinScore(){
        return minScore;
    }
    
    public double getBelowAvgCount(){
        return belowAvgCount;
    }
    
    //End Instance Methods
    
    //Private Methods
    private double computeAverageScore(){
        double sum = 0;
        
        for(int i = 0; i < quizLength; i++){
            sum += quizArray[i];
        }
        
        return (sum / quizLength);
    }
    
    private double computeMaxScore(){
        
        double highestNum = 0;
        
        for(int i = 0; i < quizLength; i++){
            if (quizArray[i] > highestNum)
                highestNum = quizArray[i];
        }
        
        return highestNum;
    }
    
    private double computeMinScore(){
        
        double lowestNum = quizArray[0];
        
        for(int i = 1; i < quizLength; i++){
            if(quizArray[i] < lowestNum)
                lowestNum = quizArray[i];
        }
        
        return lowestNum;
    }
    
    private short computeBelowAvgCount(double average){
        
        for(int i = 0; i < quizLength; i++){
            if(quizArray[i] < average)
                belowAvgCount++;
        }
        
        return belowAvgCount;
    }
    
    //End Private Methods
}

/*
 * Author: Cameron Justice
 * Program Title: Program1
 * Program Summary: Display the use of the QuizArray class.
 */
package lab7;

//Imports


public class Problem1 {
    
    public static void main(String[] args){
        
        double[] scores = new double[10];
        
        //Fill scores[] with random values
        for(int i = 0; i < 10; i++){
            scores[i] = Math.random() * 20;
        }
        
        QuizArray quizArray = new QuizArray(scores);
        
        quizArray.printArray(scores);
        System.out.println("Average: " + quizArray.getAverageScore());
        System.out.println("Highest Score: " + quizArray.getMaxScore());
        System.out.println("Lowest Score: " + quizArray.getMinScore());
        System.out.println("Scores Below Average: " + quizArray.getBelowAvgCount());
    }
}

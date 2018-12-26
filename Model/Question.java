/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Contains all information for each question
 * @author Greg
 */
public class Question {
    public String questionString;
    public String answer;
    public int value;
    public boolean isComplete;
    public boolean isCurrent;
    
    /**
     * Creates a question object
     * @param questionString - String containing the actual question
     * @param answer - String containing the answer to the question
     * @param value - the point value associated with the question
     * @param isComplete - boolean flag that indicates if the question has been answered
     * @param isCurrent - boolean flag that indicates if the question is the current question the game is looking at
     */
    public Question(String questionString, String answer, int value,boolean isComplete, boolean isCurrent){
        this.questionString = questionString;
        this.answer = answer;
        this.value = value;
        this.isComplete = isComplete;
        this.isCurrent = isCurrent;
        
    }
    
    public Question(){
        this.questionString = "ERROR";
        this.answer = "ERROR";
        this.value = 0;
        this.isComplete = false;
        this.isCurrent = false;
    }
    
    /**
     * Returns a string of the question
     * @return 
     */
    public String toString(){
        return "Question: " + this.questionString + "\nAnswer: " + this.answer + "\nValue: " + String.valueOf(this.value);
        
    }

    /**
     * Sets the question
     * @param s - The string the question will be set to 
     */
    public void setQuestion(String s) {
        this.questionString = s;
    
    }

    /**
     * Sets the answer
     * @param s - string the answer will be set to
     */
    public void setAnswer(String s) {
        this.answer = s;
    }
    
}

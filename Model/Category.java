/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.ArrayList;

/**
 * A category is a critical part of the game that is used to keep similar questions together.
 * A round is complete when all categories are complete
 * @author Greg
 */



public class Category {
    public String name;
    public ArrayList<Question> questions;
    public boolean isCurrent;
    public boolean isComplete;
    
    /**
     * Initializes a default version of a class
     */
    public Category(){
        this.name = "N/A";
        this.questions = new ArrayList<Question>();
        this.isCurrent = false;
        this.isComplete = false;
    }
    
    /**
     * Creates a category which is an integral part of the game
     * @param name - This is the title of the category. Usually a description of the types of questions in the category
     * @param questions - An ArrayList of questions that are in the category. Should always have 5 questions total
     * @param isCurrent - flag that indicates whether it is the current category the game is looking at
     */
    public Category(String name, ArrayList<Question> questions, boolean isCurrent){
        this.name = name;
        this.questions = questions;
        this.isCurrent = isCurrent;
        this.isComplete = false; // Flag indicating whether the category has been finished or not
    }
    
    /**
     * Makes a string version of the category to be printed
     * @return 
     */
    public String toString(){
        String catString = "Category: " + this.name + "\n";
//        for(int i = 0; i<questions.size();i++){
//            catString = catString + questions.get(i).toString() + "\n";
//        }
        return catString;
    }
    
    /**
     * Grabs the current Question
     * @return current question
     */
    public Question getCurrentQuestion(){
        // Go through each question until the current one is found
        for(Question q : this.questions){
            if(q.isCurrent){
                return q;
            }
        }
        // If no current question is found, return the question at [1]
        // Typically, this is a sign an error has occured
       /* this.questions.get(1).isCurrent = true;
        return this.questions.get(1); */
       Question q = new Question();
       return q;
    }
    
    /**
     * Handles status changes due to a questions being answered
     */
    public void update(){
        int count = 0;
        int current_index = 0;
        // Find the index of the current question
        for(Question q : this.questions){
            if(q.isCurrent){
                current_index = count;
                break;
            }
            count++;
        }
        // Get the current question and flip its flags to indicate that it has been answered
        Question cur_question = this.questions.get(current_index);
        cur_question.isComplete = true;
        cur_question.isCurrent = false;
        
        // Check if the category is now complete
        if(current_index == this.questions.size()-1){
            this.isComplete = true;
        }
        else{
            // Otherwise, set the next question in the category as current
            this.questions.get(current_index+1).isCurrent = true;
        }
        
        this.isCurrent = false;
        
    }

    /**
     * Sets the name of the category
     * @param s - name of category
     */
    void setName(String s) {
        this.name = s;
    }
}

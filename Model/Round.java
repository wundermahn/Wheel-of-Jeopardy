/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.ArrayList;

/**
 * A round contains 6 categories
 * @author Greg
 */
public class Round {
    
    public ArrayList<Category> categories;
    public boolean isCurrent;
    public boolean isComplete;
    public int spinsRemaining;
    
    /**
     * Creates a default round object
     */
    public Round(){
        this.categories = new ArrayList<Category>();
        this.isCurrent = false;
        this.isComplete = false;
        this.spinsRemaining = 50;
    }
    
    /**
     * Creates a round object
     * @param categories - ArrayList of categories in the round
     * @param isCurrent - boolean flag that indicates if the round is the current round for the game
     */
    public Round(ArrayList<Category> categories, boolean isCurrent){
        this.categories = categories;
        this.isCurrent = isCurrent;
        this.isComplete = false;
        this.spinsRemaining = 50; // THIS IS THE ONE YOU CHANGE 50 spins per round
    }
    
    /**
     * Returns a string of the contents of the round
     * @return 
     */
    public String toString(){
        String roundString = "";
        for(int i = 0; i<categories.size();i++){
            roundString = roundString + categories.get(i).toString() + "\n";
        }
        return roundString;
    }
    
    /**
     * Grabs the current Category
     * @return current category
     */
    public Category getCurrentCategory(){
        // Find the current category and return it
        for(Category c : this.categories){
            if(c.isCurrent){
                return c;
            }
        }
        // If no category is found, return the a default category
        Category cat = new Category();
        return cat;
    }
    
    /**
     * Handles status changes due to a questions being answered
     */
    public void update(){
        boolean isFinished = true;
        
        for(Category c : this.categories){
            // If the category has not been finished, update it
            if(!c.isComplete && c.isCurrent){
                c.update();
            }
            // Check to see if all categories are complete
            isFinished = c.isComplete && isFinished;
        }
        
        // If the round has run out of spins, the round is complete
        if(spinsRemaining < 1){
            isFinished = true;
        }
        
        // If all categories are complete or the round has run out of spins, it is complete
        if(isFinished){
            this.isComplete = true;
        }
        
    }
    
}

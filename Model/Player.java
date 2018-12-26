/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * A player contains the score and other parameters that need to be kept track of
 * @author Greg
 */
public class Player {
    
    public int totalScore;
    public int roundScore;
    public String name;
    public boolean isCurrent;
    public int freeTurns;
    
    /**
     * Create a default player
     */
    public Player(){
        this.totalScore = 0;
        this.roundScore = 0;
        this.name = "PlayerName";
        this.isCurrent = false;
        this.freeTurns = 0;
    }
    
    /**
     * Create a player object
     * @param name - Name of the player
     * @param isCurrent - boolean flag that indicates if it is the players turn
     */
    public Player(String name, boolean isCurrent){
        this.totalScore = 0;
        this.roundScore = 0;
        this.name = name;
        this.isCurrent = isCurrent;
        this.freeTurns = 0;
    }
    
    /**
     * Currently outdated
    public String toString(){
        String playerString = "Name: " + this.name + " Score: " + String.valueOf(this.score);
        return playerString;
    }
    */
    
    /**
     * Adds the round score to the total score
     */
    public void updateTotalScore(){
        this.totalScore = this.totalScore + this.roundScore;
        this.roundScore = 0;
    }
    
    public int getRoundScore(){
        return this.roundScore;
    }

    
}

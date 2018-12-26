/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


/**
 * The model handles all game logic
 * @author Greg
 */
public class Model {
    public static final int QUESTION_TIME = 30000;
    public Game game;
    public USER_INPUT_ENUM user_input;
    public ArrayList<String> user_input_string;
    public ArrayList<Integer> user_input_index;
    public MODEL_VIEW_ENUM wheel_selection_change_ack; 
    
    BufferedReader reader; // Needed for taking console input
    
    /**
     * Creates a new model
     * @param game - game to be used by the model
     */
    public Model(Game game, USER_INPUT_ENUM user_input){
        this.game = game;
    }
    
    /**
     * Creates a model with a default game and then initializes it
     */
    public Model(){
        this.game = new Game();
        this.user_input = USER_INPUT_ENUM.NONE;
        this.user_input_index = new ArrayList();
        this.user_input_string = new ArrayList();
        this.game.init(); // Create all the objects needed for a game
    }
    
    /**
     * Returns a string version of the model
     * @return 
     */
    public String toString(){
        switch(this.user_input){
            case NONE:
                return "NONE";
            case START_GAME:
                return "START_GAME";
                
        }
        return "ERROR";
    }
    
    /**
     * Resets the user_input to none. Should be done after user_input is handled.
     */
    public void reset_user_input(){
        System.out.println("Resetting user input");
        this.user_input = USER_INPUT_ENUM.NONE;
        this.user_input_index.clear();
        this.user_input_string.clear();
    }
    
    /**
     * Update the model after every game tick
     * @throws IOException - exception is only needed for taking input from the console
     */
    public void update() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        
        Question q;
        Round curr_round;
        
        reader = new BufferedReader(inputStreamReader);
        String input;
        
        
        // Perform the appropriate action based on what state the game is in
        switch(this.game.getState()){
            case MAIN_MENU: // Currently, being in the main menu simply waits for user input to start a game
                // In the future, this will contain logic for moving to all options on the menu
                System.out.println("In MAINMENU\nPress enter to start a game");
                //System.out.println("Categories: " + this.game.rounds.get(0).categories);
                //input = reader.readLine();
                if(this.user_input == USER_INPUT_ENUM.START_GAME){
                    this.game.setState(GAME_STATE_ENUM.WHEEL);
                    this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                    this.reset_user_input();
                }
                else if(this.user_input == USER_INPUT_ENUM.QUESTION_ENTRY){
                    this.game.setState(GAME_STATE_ENUM.QUESTION_ENTRY);
                    this.reset_user_input();
                }
                break;
            case WHEEL:
                System.out.println("In WHEEL\nPress enter to spin");
                //input = reader.readLine(); // Waits for user input to spin the wheel. This will be from a button in the future
                if(this.user_input == USER_INPUT_ENUM.SPIN_WHEEL){
                    this.game.spinWheel(); // Spins the wheel
                    switch(this.game.sector){
                        case "Bankrupt":
                            this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                            break;
                        case "Lose Turn":
                            if (this.game.getCurrentPlayer().freeTurns == 0){
                                this.game.updateCurrentPlayer();
                            }
                            else{
                                this.game.setState(GAME_STATE_ENUM.USE_TOKEN);
                                JOptionPane.showMessageDialog(null, this.game.getCurrentPlayer().name + ", you got a " + this.game.sector + ".\nYou may use a token if you have one. Otherwise, moving to the next player's turn.");

                            }
                            this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                            break;
                        case "Free Turn":
                            this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                            break;
                        case "Player's Choice":
                            this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                            break;
                        case "Opponent's Choice":
                            this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                            break;
                        case "Double Score":
                            this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                            break;
                    }
                    
                    this.reset_user_input();
                    if(this.game.state != GAME_STATE_ENUM.PLAYERS_CHOICE){
                        curr_round = this.game.getCurrentRound();
                        Category curr_category = curr_round.getCurrentCategory();
                        if(!curr_category.isComplete && curr_category.isCurrent){
                            // If a valid category is chosen, move to the question board
                            this.game.setState(GAME_STATE_ENUM.QUESTION_BOARD);
                            System.out.println("Category Chosen = " + curr_category.name);
                            break;
                        }
                        else{
                            // Check to see if the round is over due to the spins remaining
                            if(curr_round.spinsRemaining < 1){
                                curr_round.isComplete = true;
                            }
                            // Update the game to see if rounds need to be changed
                            this.game.update();
                        }
                    }
                    
                }
                
                break;
            case PLAYERS_CHOICE:
                System.out.println("In PLAYERS CHOICE");
                Category c;
                curr_round = this.game.getCurrentRound();
                switch(this.user_input){
                    case CATEGORY1:
                        c = curr_round.categories.get(0);
                        c.isCurrent = true;
                        break;
                    case CATEGORY2:
                        c = curr_round.categories.get(1);
                        c.isCurrent = true;
                        break;
                    case CATEGORY3:
                        c = curr_round.categories.get(2);
                        c.isCurrent = true;
                        break;
                    case CATEGORY4:
                        c = curr_round.categories.get(3);
                        c.isCurrent = true;
                        break;
                    case CATEGORY5:
                        c = curr_round.categories.get(4);
                        c.isCurrent = true;
                        break;
                    case CATEGORY6:
                        c = curr_round.categories.get(5);
                        c.isCurrent = true;
                        break;
                }
                if(this.user_input != USER_INPUT_ENUM.NONE){
                    
                    this.reset_user_input();
                    Category curr_category = curr_round.getCurrentCategory();
                    if(!curr_category.isComplete && curr_category.isCurrent){
                        // If a valid category is chosen, move to the question board
                        this.game.setState(GAME_STATE_ENUM.QUESTION_BOARD);
                        System.out.println("Category Chosen = " + curr_category.name);
                        break;
                    }
                    else{
                        // Check to see if the round is over due to the spins remaining
                        if(curr_round.spinsRemaining < 1){
                            curr_round.isComplete = true;
                        }
                        // Update the game to see if rounds need to be changed
                        this.game.update();
                    }
                }
                break;
                    
            case QUESTION_BOARD: // Currently the question board just moves to the question
                System.out.println("In QUESTION_BOARD\nPress enter to move to question");
                //input = reader.readLine(); // This will be a button input in the future
                if(this.user_input==USER_INPUT_ENUM.CONTINUE){
                    this.game.setState(GAME_STATE_ENUM.QUESTION);
                    this.reset_user_input();
                }
                break;
            case QUESTION: // This section will need to handle timer logic in the future
                
                //Create Question timer
                Date d = new Date();
                if(this.game.ref_time == 0){
                    System.out.println("HERE");
                    this.game.ref_time = d.getTime();
                }
                
                //Update time remaining
                this.game.time_remaining = QUESTION_TIME - (d.getTime() - this.game.ref_time);
                
                System.out.println(this.game.time_remaining);
                
                if(this.game.time_remaining > 0){
                
                
                    System.out.println("In QUESTION\n");
                    q = this.game.getCurrentQuestion();
                    //System.out.println("Question: " + q.questionString + "\nPoint Value: " + String.valueOf(q.value) + "\nPress enter to move to answer");
                    //input = reader.readLine(); // This will be the "Show answer" button
                    if(this.user_input==USER_INPUT_ENUM.CONTINUE){
                        this.game.setState(GAME_STATE_ENUM.ANSWER);
                        this.reset_user_input();
                        this.game.time_remaining = QUESTION_TIME;
                        this.game.ref_time = 0;
                    }
                    
                }
                else{
                    Player curr_player = this.game.getCurrentPlayer();
                    if(curr_player.freeTurns > 0){
                        this.game.setState(GAME_STATE_ENUM.USE_TOKEN);
                    }
                    else{
                        this.game.updateCurrentPlayer();
                        this.game.setState(GAME_STATE_ENUM.WHEEL);
                        this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                    }
                    this.game.time_remaining = Model.QUESTION_TIME;
                    this.game.ref_time = 0;
                    this.game.update();
                    this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                    
                }
                break;
            case ANSWER:
                System.out.println("In ANSWER\n");
                q = this.game.getCurrentQuestion();
                System.out.println("Answer: " + q.answer + "\nWas the answer correct? y or n");
                //input = reader.readLine();// Ask if the player got the question correct
                if(this.user_input != USER_INPUT_ENUM.NONE){
                    if(this.user_input == USER_INPUT_ENUM.CORRECT){ // If yes, add to the player's score
                        this.game.getCurrentPlayer().roundScore = this.game.getCurrentPlayer().roundScore + this.game.getCurrentQuestion().value;                  
                        this.reset_user_input();
                        this.game.setState(GAME_STATE_ENUM.WHEEL);
                        this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                    }
                    else if(this.user_input == USER_INPUT_ENUM.INCORRECT){
                        // Otherwise, subtract from the player's score
                        this.game.getCurrentPlayer().roundScore = this.game.getCurrentPlayer().roundScore - this.game.getCurrentQuestion().value;

                        // Ask the player if they want to use their token if they have one
                        if(this.game.getCurrentPlayer().freeTurns > 0){
                            this.game.setState(GAME_STATE_ENUM.USE_TOKEN);

                        }
                        else{
                            this.game.updateCurrentPlayer(); // Move to the next player
                            this.reset_user_input();
                        }
                    }
                    for(Player p : this.game.players){ // Print player scores to the console
                            System.out.println("Player Score: " + String.valueOf(p.roundScore) + "\n");
                    }

                    // Update the game now that a question has been answered
                    this.game.update();

                    // Move back to the wheel for the next turn
                    
                }
                
                break;
            case USE_TOKEN:
                System.out.println("Use Free Turns? You have " + this.game.getCurrentPlayer().freeTurns + "remaining. y or n?");
                //input = reader.readLine();
                if(this.user_input==USER_INPUT_ENUM.USE_TOKEN){
                    this.game.getCurrentPlayer().freeTurns--; // Subtract a token but stay on the current player's turn
                    this.game.setState(GAME_STATE_ENUM.WHEEL);
                    this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                    this.reset_user_input();
                }
                else if(this.user_input == USER_INPUT_ENUM.DO_NOT_USE_TOKEN){
                    this.game.updateCurrentPlayer(); // Move to the next player
                    this.game.setState(GAME_STATE_ENUM.WHEEL);
                    this.wheel_selection_change_ack = MODEL_VIEW_ENUM.UNACKNOWLEDGED;
                    this.reset_user_input();
                }
                
                break;
            case QUESTION_ENTRY:
                // TODO - Add logic for Question Entry
                // There will need to be a second user input variable that is the ACTUAL user input.
                // By this I mean the string they enter for the question or category.
                System.out.println("In QUESTION ENTRY");
                Category curr_cat;
                Question curr_question;
                try{
 
                    switch(this.user_input){
                        case ADD_QUESTION:
                            // Get the question to be changed
                            curr_round = this.game.rounds.get(this.user_input_index.get(0));
                            curr_cat = curr_round.categories.get(this.user_input_index.get(1));
                            curr_question = curr_cat.questions.get(this.user_input_index.get(2));

                            curr_question.setQuestion(user_input_string.get(0));
                            curr_question.setAnswer(user_input_string.get(1));
                            this.reset_user_input();
                            break;
                        case ADD_CATEGORY:
                            System.out.println("Changing category name to:" + this.user_input_string.get(0));
                            System.out.println(this.user_input_index);
                            
                            curr_round = this.game.rounds.get(this.user_input_index.get(0));
                            curr_cat = curr_round.categories.get(this.user_input_index.get(1));

                            curr_cat.setName(user_input_string.get(0));
                            this.reset_user_input();
                            System.out.println(this.game.rounds.get(0).categories);
                            
                            this.game.updateWheel();
                            break;
                        case MAIN_MENU:
                            //This will need some added logic in case the user quits in the middle
                            this.game.setState(GAME_STATE_ENUM.MAIN_MENU);
                            this.reset_user_input();
                            break;
                    }
                                        
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("Error: Invalid index");
                    this.reset_user_input();
                } 
                
                break;
                
            default:
                System.out.println("ERROR");
                
        }
        // Before restarting the game, check to see if the game is over
        if(this.game.isComplete){
            System.out.println("Game over!\n");
            for(Player p : this.game.players){
                System.out.println("Player Score: " + String.valueOf(p.totalScore) + "\n");
            }

            // Once a game is complete, move back to the main menu
            this.game.setState(GAME_STATE_ENUM.MAIN_MENU); 
        }
    }
   
}

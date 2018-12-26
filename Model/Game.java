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
import java.util.Random;
import java.util.Timer;
import Model.Model;
import javax.swing.JOptionPane;

/**
 * The game contains all the game elements used in Wheel of Jeopardy
 * @author Greg
 */



public class Game {
    
    BufferedReader reader;
    
    public ArrayList<Round> rounds;
    public int round;
    public ArrayList<Player> players;
    public GAME_STATE_ENUM state;
    public boolean isComplete;
    public ArrayList<String> wheel;
    public long ref_time;
    public long time_remaining;
    public String sector;
    
    /**
     * Creates a default game
     */
    public Game(){
        this.round = 1;
        this.rounds = new ArrayList<Round>();
        this.players = new ArrayList<Player>(); // Adds three default players to begin
        this.isComplete = false;
        this.wheel = new ArrayList<String>();
        this.state = GAME_STATE_ENUM.MAIN_MENU;
        this.ref_time = 0;
        this.time_remaining = Model.QUESTION_TIME;
        this.sector = "";
    }
    
    /**
     * Creates a game with the given inputs
     * @param rounds - a ArrayList of rounds that will be used in the game
     * @param players - an ArrayList of players in the game
     * @param wheel - An ArrayList of strings the wheel can land on
     */
    public Game(ArrayList<Round> rounds, ArrayList<Player> players, ArrayList<String> wheel){
        this.round = 1;
        this.rounds = rounds;
        this.players = players;
        this.state = GAME_STATE_ENUM.MAIN_MENU; // Initializes in the main menu state
        this.isComplete = false; // Set to false by default since a game will ahve just started
        this.wheel = wheel;
        this.sector = "Bankrupt";
        
    }
    
    /**
     * Initializes all of the different objects needed to start a game
     */
    public void init(){
        System.out.println("INITIALIZING GAME");
        String q1 = "Default Question";
        String a1 = "Default Answer";
        
        // Create default players
        this.players.add(new Player("Player 1",true));
        this.players.add(new Player("Player 2",false));
        this.players.add(new Player("Player 3",false));
        
        // Create enough default questions, categories and rounds to start a game
        ArrayList<Question> questions1 = new ArrayList<Question>();
        questions1.add(new Question("He purportedly murdered his twin and then founded the city of Rome","Romulus",200,false,true));
        questions1.add(new Question("It was the first Roman road ever built","Appian Way",400,false,false));
        questions1.add(new Question("This Roman leader defeated Mark Antony to eliminate the triumverate and establish himself as Emperor","Caesar Augustus",600,false,false));
        questions1.add(new Question("This Roman leader often has George Washington compared to him, and GW idolized him","Cincinnatus",800,false,false));
        questions1.add(new Question("This is the battle where the Romans begin to historically dominate Greece","Battle of Corinth",1000,false,false));
        
        ArrayList<Question> questions2 = new ArrayList<Question>();
        questions2.add(new Question("This US president once challenged a rival to a duel to the death with two broadneck swords","Abraham Lincoln",200,false,true));
        questions2.add(new Question("This US president was shot in the chest during a speech but continued delivering the speech","Teddy Roosevelt",400,false,false));
        questions2.add(new Question("This US president is often accredited with inventing the swivel office chair","Thomas Jefferson",600,false,false));
        questions2.add(new Question("He was the shortest US president","James Monroe",800,false,false));
        questions2.add(new Question("This US president installed a bowling alley in the White House because they loved bowling so much","Richard Nixon",1000,false,false));
        
        ArrayList<Question> questions3 = new ArrayList<Question>();
        questions3.add(new Question("This spell can be used to unlock doors","Alohomora",200,false,true));
        questions3.add(new Question("The Dursley's told Harry Potter his parents died via","Car accident",400,false,false));
        questions3.add(new Question("The make and model of Mr. Weasley's car that Harry and Ron stole","Ford Anglia",600,false,false));
        questions3.add(new Question("This newspaper was headquarted in Diagon Alley","The Daily Prophet",800,false,false));
        questions3.add(new Question("This was the one horcrux Voldemort never intended to create","Harry Potter",1000,false,false));
        
        ArrayList<Question> questions4 = new ArrayList<Question>();
        questions4.add(new Question("Mace Windu's lightsaber was this color","Purple",200,false,true));
        questions4.add(new Question("Rey found Luke on this planet","Ahch-To",400,false,false));
        questions4.add(new Question("Darth Sidious's master was whom?","Darth Plageuis",600,false,false));
        questions4.add(new Question("Admiral Ackbar dies in which movie?","The Last Jedi OR Episode 8",800,false,false));
        questions4.add(new Question("Darth Vader's mother was whom?","Shmi Skywalker",1000,false,false));
        
        ArrayList<Question> questions5 = new ArrayList<Question>();
        questions5.add(new Question("This operating system was created with the codename Whistler","Windows XP",200,false,true));
        questions5.add(new Question("This operating system was launched right around the turn of the century as a replacement to Windows NT 4.0","Windows 2000",400,false,false));
        questions5.add(new Question("This operating system, first released in May 2004, had its creator mysteriously disappear in 2008","CentOS",600,false,false));
        questions5.add(new Question("This operating system is the thirteenth major release of Apple Computer operating systems and was the first released under the macOS branding","macOS Sierra",800,false,false));
        questions5.add(new Question("Which operating system was created by Terry Davis with instructions from God?","TempleOS",1000,false,false));
        
        ArrayList<Question> questions6 = new ArrayList<Question>();
        questions6.add(new Question("How many times does suicide occur in Shakespeare's plays?","Thirteen",200,false,true));
        questions6.add(new Question("What is the name of Shakespeare's theater?","The Globe",400,false,false));
        questions6.add(new Question("Where is Shakespeare buried?","Holy Trinity Church",600,false,false));
        questions6.add(new Question("Which Shakespeare play(s) is/are written entirely in verse?","Richard II OR King John",800,false,false));
        questions6.add(new Question("\"Be not afraid of greatness. Some are born great, some achieve greatness, and other have greatness thrust upon them.\"","Twelfth Night",1000,false,false));
        
        ArrayList<Category> categories1 = new ArrayList<Category>();
        categories1.add(new Category("Ancient Rome",questions1,false));
        categories1.add(new Category("US Presidents",questions2,false));
        categories1.add(new Category("Harry Potter",questions3,false));
        categories1.add(new Category("Star Wars",questions4,false));
        categories1.add(new Category("Computer Operating Systems",questions5,false));
        categories1.add(new Category("Shakespeare",questions6,false));
        
        ArrayList<Question> questions7 = new ArrayList<Question>();
        questions7.add(new Question("The Lord of the Rings series was shot in this country","New Zealand",400,false,true));
        questions7.add(new Question("This actor accidentally pierced his foot with a shard of glass in the Fellowship of the Ring","Sean Astin",800,false,false));
        questions7.add(new Question("The fellowship all got these after they finished filming","Tattoos",1200,false,false));
        questions7.add(new Question("The Riders of Rohan really were a group of","Women",1600,false,false));
        questions7.add(new Question("Theoden's son was this character","Theodred",2000,false,false));
        
        ArrayList<Question> questions8 = new ArrayList<Question>();
        questions8.add(new Question("This Baltimore Ravens player holds the franchise record for most receiving TD","Todd Heap",400,false,true));
        questions8.add(new Question("This Baltimore Ravens player holds the franchise record for most passing yards","Joe Flacco",800,false,false));
        questions8.add(new Question("This Baltimore Ravens player was enshrined in the Pro Football Hall of Fame in 2018","Ray Lewis",1200,false,false));
        questions8.add(new Question("This Baltimore Ravens player was voted \"Ugliest Raven\" three consecutive years","Terrell Suggs",1600,false,false));
        questions8.add(new Question("This Baltimore Ravens coach won the first superbowl in Baltimore Ravens history","Brian Billick",2000,false,false));
        
        ArrayList<Question> questions9 = new ArrayList<Question>();
        questions9.add(new Question("This Baltimore Oriole has the highest batting average in franchise history","Heinie Manush",400,false,true));
        questions9.add(new Question("This Baltimore Oriole has the most hits in franchise history","Cal Ripken Jr",800,false,false));
        questions9.add(new Question("This Baltimore Oriole has the most walks in franchise history","Cal Ripken Jr",1200,false,false));
        questions9.add(new Question("The Baltimore Orioles transitioned to Baltimore, MD in this year","1953",1600,false,false));
        questions9.add(new Question("Oriole Park at Camden Yards opened in this year","1992",2000,false,false));
        
        ArrayList<Question> questions10 = new ArrayList<Question>();
        questions10.add(new Question("This author was an advisor to the Roman emperor Claudius and advised him on taking up history","Titus Livy",400,false,true));
        questions10.add(new Question("This author of the \"Lost Generation\" is most well known for his tragic love story of a mysterious millionaire in NYC","F. Scott Fitzgerald",800,false,false));
        questions10.add(new Question("This author wrote books like \"The Call of the Wild\" and \"White Fang\"","Jack London",1200,false,false));
        questions10.add(new Question("This author co-wrote \"The Art of the Deal\" before becoming US President","Donald J Trump",1600,false,false));
        questions10.add(new Question("This author graduated from La Salle University and wrote \"Silver Linings Playbook\"","Matthew Quick",2000,false,false));
        
        ArrayList<Question> questions11 = new ArrayList<Question>();
        questions11.add(new Question("This state is known as the \"Old Line State\"","Maryland",400,false,true));
        questions11.add(new Question("This state produces the most potatoes in the domestic United States","Idaho",800,false,false));
        questions11.add(new Question("This state has the most amount of coastline","Alaska",1200,false,false));
        questions11.add(new Question("This state is home to the only active diamond mine in the US","Arkansas",1600,false,false));
        questions11.add(new Question("The capital of this state is Cheyenne","Wyoming",2000,false,false));
        
        ArrayList<Question> questions12 = new ArrayList<Question>();
        questions12.add(new Question("This actor played Don Vito Corleone, from Sicily","Marlon Brando",400,false,true));
        questions12.add(new Question("This actor originally tried out for the part of Michael Corleone, before being given the part of young Vito Corleone in Part II","Robert DeNiro",800,false,false));
        questions12.add(new Question("This fruit is present around the time of a murder throughout the trilogy","Oranges",1200,false,false));
        questions12.add(new Question("This bodyguard was considered Don Vito Corleone's most loyal enforcer","Luca Brasi",1600,false,false));
        questions12.add(new Question("Tom Hagen wasn't considered a \"wartime\" consigliere because he was","German-Irish",2000,false,false));
        
        ArrayList<Category> categories2 = new ArrayList<Category>();
        categories2.add(new Category("Lord of the Rings",questions7,false));
        categories2.add(new Category("Baltimore Ravens",questions8,false));
        categories2.add(new Category("Baltimore Orioles",questions9,false));
        categories2.add(new Category("Authors",questions10,false));
        categories2.add(new Category("US States",questions11,false));
        categories2.add(new Category("The Godfather",questions12,false));
        
        Round round1 = new Round(categories1,true);
        Round round2 = new Round(categories2,false);
        
        // Add these rounds to the question set of the game
        this.rounds.add(round1);
        this.rounds.add(round2);
        
        // Create the strings inside the wheel
        this.updateWheel();
        
        
    }
    /**
    * This section is out of date and currently commented out to avoid errors
    * 
    public String toString(){
        String playerString = "Players: ";
        for(int i = 0; i<this.players.size();i++){
            playerString = playerString + this.players.get(i).toString() + "\n";
        }
        if(this.round == 1){
            return "Status: " + this.state + "\n"+ String.valueOf(this.round) + "\n" + this.rounds.round1.toString();
        }
        else{
            return "Status: " + this.state + "\n" + this.rounds.round2.toString();
        }
                    
                
    }
    */
    
    /**
     * Grabs the current player
     * @return current player
     */
    public Player getCurrentPlayer(){
        // Search each player until the current player is found
        for(Player p : this.players){
            if(p.isCurrent){
                return p;
            }
        }
        // If no player is found, return the player at [1]
        // Typically, this indicates an error
        this.players.get(1).isCurrent = true;
        return this.players.get(1);
    }
    
    /**
     * Gets the current active question
     * @return current question
     */
    public Question getCurrentQuestion(){
        // Get the current question from the current category of the current round
        Round cur_Round = this.getCurrentRound();
        Category cur_category = cur_Round.getCurrentCategory();
        return cur_category.getCurrentQuestion();
    }
    
    /**
     * Grabs the current Round
     * @return current round
     */
    public Round getCurrentRound(){
        //Search each round until the current player is found
        for(Round r : this.rounds){
            if(r.isCurrent){
                return r;
            }
        }
        // If no round is found, return the round at [1]
        // Typically, this indicates an error
        this.rounds.get(1).isCurrent = true;
        return this.rounds.get(1);
    }
    
    /**
     * Updates which player is the current player
     */
    public void updateCurrentPlayer(){
        int count = 0;
        int current_index = 0;
        // Find the index of the current player
        for(Player p : this.players){
            if(p.isCurrent){
                current_index = count;
            }
            count++;
        }
        // Turn off the current player flag
        this.players.get(current_index).isCurrent = false;
        
        // Set the isCurrent flag for the next player
        if(current_index == this.players.size()-1){
            this.players.get(0).isCurrent = true;
        }
        else{
            this.players.get(current_index + 1).isCurrent = true;
        }
        
        System.out.println("Current Player's Turn: " + this.getCurrentPlayer().name + "\n");
        
    }
    
    /**
     * Updates the game after a question is answered
     */
    public void update(){
        Round cur_round = this.getCurrentRound();
        cur_round.update();
        // Check if the current round id complete
        if(cur_round.isComplete){
            
            // If a round is finished, the players scores need to be updated
            for(Player p : this.players){
                p.updateTotalScore();
            }
            
            // Change rounds
            if(this.rounds.get(0).isCurrent){ // Move to the second round if it was the first round
                this.rounds.get(0).isCurrent = false;
                this.rounds.get(1).isCurrent = true;
                this.updateWheel();
                this.round = 2;
                JOptionPane.showMessageDialog(null, "Moving to Round 2");
                System.out.println("Moving to Round 2\n");
            }
            else{ // If the second round is complete, then the game is complete
                this.isComplete = true;
            }
            
        }
        
        
    }
    
    /**
     * Handles updating the wheel to contain the current category names
     */
    public void updateWheel(){
        // Remove wheel contents
        this.wheel.clear();
        // Grab current round
        Round curr_round = this.getCurrentRound();
        // Add default categories
        this.wheel.add("Bankrupt");
        this.wheel.add("Lose Turn");
        this.wheel.add("Free Turn");
        this.wheel.add("Player's Choice");
        this.wheel.add("Opponent's Choice");
        this.wheel.add("Double Score");
        // Add each category to the wheel
        for(Category c : curr_round.categories){
            this.wheel.add(c.name);
        }
    }
    
    /**
     * Handles the spinning of the wheel and updates accordingly
     */
    public void spinWheel() throws IOException{
        
        InputStreamReader inputStreamReader; // This is only needed to take input from the console
        String input;
        
        Round curr_round = this.getCurrentRound();
        
        // Randomly choose a string from the wheel
        int r = new Random().nextInt(wheel.size());
        String wedge = wheel.get(r);
        System.out.println("The wheel landed on " + wedge); // Print what was chosen
        this.sector = wedge;
        
        // Update the number of spins remaining
        curr_round.spinsRemaining = curr_round.spinsRemaining - 1;
        System.out.println("Spins Remaining: " + String.valueOf(curr_round.spinsRemaining)+ "\n");
        
        // Handle the selected wedge
        switch(wedge){
            case "Bankrupt":
                this.getCurrentPlayer().roundScore = 0; // Set the round score to zero
                this.updateCurrentPlayer(); // Move to the next player
                break;
            case "Free Turn":
                this.getCurrentPlayer().freeTurns++; // Give the current player a free turn tokem
                System.out.println("Free Turns: " + String.valueOf(this.getCurrentPlayer().freeTurns));
                break;
            case "Double Score":
                this.getCurrentPlayer().roundScore = this.getCurrentPlayer().roundScore*2; // Double the current player's score
                System.out.println(this.getCurrentPlayer().name + ": " + String.valueOf(this.getCurrentPlayer().roundScore));
                break;
            case "Lose Turn":
                break;
            case "Player's Choice": // Player's choice and Opponent's Choice are essentially the same as far as the model is concerned            
            case "Opponent's Choice":
                this.state = GAME_STATE_ENUM.PLAYERS_CHOICE;
                // Moves to the default after getting the category
            default:
                // Set the selected category to current unless that category is complete
                for(Category c : curr_round.categories){
                    if(c.name.equals(wedge) && !c.isComplete){
                        c.isCurrent = true;
                    }
                }
                break;
        }
    }
    
    /**
     * Returns the current state of the game
     * @return state
     */
    public GAME_STATE_ENUM getState(){
        return this.state;
    }
    
    /**
     * Sets the game state to a new GAME_STATE_ENUM
     * @param state - state to be changed to
     */
    public void setState(GAME_STATE_ENUM state){
        this.state = state;
    }
    
    /**
     * Resets the game to its default state
     */
    public void resetGame(){
        this.players.clear();
        this.isComplete = false;
        this.rounds.clear();
        this.wheel.clear();
        this.init();
    }
    
}

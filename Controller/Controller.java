
package Controller;
import View.*;
import Model.*;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *The controller initializes the model and view and begins the loop for running the Wheel of Jeopardy game
 * @author Greg
 */
public class Controller {
    Model model;
    View view;
    ViewGameboard gameboard;
    QuestionEditor q;
    Answer a;
    MainMenu mainmenu;
    TokenYesNo tokenYesNo;
    
    
    /**
     * Constructor for creating a Controller
     * @param model - the active model that contains all game logic
     * @param view  - the active view use to display the model
     */
    public Controller(Model model, MainMenu mainmenu, ViewGameboard gameboard,QuestionEditor q, Answer a, TokenYesNo t){
        this.model = model;
        this.mainmenu = mainmenu;
        this.gameboard = gameboard;
        this.q = q;
        this.a = a;
        this.tokenYesNo = t;
    }
    
    /**
     * Main is called when starting the Wheel of Jeopardy game
     * @param args
     * @throws IOException - this is only there for the input from the command line.
     *                       Probably won't be needed once all buttons are added.
     */
    public static void main(String[] args) throws IOException{
        System.out.println("Beginning Wheel of Jeopardy");
        // Create a model
        Model model = new Model();
        // Create a view
        //View view = new View(model);
        
        MainMenu mainmenu = new MainMenu(model);
        ViewGameboard gameboard= new ViewGameboard(model);
        QuestionEditor q_edit = new QuestionEditor(model);
        Answer answer_view = new Answer(model);
        TokenYesNo t = new TokenYesNo(model);
        
        mainmenu.setVisible(true);
        
        // Create a controller using the model and view
        Controller controller = new Controller(model,mainmenu,gameboard,q_edit,answer_view, t);
        // Begin the loop for the game
        while(true){
            controller.update();
        }
    }
    
    /**
     * Updates the model first, then the view
     * @throws IOException - same as above
     */
    public void update() throws IOException{
        this.model.update();
        this.a.update_view();
        //this.q.update_view();
        
        
        if(this.mainmenu.view_flag == VIEW_ENUM.GAMEBOARD){
            this.gameboard.setVisible(true);
            this.mainmenu.setVisible(false);
            this.mainmenu.view_flag = VIEW_ENUM.NONE;
        }
        else if(this.mainmenu.view_flag == VIEW_ENUM.QUESTION_ENTRY){
            this.q.setVisible(true);
            this.mainmenu.setVisible(false);
            this.mainmenu.view_flag = VIEW_ENUM.NONE;
        }
        
        else if(this.q.view_flag == VIEW_ENUM.MAIN_MENU){
            this.q.setVisible(false);
            this.mainmenu.setVisible(true);
            this.q.view_flag = VIEW_ENUM.NONE;
        }
        
        else if(this.gameboard.view_flag == VIEW_ENUM.ANSWER){
            this.gameboard.setVisible(false);
            this.a.setVisible(true);
            this.gameboard.view_flag = VIEW_ENUM.NONE;
            
        }
        else if(this.a.view_flag == VIEW_ENUM.GAMEBOARD){
            this.a.setVisible(false);
            this.gameboard.setVisible(true);
            this.a.view_flag = VIEW_ENUM.NONE;
        }
        else if(this.a.view_flag == VIEW_ENUM.TOKEN){
            this.a.setVisible(false);
            this.tokenYesNo.setVisible(true);
            this.a.view_flag = VIEW_ENUM.NONE;
        }
        else if(this.tokenYesNo.view_flag == VIEW_ENUM.GAMEBOARD){
            this.tokenYesNo.setVisible(false);
            this.gameboard.setVisible(true);
            this.tokenYesNo.view_flag = VIEW_ENUM.NONE;
        }
        else if(this.gameboard.view_flag == VIEW_ENUM.TOKEN){
            this.gameboard.setVisible(false);
            this.tokenYesNo.setVisible(true);
            this.gameboard.view_flag = VIEW_ENUM.NONE;
        }
        this.gameboard.update_view();
    } //end update

    
    
} //end controller class

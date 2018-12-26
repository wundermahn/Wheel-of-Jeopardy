/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Model;
import Controller.Controller;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.BorderLayout;

/**
 * This is mostly just a place holder. Should be replaced by Tony and Pat's code
 * @author Greg
 */
public class View {

    public View(){
        
    }
    
//    public void init(View thisview) {
//        // Create a frame and add a button that does nothing
//        frame = new JFrame("Mainframe");
//        button = new JButton("Button");
//        frame.add(button,BorderLayout.WEST);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(windowX, windowY);
//        
//        frame.setVisible(true);
//
//    }
//    
//    
//    public void setController(Controller controller) {
//            this.controller = controller;
//    }
//    
    /**
     * This function would be where the view would look at the current state of the model and display its content
     * 
     * I would expect this to be a switch based on the GAME_STATE_ENUMS
     */
    public void update(){
        System.out.println("Update View");
    }
    
}

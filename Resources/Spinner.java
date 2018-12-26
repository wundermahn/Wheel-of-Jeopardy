/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import View.ViewGameboard;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author knowlzee
 */
public class Spinner extends javax.swing.JLabel {
    BufferedImage img;
    double rotate_angle;
    
    /**
     * Creates new form Spinner
     */
    public Spinner() {
        initComponents();
        LoadImage("/Resources/Spinner_62by60.png");
    }
    
    public void LoadImage(String FilePath){
        try {
            img = ImageIO.read(getClass().getResource(FilePath));
        } catch (IOException ex) {
            Logger.getLogger(ViewGameboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        ImageIcon icon = new ImageIcon(getClass().getResource("/Resources/Spinner_62by60.png"));
        BufferedImage blankCanvas = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D) blankCanvas.getGraphics();
        g2.rotate(Math.toRadians(45), icon.getIconWidth()/2, icon.getIconHeight()/2);
        g2.drawImage(getClass().getResource("/Resources/Spinner_62by60.png"), 0,0, o);*/
    }
    
    public void rotateImage(int angle){
       rotate_angle = angle;
       repaint();
   }
    
    @Override
    public void paint(Graphics g){
       super.paint(g);
       if(img!=null){
           Graphics2D g2D = (Graphics2D) g;
           g2D.translate(this.getSize().width/2, this.getSize().height/2);
           g2D.rotate(Math.toRadians(rotate_angle));
           g2D.drawImage(img, -img.getWidth()/2, -img.getHeight()/2, null);      
       }       
   }
   
   /*public void paintComponent(Graphics g){
       
       BufferedImage Apple = LoadImage("Apple.png");
       AffineTransform at;
       at = new AffineTransform.getTranslateInstance(100,100);
       at.rotate(Math.toRadians(45), Apple.getWidth()/2, Apple.getHeight()/2);
       
       
       Graphics2D g2d = (Graphics2D) g;
       g2d.drawImage(Apple, at, null);
       
   }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
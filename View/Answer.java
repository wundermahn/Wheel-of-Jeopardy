/*
Code was created by Anthony (Tony) Kelly as a result of Johns Hopkins Engineering for Professionals course 605.621.84 - 
Foundations of Software Engineering.

The following code should create and initiate the Scoreboard class, and should require all I/O listed in the Team DMV SRS & Design Documents.
*/

package View;
import Model.*;
import java.awt.Color;

public class Answer extends javax.swing.JFrame {
    Model model;
    public VIEW_ENUM view_flag;

    public Answer(Model model) {
        this.model = model;
        this.view_flag = VIEW_ENUM.NONE;
        initComponents();
        btnCorrect.setBackground(Color.GREEN);
        Color backgroundYellow = new Color(255,204,51);
        this.getContentPane().setBackground(backgroundYellow);
        
     /*   
        
        Player p = Game.getCurrentPlayer();
        int currScore = p.getScore();
        
        // I can then use currScore to increment / decrement?
    */
     
    }
    
    public void update_view(){
        Player p = this.model.game.getCurrentPlayer();
        int currScore = p.getRoundScore();
        
        Question q = this.model.game.getCurrentQuestion();
        
        this.lblAnswer.setText(model.game.getCurrentQuestion().answer);
        
    }
    
    
    
/*        
    Question testQuestion = new Question("Is this working?", "Probably not", 1000000, true, true);
    
        
        public void setAnswer(Question theQuestion){
        /*return theQuestion.getAnswer();
        this.lblAnswer.setText(theQuestion.getAnswer());
    } //should grab the answer from the current question

    setAnswer(testQuestion);
   */ 
        
        
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAnswer = new javax.swing.JPanel();
        lblAnswer = new javax.swing.JLabel();
        panelResponse = new javax.swing.JPanel();
        btnCorrect = new javax.swing.JButton();
        btnIncorrect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Answer Screen | Wheel of Jeopardy");
        setBackground(new java.awt.Color(255, 204, 51));

        panelAnswer.setBackground(new java.awt.Color(255, 204, 51));

        lblAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnswer.setToolTipText("");
        lblAnswer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout panelAnswerLayout = new javax.swing.GroupLayout(panelAnswer);
        panelAnswer.setLayout(panelAnswerLayout);
        panelAnswerLayout.setHorizontalGroup(
            panelAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAnswerLayout.setVerticalGroup(
            panelAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelResponse.setBackground(new java.awt.Color(255, 204, 51));

        btnCorrect.setBackground(new java.awt.Color(102, 255, 102));
        btnCorrect.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCorrect.setForeground(new java.awt.Color(51, 204, 0));
        btnCorrect.setText("Correct");
        btnCorrect.setActionCommand("btnCorrect");
        btnCorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrectActionPerformed(evt);
            }
        });

        btnIncorrect.setBackground(new java.awt.Color(255, 102, 102));
        btnIncorrect.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnIncorrect.setForeground(new java.awt.Color(204, 0, 0));
        btnIncorrect.setText("Incorrect");
        btnIncorrect.setActionCommand("");
        btnIncorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncorrectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResponseLayout = new javax.swing.GroupLayout(panelResponse);
        panelResponse.setLayout(panelResponseLayout);
        panelResponseLayout.setHorizontalGroup(
            panelResponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResponseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnIncorrect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelResponseLayout.setVerticalGroup(
            panelResponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResponseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnIncorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelResponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelResponse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrectActionPerformed
        // TODO add your handling code here:
        this.model.user_input = USER_INPUT_ENUM.CORRECT;
        this.view_flag = VIEW_ENUM.GAMEBOARD;
        
    }//GEN-LAST:event_btnCorrectActionPerformed

    private void btnIncorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncorrectActionPerformed
        // TODO add your handling code here:
        this.model.user_input = USER_INPUT_ENUM.INCORRECT;
        if (this.model.game.getCurrentPlayer().freeTurns > 0){
            this.view_flag = VIEW_ENUM.TOKEN;
        }
        else{
            this.view_flag = VIEW_ENUM.GAMEBOARD;
        }
        
    }//GEN-LAST:event_btnIncorrectActionPerformed
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorrect;
    private javax.swing.JButton btnIncorrect;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JPanel panelAnswer;
    private javax.swing.JPanel panelResponse;
    // End of variables declaration//GEN-END:variables


//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Answer().setVisible(true);
//            }
//        });       
//
//    } //end psvm  
} //end class
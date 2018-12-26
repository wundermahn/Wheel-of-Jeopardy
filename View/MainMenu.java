/*
Code was created by Anthony (Tony) Kelly as a result of Johns Hopkins Engineering for Professionals course 605.621.84 - 
Foundations of Software Engineering.

The following code should create and initiate the main menu class, and should require all I/O listed in the Team DMV SRS & Design Documents.
*/

package View;
import Model.Model;
import Model.USER_INPUT_ENUM;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    public Model model;
    public VIEW_ENUM view_flag;
    
    public MainMenu(Model model)  {
        initComponents();
        this.model = model;
        //Manually overriden features
        Color backgroundYellow = new Color(255,204,51); //added this line 2-of-3
        this.getContentPane().setBackground(backgroundYellow); //added this line 3-of-3
        this.view_flag = VIEW_ENUM.NONE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogistics = new javax.swing.JPanel();
        btnTutorial = new javax.swing.JButton();
        btnQuestions = new javax.swing.JButton();
        panelNotes = new javax.swing.JPanel();
        btnDevNotes = new javax.swing.JButton();
        btnRelease = new javax.swing.JButton();
        btnPlans = new javax.swing.JButton();
        panelLabel = new javax.swing.JPanel();
        lblWOJ = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        panelGame = new javax.swing.JPanel();
        btnTriple = new javax.swing.JButton();
        lblGame = new javax.swing.JLabel();
        lblLogistics = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        lblTech = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu | Wheel of Jeopardy");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 204, 51));
        setName("frame_MainMenu"); // NOI18N
        setResizable(false);

        panelLogistics.setBackground(new java.awt.Color(102, 153, 255));
        panelLogistics.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));

        btnTutorial.setBackground(new java.awt.Color(255, 204, 0));
        btnTutorial.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTutorial.setForeground(new java.awt.Color(0, 51, 255));
        btnTutorial.setText("Wheel of Jeopardy Tutorial");
        btnTutorial.setToolTipText("");
        btnTutorial.setActionCommand("btnTutorial");
        btnTutorial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        btnTutorial.setMaximumSize(new java.awt.Dimension(185, 35));
        btnTutorial.setMinimumSize(new java.awt.Dimension(185, 35));
        btnTutorial.setPreferredSize(new java.awt.Dimension(185, 35));
        btnTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialActionPerformed(evt);
            }
        });

        btnQuestions.setBackground(new java.awt.Color(255, 204, 0));
        btnQuestions.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnQuestions.setForeground(new java.awt.Color(0, 51, 255));
        btnQuestions.setText("Edit Questions");
        btnQuestions.setToolTipText("");
        btnQuestions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        btnQuestions.setMaximumSize(new java.awt.Dimension(185, 35));
        btnQuestions.setMinimumSize(new java.awt.Dimension(185, 35));
        btnQuestions.setPreferredSize(new java.awt.Dimension(185, 35));
        btnQuestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLogisticsLayout = new javax.swing.GroupLayout(panelLogistics);
        panelLogistics.setLayout(panelLogisticsLayout);
        panelLogisticsLayout.setHorizontalGroup(
            panelLogisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLogisticsLayout.setVerticalGroup(
            panelLogisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogisticsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLogisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        btnTutorial.getAccessibleContext().setAccessibleName("btnTutorial");

        panelNotes.setBackground(new java.awt.Color(102, 153, 255));
        panelNotes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));

        btnDevNotes.setBackground(new java.awt.Color(255, 204, 0));
        btnDevNotes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDevNotes.setForeground(new java.awt.Color(0, 51, 255));
        btnDevNotes.setToolTipText("");
        btnDevNotes.setActionCommand("btnDevNotes");
        btnDevNotes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        btnDevNotes.setLabel("Developer's Notes");
        btnDevNotes.setMaximumSize(new java.awt.Dimension(185, 35));
        btnDevNotes.setMinimumSize(new java.awt.Dimension(185, 35));
        btnDevNotes.setPreferredSize(new java.awt.Dimension(185, 35));
        btnDevNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevNotesActionPerformed(evt);
            }
        });

        btnRelease.setBackground(new java.awt.Color(255, 204, 0));
        btnRelease.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRelease.setForeground(new java.awt.Color(0, 51, 255));
        btnRelease.setText("Release History");
        btnRelease.setToolTipText("");
        btnRelease.setActionCommand("btnRelease");
        btnRelease.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        btnRelease.setMaximumSize(new java.awt.Dimension(185, 35));
        btnRelease.setMinimumSize(new java.awt.Dimension(185, 35));
        btnRelease.setPreferredSize(new java.awt.Dimension(185, 35));
        btnRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReleaseActionPerformed(evt);
            }
        });

        btnPlans.setBackground(new java.awt.Color(255, 204, 0));
        btnPlans.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPlans.setForeground(new java.awt.Color(0, 51, 255));
        btnPlans.setText("Future Plans");
        btnPlans.setToolTipText("");
        btnPlans.setActionCommand("btnPlans");
        btnPlans.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        btnPlans.setMaximumSize(new java.awt.Dimension(185, 35));
        btnPlans.setMinimumSize(new java.awt.Dimension(185, 35));
        btnPlans.setPreferredSize(new java.awt.Dimension(185, 35));
        btnPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlansActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNotesLayout = new javax.swing.GroupLayout(panelNotes);
        panelNotes.setLayout(panelNotesLayout);
        panelNotesLayout.setHorizontalGroup(
            panelNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnDevNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPlans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNotesLayout.setVerticalGroup(
            panelNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDevNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelease, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlans, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRelease.getAccessibleContext().setAccessibleName("btnRelease");

        panelLabel.setBackground(new java.awt.Color(101, 151, 255));
        panelLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));

        lblWOJ.setBackground(new java.awt.Color(102, 153, 255));
        lblWOJ.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblWOJ.setForeground(new java.awt.Color(255, 204, 0));
        lblWOJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWOJ.setText("!~Welcome to The Wheel of Jeopardy~!");
        lblWOJ.setToolTipText("");
        lblWOJ.setName("lblWOJ"); // NOI18N

        javax.swing.GroupLayout panelLabelLayout = new javax.swing.GroupLayout(panelLabel);
        panelLabel.setLayout(panelLabelLayout);
        panelLabelLayout.setHorizontalGroup(
            panelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWOJ, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLabelLayout.setVerticalGroup(
            panelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWOJ)
                .addContainerGap())
        );

        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Wheel_389by388.png"))); // NOI18N

        panelGame.setBackground(new java.awt.Color(102, 153, 255));
        panelGame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));
        panelGame.setForeground(new java.awt.Color(102, 153, 255));

        btnTriple.setBackground(new java.awt.Color(255, 204, 0));
        btnTriple.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTriple.setForeground(new java.awt.Color(0, 51, 255));
        btnTriple.setText("Play a 3-Team Game");
        btnTriple.setToolTipText("");
        btnTriple.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        btnTriple.setMaximumSize(new java.awt.Dimension(185, 35));
        btnTriple.setMinimumSize(new java.awt.Dimension(185, 35));
        btnTriple.setPreferredSize(new java.awt.Dimension(185, 35));
        btnTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGameLayout = new javax.swing.GroupLayout(panelGame);
        panelGame.setLayout(panelGameLayout);
        panelGameLayout.setHorizontalGroup(
            panelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTriple, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGameLayout.setVerticalGroup(
            panelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnTriple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblGame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGame.setForeground(new java.awt.Color(0, 51, 255));
        lblGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGame.setLabelFor(panelGame);
        lblGame.setText("Select Your Game Mode");

        lblLogistics.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogistics.setForeground(new java.awt.Color(0, 51, 255));
        lblLogistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogistics.setLabelFor(panelLogistics);
        lblLogistics.setText("Game Settings");

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 51, 51));
        btnQuit.setText("Exit");
        btnQuit.setActionCommand("btnQuit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        lblTech.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTech.setForeground(new java.awt.Color(0, 51, 255));
        lblTech.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTech.setLabelFor(panelNotes);
        lblTech.setText("Technical Information");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/newTeamDMV.png"))); // NOI18N
        lblLogo.setText("jLabel2");
        lblLogo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogistics, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelLogistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblGame, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(303, 303, 303))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTech, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPicture)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(panelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGame, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblLogistics, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelLogistics, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lblTech, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionsActionPerformed
        this.view_flag = VIEW_ENUM.QUESTION_ENTRY;
        this.model.user_input = USER_INPUT_ENUM.QUESTION_ENTRY;
    }//GEN-LAST:event_btnQuestionsActionPerformed

    
/* ***************************************************
    The code sections below are try catch statement that allow the program to open up documents.
   **************************************************
*/
    private void btnDevNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevNotesActionPerformed
        // Should display the "Developer's Notes" .pdf
        
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Kelly\\Desktop\\WoJ_Docs\\TeamDMV_Dev_Notes.pdf");
        } //end try
        
        catch (Exception e)
         {
            JOptionPane.showMessageDialog(null, "Error");
         } //end catch  
        
    }//GEN-LAST:event_btnDevNotesActionPerformed

    private void btnPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlansActionPerformed
        // Should display the "Future Actions" .pdf
        
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Kelly\\Desktop\\WoJ_Docs\\Future_Plans.pdf");
        } //end try
        
        catch (Exception e)
         {
            JOptionPane.showMessageDialog(null, "Error");
         } //end catch  
        
    }//GEN-LAST:event_btnPlansActionPerformed

    private void btnReleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReleaseActionPerformed
        // Should display release version information
        
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Kelly\\Desktop\\WoJ_Docs\\Release_History.pdf");
        } //end try
        
        catch (Exception e)
         {
            JOptionPane.showMessageDialog(null, "Error");
         } //end catch  
        
    }//GEN-LAST:event_btnReleaseActionPerformed

    private void btnTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorialActionPerformed
        // Should prompt the download of the Tutorial documentation (.docx / .pdf?)
        
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\Kelly\\Desktop\\WoJ_Docs\\");
        } //end try
        
        catch (Exception e)
         {
            JOptionPane.showMessageDialog(null, "Error");
         } //end catch        
    }//GEN-LAST:event_btnTutorialActionPerformed

    private void btnTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripleActionPerformed
        // Should begin a new game, and switch the model
        //JOptionPane.showMessageDialog(null, "My Goodness, this is so concise"); //event happens
        this.view_flag = VIEW_ENUM.GAMEBOARD;
        this.model.user_input = USER_INPUT_ENUM.START_GAME;
    }//GEN-LAST:event_btnTripleActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0); //closes the system
    }//GEN-LAST:event_btnQuitActionPerformed


//    public static void main(String args[]) {
//        // Create and display the form
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            Model model = new Model();
//            public void run() {
//                new MainMenu(model).setVisible(true);
//            } //end public void
//        });
//    } //end psvm

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevNotes;
    private javax.swing.JButton btnPlans;
    private javax.swing.JButton btnQuestions;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRelease;
    private javax.swing.JButton btnTriple;
    private javax.swing.JButton btnTutorial;
    private javax.swing.JLabel lblGame;
    private javax.swing.JLabel lblLogistics;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblTech;
    private javax.swing.JLabel lblWOJ;
    private javax.swing.JPanel panelGame;
    private javax.swing.JPanel panelLabel;
    private javax.swing.JPanel panelLogistics;
    private javax.swing.JPanel panelNotes;
    // End of variables declaration//GEN-END:variables
} //end MainMenu class
/*
Code was created by Anthony (Tony) Kelly as a result of Johns Hopkins Engineering for Professionals course 605.621.84 - 
Foundations of Software Engineering.

The following code should create and initiate the main menu class, and should require all I/O listed in the Team DMV SRS & Design Documents.
*/

package View;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Model.*;
import Model.USER_INPUT_ENUM;
import View.VIEW_ENUM;


public class QuestionEditor extends javax.swing.JFrame {

    public Model model;
    public VIEW_ENUM view_flag;
    private int currRound = 0;    
    public QuestionEditor(Model model) {
       
        initComponents();        
        this.model = model;
        // SETTING LIST MODELS FOR JLISTS 
        
        DefaultListModel category = new DefaultListModel();
        for(Round r : this.model.game.rounds){
            for(Category c : r.categories){
                category.addElement(c.name);
            } //end category loop
        }//end for round loop      
        listCategory.setModel(category);
        
        DefaultListModel question = new DefaultListModel();
        for(Round r : this.model.game.rounds){
            for(Category c : r.categories){
                for(Question q : c.questions){
                    question.addElement(c.name + " || " + q.questionString);
                } //end question loop
            } //end category loop
        } //end round loop
        listQuestion.setModel(question);
        
        // SETTING LIST MODELS FOR JLISTS            
        
    } //end questioneditor constructor

    public int getCurrRound() {
        return currRound;
    }

    public void setCurrRound(int currRound) {
        this.currRound = currRound;
    }
    
    public void setList(){
        JOptionPane.showMessageDialog(null, "Updated."); 
        DefaultListModel category = new DefaultListModel();
        for(Round r : this.model.game.rounds){
            for(Category c : r.categories){
                category.addElement(c.name);
            } //end category loop
        }//end for round loop      
        listCategory.setModel(category);    
        
        DefaultListModel question = new DefaultListModel();
        for(Round r : this.model.game.rounds){
            for(Category c : r.categories){
                for(Question q : c.questions){
                    question.addElement(c.name + " || " + q.questionString);
                } //end question loop
            } //end category loop
        } //end round loop
        listQuestion.setModel(question);            
        
    } //end category list


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButtons = new javax.swing.JPanel();
        paneListQuestion = new javax.swing.JScrollPane();
        listQuestion = new javax.swing.JList<>();
        paneListCategory = new javax.swing.JScrollPane();
        listCategory = new javax.swing.JList<>();
        btnCategory = new javax.swing.JButton();
        btnQuestion = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        listQuestion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        paneListQuestion.setViewportView(listQuestion);

        listCategory.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        paneListCategory.setViewportView(listCategory);

        btnCategory.setText("Edit Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });

        btnQuestion.setText("Edit Question");
        btnQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionActionPerformed(evt);
            }
        });

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 51, 51));
        btnQuit.setText("Return to Main Menu");
        btnQuit.setActionCommand("btnQuit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(paneListCategory, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                    .addComponent(paneListQuestion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelButtonsLayout.createSequentialGroup()
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneListCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                    .addGroup(panelButtonsLayout.createSequentialGroup()
                        .addComponent(btnQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneListQuestion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
     //   JOptionPane.showMessageDialog(null, "This works"); just an alert to test the button worked
        this.view_flag = VIEW_ENUM.MAIN_MENU;
        this.model.user_input = USER_INPUT_ENUM.MAIN_MENU;
        //this.model.game.mainmenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionActionPerformed
        String newQuestion = JOptionPane.showInputDialog(null, "Enter new Question");
    //    String newQuestionCat = JOptionPane.showInputDialog(null, "Enter new Question's category");
        int selectedIx = listQuestion.getSelectedIndex();
      
        // GRABBING CURRENT ROUND
        if(this.model.game.rounds.get(0).isCurrent){
            setCurrRound(1);
        } else{
            setCurrRound(2);
        }        
        
        if (selectedIx < 30){
            this.model.user_input_index.add(0);
        }else{
            selectedIx -= 30;
            this.model.user_input_index.add(1);
        }         
        
        int selQuest = (selectedIx % 5);       
        int selCat = selectedIx / 6;
        if (selectedIx >= 6){
            selCat += 1;
        }
   
        // Provide the model the index        
        this.model.user_input_index.add(selCat);
        this.model.user_input_index.add(selQuest);
        this.model.user_input_index.add(selectedIx);
        this.model.user_input_string.add(newQuestion);
     //   this.model.user_input_string.add(newQuestionCat);
        this.model.user_input = USER_INPUT_ENUM.ADD_QUESTION;
     
       setList();
    }//GEN-LAST:event_btnQuestionActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        String newCat = JOptionPane.showInputDialog(null, "Enter new Category");
        int selectedIx = listCategory.getSelectedIndex();      
        System.out.println("Category is " + newCat);
        
        // GRABBING CURRENT ROUND
        if(this.model.game.rounds.get(0).isCurrent){
            setCurrRound(0);
        } else{
            setCurrRound(1);
        }
        
        // Provide the model the index
        
        if (selectedIx < 6){
            this.model.user_input_index.add(0);
        }else{
            selectedIx -= 6;
            this.model.user_input_index.add(1);
        }
        
//        this.model.user_input_index.add(0);
// this.model.user_input_index.add(currRound);//THIS SHOULD BE THE CURRENT ROUND, NOT 0. I DONT KNOW HOW YOU ARE DETERMINING ROUND
        this.model.user_input_index.add(selectedIx);
        this.model.user_input_string.add(newCat);
        this.model.user_input = USER_INPUT_ENUM.ADD_CATEGORY;

        setList();       
    }//GEN-LAST:event_btnCategoryActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnQuestion;
    private javax.swing.JButton btnQuit;
    private javax.swing.JList<String> listCategory;
    private javax.swing.JList<String> listQuestion;
    private javax.swing.JScrollPane paneListCategory;
    private javax.swing.JScrollPane paneListQuestion;
    private javax.swing.JPanel panelButtons;
    // End of variables declaration//GEN-END:variables


    }

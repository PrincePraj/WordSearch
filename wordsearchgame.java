/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;


/**
 *
 * @author PRINCE
 */
public class wordsearchgame extends javax.swing.JFrame {

    /**
     * Creates new form wordsearchgame
     */
    String [] words={"driver","signature","history","response","president","highway","computer","appartment","forest","lawyer"};
    int index=-1;
    
    Border panel_border=BorderFactory.createMatteBorder(2,2, 2, 2, Color.black);
  
    public wordsearchgame() {
      
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setBorder(panel_border);
     displayWord();
        
        jButton_NEXT.setEnabled(false);
    }
    
   
    // create a function to display the word
    public void displayWord()
    {
        // default text
        if(index == -1)
        {
            jLabel_WORD.setText("--Word--");
            jTextField_GUESS.setText("--Guess--");
        }
        else
        {
            // get random position
            int pos1 = (int) (Math.random() * words[index].length());
            int pos2 = (int) (Math.random() * words[index].length());
            int pos3 = (int) (Math.random() * words[index].length());
            
            // set '_' at random positions
            StringBuilder newtext = new StringBuilder(words[index]);
            newtext.setCharAt(pos1, '_');
            newtext.setCharAt(pos2, '_');
            newtext.setCharAt(pos3, '_');
            
            // set text to the jlabel
            jLabel_WORD.setText(newtext.toString());
        }
    }
    static int sc=0;
    String a;
    String b;
    
    // create a function to check if the user guessed the correct word
    public void checkWord()
    {
        // if the guess is correct
        if(!jTextField_GUESS.getText().equals(words[index]))
        {
            jLabel_RESULT.setText("Wrong");
            sc=sc-10;
            jLabel_RESULT.setBackground(Color.red);
             a=Integer.toString(sc);
            jLabel_check.setText(a);
        }       
        else
        {
            jLabel_RESULT.setText("Correct");
            sc=sc+10;
            jLabel_RESULT.setBackground(Color.green);
            b=Integer.toString(sc);
           jLabel_check.setText(b);
          
        }
        // if not


        // if it's the last word in the list
        if(index == words.length - 1)
        {
            jButton_NEXT.setEnabled(false);
            jButton_START.setEnabled(true);
        }
        jTextField_GUESS.setText("");
    }
    
    
     // label to close the form
                                         

    // button start / restart the game
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_WORD = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jButton_NEXT = new javax.swing.JButton();
        jButton_START = new javax.swing.JButton();
        jLabel_RESULT = new javax.swing.JLabel();
        jTextField_GUESS = new javax.swing.JTextField();
        jLabel_score = new javax.swing.JLabel();
        jLabel_check = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_WORD.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_WORD.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel_WORD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_WORD.setText("WORD");
        jLabel_WORD.setOpaque(true);

        jLabel_Close.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel_Close.setText("X");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jButton_NEXT.setBackground(new java.awt.Color(255, 102, 51));
        jButton_NEXT.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton_NEXT.setText("NEXT");
        jButton_NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NEXTActionPerformed(evt);
            }
        });

        jButton_START.setBackground(new java.awt.Color(51, 153, 255));
        jButton_START.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton_START.setText("START");
        jButton_START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_STARTActionPerformed(evt);
            }
        });

        jLabel_RESULT.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel_RESULT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_RESULT.setText("RESULT");
        jLabel_RESULT.setOpaque(true);

        jTextField_GUESS.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField_GUESS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_GUESS.setText("GUESS");
        jTextField_GUESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_GUESSActionPerformed(evt);
            }
        });

        jLabel_score.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_score.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel_score.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_score.setText("Score :");

        jLabel_check.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_check.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_check.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_check.setText("value");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton_NEXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_START, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_RESULT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_WORD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_GUESS, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_score, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel_check)
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_WORD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_GUESS, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_NEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_START, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_RESULT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_score, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_check, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NEXTActionPerformed
        checkWord();
        if(index < words.length - 1)
        {
           index++;
           displayWord(); 
        }
    }//GEN-LAST:event_jButton_NEXTActionPerformed

    private void jButton_STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_STARTActionPerformed
                                                    
        // start or restart the game
        index = 0;
        jTextField_GUESS.setText("");
        jButton_NEXT.setEnabled(true);
        jButton_START.setEnabled(false);
        jLabel_RESULT.setText("Result");
        jLabel_RESULT.setBackground(new java.awt.Color(102, 102, 102));
        displayWord(); 
        
                                              
    }//GEN-LAST:event_jButton_STARTActionPerformed

    private void jTextField_GUESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_GUESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_GUESSActionPerformed
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(wordsearchgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wordsearchgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wordsearchgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wordsearchgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wordsearchgame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_NEXT;
    private javax.swing.JButton jButton_START;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_RESULT;
    private javax.swing.JLabel jLabel_WORD;
    private javax.swing.JLabel jLabel_check;
    private javax.swing.JLabel jLabel_score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_GUESS;
    // End of variables declaration//GEN-END:variables

   

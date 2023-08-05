package com.mycompany.resumebuilder;

import com.mycompany.resumebuilder.Backend.DatabaseManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author EdenChung
 */
public class Authentication extends javax.swing.JFrame {

    /**
     * Creates new form Authentication
     */
    public Authentication() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AuthenticationGrid = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPlaceHolderUsername = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldAuth = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        SignInButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AuthenticationGrid.setLayout(new java.awt.GridLayout(4, 2, 10, 15));

        jLabel1.setText("Username");
        AuthenticationGrid.add(jLabel1);

        jTextFieldPlaceHolderUsername.setPlaceHolder("Username");
        AuthenticationGrid.add(jTextFieldPlaceHolderUsername);

        jLabel4.setText("Password");
        AuthenticationGrid.add(jLabel4);
        AuthenticationGrid.add(jPasswordFieldAuth);
        AuthenticationGrid.add(jLabel2);

        SignInButton.setText("Sign in");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        AuthenticationGrid.add(SignInButton);
        AuthenticationGrid.add(jLabel5);

        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AuthenticationGrid.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AuthenticationGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AuthenticationGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewAccount createAccountFrame = new NewAccount();
        createAccountFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        String username = jTextFieldPlaceHolderUsername.getText();
        String password = new String(jPasswordFieldAuth.getPassword());

        boolean userExists = DatabaseManager.checkUserExists(username);

        if (userExists) {
            boolean passwordCorrect = DatabaseManager.checkPassword(username, password);

            if (passwordCorrect) {
                dispose();
                HomePage homepage = new HomePage();
                homepage.setVisible(true);
                
                //MainJFrame mainFrame = new MainJFrame();
                //mainFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "User does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_SignInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AuthenticationGrid;
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldAuth;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderUsername;
    // End of variables declaration//GEN-END:variables
}

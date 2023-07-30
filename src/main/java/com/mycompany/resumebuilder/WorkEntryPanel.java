/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.resumebuilder;

import java.awt.Container;
import javax.swing.JOptionPane;

/**
 *
 * @author EdenChung
 */
public class WorkEntryPanel extends javax.swing.JPanel {

    /**
     * Creates new form AchievementEntryPanel
     */
    public WorkEntryPanel() {
        numAchievements++;
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPlaceHolderEmployer = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPlaceHolderAffiliation = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPlaceHolderDate = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        emptyPlaceholder1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPlaceHolderDescription = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        emptyPlaceholder = new javax.swing.JLabel();
        deleteAchievement = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setMinimumSize(new java.awt.Dimension(400, 143));
        setLayout(new java.awt.GridLayout(6, 2, 0, 10));

        jLabel1.setText("Name of employer*");
        add(jLabel1);

        jTextFieldPlaceHolderEmployer.setPlaceHolder("Employer");
        jTextFieldPlaceHolderEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderEmployerActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderEmployer);

        jLabel2.setText("Role");
        add(jLabel2);

        jTextFieldPlaceHolderAffiliation.setPlaceHolder("Role");
        jTextFieldPlaceHolderAffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderAffiliationActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderAffiliation);

        jLabel3.setText("Start date");
        add(jLabel3);

        jTextFieldPlaceHolderDate.setPlaceHolder("Start date");
        jTextFieldPlaceHolderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderDateActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderDate);
        add(emptyPlaceholder1);

        jCheckBox1.setText("Current job");
        add(jCheckBox1);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel4.setText("Description (leave an empty line in between each bullet point)");
        add(jLabel4);

        jTextFieldPlaceHolderDescription.setPlaceHolder("Description");
        jTextFieldPlaceHolderDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderDescriptionActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderDescription);
        add(emptyPlaceholder);

        deleteAchievement.setText("Delete experience");
        deleteAchievement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAchievementActionPerformed(evt);
            }
        });
        add(deleteAchievement);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPlaceHolderEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderEmployerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderEmployerActionPerformed

    private void jTextFieldPlaceHolderAffiliationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderAffiliationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderAffiliationActionPerformed

    private void jTextFieldPlaceHolderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderDateActionPerformed

    private void deleteAchievementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAchievementActionPerformed

        if (numAchievements > 1) {
            // Decrement the number of achievements when a panel is deleted
            numAchievements--;

            // Code to perform when the "Delete" button is clicked
            Container parent = getParent();
            parent.remove(this);
            parent.revalidate();
            parent.repaint();
        } else {
            // Show a message that deletion is not allowed if there is only one achievement
            JOptionPane.showMessageDialog(this, "You cannot delete the last achievement.");
        }
    }//GEN-LAST:event_deleteAchievementActionPerformed

    private void jTextFieldPlaceHolderDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderDescriptionActionPerformed

    public String getAchievement() {
        return jTextFieldPlaceHolderEmployer.getText();
    }
    
    public String getAffiliation() {
        return jTextFieldPlaceHolderAffiliation.getText();
    }
    
    public String getDate() {
        return jTextFieldPlaceHolderDate.getText();
    }
    
    public int getNumAchievements() {
        return numAchievements;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteAchievement;
    private javax.swing.JLabel emptyPlaceholder;
    private javax.swing.JLabel emptyPlaceholder1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderAffiliation;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderDate;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderDescription;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderEmployer;
    // End of variables declaration//GEN-END:variables

    private static int numAchievements = 0;
}

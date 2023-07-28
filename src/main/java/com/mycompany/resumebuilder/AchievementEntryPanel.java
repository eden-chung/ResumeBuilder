/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.resumebuilder;

/**
 *
 * @author EdenChung
 */
public class AchievementEntryPanel extends javax.swing.JPanel {

    /**
     * Creates new form AchievementEntryPanel
     */
    public AchievementEntryPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldPlaceHolderAchievement = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPlaceHolderAffiliation = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPlaceHolderDate = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();

        setMinimumSize(new java.awt.Dimension(400, 143));
        setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("Name of achievement");
        add(jLabel1);

        jTextFieldPlaceHolderAchievement.setPlaceHolder("Achievement");
        jTextFieldPlaceHolderAchievement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderAchievementActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderAchievement);

        jLabel2.setText("Affiliation");
        add(jLabel2);

        jTextFieldPlaceHolderAffiliation.setPlaceHolder("Affiliation");
        jTextFieldPlaceHolderAffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderAffiliationActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderAffiliation);

        jLabel3.setText("Date");
        add(jLabel3);

        jTextFieldPlaceHolderDate.setPlaceHolder("Date");
        jTextFieldPlaceHolderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderDateActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderDate);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPlaceHolderAchievementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderAchievementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderAchievementActionPerformed

    private void jTextFieldPlaceHolderAffiliationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderAffiliationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderAffiliationActionPerformed

    private void jTextFieldPlaceHolderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderAchievement;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderAffiliation;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderDate;
    // End of variables declaration//GEN-END:variables
}

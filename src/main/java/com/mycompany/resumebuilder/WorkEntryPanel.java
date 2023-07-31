/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.resumebuilder;

import java.awt.Color;
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
        numExperiences++;
        initComponents();
        isEnabled = true;
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
        jTextFieldPlaceHolderRole = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPlaceHolderStartDate = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPlaceHolderEndDate = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        emptyPlaceholder1 = new javax.swing.JLabel();
        jobCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER, javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jTextFieldPlaceHolderDescription = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        emptyPlaceholder = new javax.swing.JLabel();
        deleteWork = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setMinimumSize(new java.awt.Dimension(400, 143));
        setLayout(new java.awt.GridLayout(8, 2, 0, 10));

        jLabel1.setText("Name of employer*");
        add(jLabel1);

        jTextFieldPlaceHolderEmployer.setPlaceHolder("Employer");
        jTextFieldPlaceHolderEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderEmployerActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderEmployer);

        jLabel2.setText("Role*");
        add(jLabel2);

        jTextFieldPlaceHolderRole.setPlaceHolder("Role");
        jTextFieldPlaceHolderRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderRoleActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderRole);

        jLabel3.setText("Start date*");
        add(jLabel3);

        jTextFieldPlaceHolderStartDate.setPlaceHolder("Start date");
        jTextFieldPlaceHolderStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderStartDateActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderStartDate);

        jLabel5.setText("End date");
        add(jLabel5);

        jTextFieldPlaceHolderEndDate.setPlaceHolder("End date");
        jTextFieldPlaceHolderEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderEndDateActionPerformed(evt);
            }
        });
        add(jTextFieldPlaceHolderEndDate);
        add(emptyPlaceholder1);

        jobCheckBox.setText("Current job");
        jobCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobCheckBoxActionPerformed(evt);
            }
        });
        add(jobCheckBox);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel4.setText("Description (write ** between each bullet point)");
        add(jLabel4);

        jScrollPaneDescription.setMaximumSize(new java.awt.Dimension(400, 200));
        jScrollPaneDescription.setPreferredSize(new java.awt.Dimension(100, 50));

        jTextFieldPlaceHolderDescription.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldPlaceHolderDescription.setPlaceHolder("Description");
        jTextFieldPlaceHolderDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderDescriptionActionPerformed(evt);
            }
        });
        jScrollPaneDescription.setViewportView(jTextFieldPlaceHolderDescription);

        add(jScrollPaneDescription);
        add(emptyPlaceholder);

        deleteWork.setText("Delete experience");
        deleteWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWorkActionPerformed(evt);
            }
        });
        add(deleteWork);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPlaceHolderEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderEmployerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderEmployerActionPerformed

    private void jTextFieldPlaceHolderRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderRoleActionPerformed

    private void jTextFieldPlaceHolderStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderStartDateActionPerformed

    private void deleteWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWorkActionPerformed
        numExperiences--;

        Container parent = getParent();
        parent.remove(this);
        parent.revalidate();
        parent.repaint();
            
        isEnabled = false;
    }//GEN-LAST:event_deleteWorkActionPerformed

    private void jTextFieldPlaceHolderDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderDescriptionActionPerformed

    private void jTextFieldPlaceHolderEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderEndDateActionPerformed

    private void jobCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobCheckBoxActionPerformed
        boolean isCurrentJob = jobCheckBox.isSelected();
        
        if (isCurrentJob) {
            jTextFieldPlaceHolderEndDate.setBackground(new Color(240, 240, 240)); // Set a grayed-out color
        } else {
            jTextFieldPlaceHolderEndDate.setBackground(Color.WHITE); // Set the original color
        }
        jTextFieldPlaceHolderEndDate.setEnabled(!isCurrentJob);
    }//GEN-LAST:event_jobCheckBoxActionPerformed
    public String getEmployer() {
        return jTextFieldPlaceHolderEmployer.getText();
    }
    
    public String getRole() {
        return jTextFieldPlaceHolderRole.getText();
    }
    
    public String getStartDate() {
        return jTextFieldPlaceHolderStartDate.getText();
    }
    
    public String getEndDate() {
        return jTextFieldPlaceHolderEndDate.getText();
    }
    
    public boolean isCurrentJob() {
        return jobCheckBox.isSelected();
    }
    
    public String getDescription() {
        return jTextFieldPlaceHolderDescription.getText();
    }
    
    public int getNumExperiences() {
        return numExperiences;
    }
    
    public boolean getIsEnabled() {
        return isEnabled;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteWork;
    private javax.swing.JLabel emptyPlaceholder;
    private javax.swing.JLabel emptyPlaceholder1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderDescription;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderEmployer;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderEndDate;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderRole;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderStartDate;
    private javax.swing.JCheckBox jobCheckBox;
    // End of variables declaration//GEN-END:variables

    private static int numExperiences = 0;
    boolean isEnabled;
}

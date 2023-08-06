/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resumebuilder;

import com.mycompany.resumebuilder.Backend.DatabaseManager;
import com.mycompany.resumebuilder.Backend.UserInputs.PersonData;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author EdenChung
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addNewResume = new javax.swing.JButton();
        ViewCurrentResumes = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        SavedResumes = new javax.swing.JPanel();
        resumesScrollPane = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32767, 400));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(156, 200));

        Home.setLayout(new java.awt.GridLayout(4, 0, 0, 20));

        jLabel1.setText("Welcome!");
        Home.add(jLabel1);

        addNewResume.setText("Add new resume");
        addNewResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewResumeActionPerformed(evt);
            }
        });
        Home.add(addNewResume);

        ViewCurrentResumes.setText("View current resumes");
        ViewCurrentResumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCurrentResumesActionPerformed(evt);
            }
        });
        Home.add(ViewCurrentResumes);

        SignOut.setText("Sign out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        Home.add(SignOut);

        jTabbedPane1.addTab("Home", Home);

        SavedResumes.setLayout(new java.awt.GridLayout());

        resumesScrollPane.setMinimumSize(new java.awt.Dimension(16, 200));
        SavedResumes.add(resumesScrollPane);

        jTabbedPane1.addTab("Saved resumes", SavedResumes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewResumeActionPerformed
        MainJFrame mainFrame = new MainJFrame();
        mainFrame.setInputListener(new ResumeBuilder());
        mainFrame.setVisible(true);
    }//GEN-LAST:event_addNewResumeActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        dispose();
        Authentication authPage = new Authentication();
        authPage.setVisible(true);
    }//GEN-LAST:event_SignOutActionPerformed

    private void ViewCurrentResumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCurrentResumesActionPerformed
        ViewCurrentResumesActionPerformed();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ViewCurrentResumesActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    
    
    private void ViewCurrentResumesActionPerformed() {
        Authentication authentication = new Authentication();
        int userId = authentication.userId;

        ArrayList<Object[]> versions = DatabaseManager.retrievePreviousVersions(userId);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(versions.size() + 1, 3, 10, 10));

        JLabel timestampLabel = new JLabel("Timestamp");
        JLabel resumeNameLabel = new JLabel("Resume Name");
        JLabel actionLabel = new JLabel("Actions");
        panel.add(timestampLabel);
        panel.add(resumeNameLabel);
        panel.add(actionLabel);

        for (int i = versions.size() - 1; i >= 0; i--) {
            Object[] version = versions.get(i);
            String dateString = (String) version[0];
            String resumeName = (String) version[1];
            JButton openResumeButton = new JButton("Open Resume");
            JButton editButton = new JButton("Edit");
            JButton changeNameButton = new JButton("Change Name");

            JLabel dateLabel = new JLabel(dateString);
            JLabel resumeNameTextLabel = new JLabel(resumeName);

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(changeNameButton);
            buttonPanel.add(editButton);
            buttonPanel.add(openResumeButton);

            panel.add(dateLabel);
            panel.add(resumeNameTextLabel);
            panel.add(buttonPanel);

            LocalDateTime dateTime = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS"));

            changeNameButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String newResumeName = JOptionPane.showInputDialog("Enter new resume name:");
                    if (newResumeName != null && !newResumeName.isEmpty()) {
                        DatabaseManager.changeResumeName(newResumeName, userId, dateTime);
                        ViewCurrentResumesActionPerformed();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid resume name");
                    }
                }
            });

            openResumeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    PersonData info = new PersonData();
                    info = DatabaseManager.getPersonalInfo(info, userId, dateTime);
                    info = DatabaseManager.getEducationInfo(info, userId, dateTime);
                    info = DatabaseManager.getSkillsInfo(info, userId, dateTime);
                    info = DatabaseManager.getJsonInfo(info, userId, dateTime);

                    CompileLatex.compileAll(info);
                }
            });
            
            editButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // todo open mainjframe
                }
});
        }

        resumesScrollPane.setViewportView(panel);
    }







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JPanel SavedResumes;
    private javax.swing.JButton SignOut;
    private javax.swing.JButton ViewCurrentResumes;
    private javax.swing.JButton addNewResume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane resumesScrollPane;
    // End of variables declaration//GEN-END:variables
}

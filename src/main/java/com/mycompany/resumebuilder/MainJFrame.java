/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resumebuilder;

import java.util.ArrayList;
import java.util.EventListener;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author EdenChung
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainJFrame() {
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

        jTabbedPane = new javax.swing.JTabbedPane();
        PersonalInformationPanel = new javax.swing.JPanel();
        TitleContainerPersonal = new javax.swing.JPanel();
        personalInfoLabel = new javax.swing.JLabel();
        GridContainerPersonal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPlaceHolderName = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPlaceHolderLocation = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPlaceHolderPhone = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPlaceHolderEmail = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPlaceHolderLinkedin = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPlaceHolderGithub = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        ButtonContainerPersonal = new javax.swing.JPanel();
        nextButtonPersonal = new javax.swing.JButton();
        EducationPanel = new javax.swing.JPanel();
        TitleContainerEducation = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        GridContainerEducation = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldPlaceHolderUniversity = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldPlaceHolderUnidate = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldPlaceHolderDegree = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldPlaceHolderFieldStudy = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldPlaceHolderFieldStudy2 = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldPlaceHolderMinor = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldPlaceHolderGPA = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldPlaceHolderCoursework = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        ButtonContainerEducation = new javax.swing.JPanel();
        nextButtonEducation = new javax.swing.JButton();
        SkillsPanel = new javax.swing.JPanel();
        TitleContainerSkills = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        GridContainerSkills = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldPlaceHolderLanguages = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldPlaceHolderProgramming = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldPlaceHolderSoftwares = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldPlaceHolderCertifications = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        ButtonContainerSkills = new javax.swing.JPanel();
        nextButtonSkills = new javax.swing.JButton();
        WorkScrollPane = new javax.swing.JScrollPane();
        WorkPanel = new javax.swing.JPanel();
        addWorkButton = new javax.swing.JButton();
        nextButtonWork = new javax.swing.JButton();
        AchievementsScrollPane = new javax.swing.JScrollPane();
        AchievementsPanel = new javax.swing.JPanel();
        addAchievementButton = new javax.swing.JButton();
        submitButtonAchievements = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PersonalInformationPanel.setMaximumSize(new java.awt.Dimension(563, 32767));
        PersonalInformationPanel.setLayout(new javax.swing.BoxLayout(PersonalInformationPanel, javax.swing.BoxLayout.Y_AXIS));

        personalInfoLabel.setText("Personal Information Section");

        javax.swing.GroupLayout TitleContainerPersonalLayout = new javax.swing.GroupLayout(TitleContainerPersonal);
        TitleContainerPersonal.setLayout(TitleContainerPersonalLayout);
        TitleContainerPersonalLayout.setHorizontalGroup(
            TitleContainerPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleContainerPersonalLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(personalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        TitleContainerPersonalLayout.setVerticalGroup(
            TitleContainerPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleContainerPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PersonalInformationPanel.add(TitleContainerPersonal);

        GridContainerPersonal.setLayout(new java.awt.GridLayout(7, 2, 10, 15));

        jLabel1.setText("Enter your name*");
        GridContainerPersonal.add(jLabel1);

        jTextFieldPlaceHolderName.setPlaceHolder("Name");
        GridContainerPersonal.add(jTextFieldPlaceHolderName);

        jLabel4.setText("Enter your location*");
        GridContainerPersonal.add(jLabel4);

        jTextFieldPlaceHolderLocation.setPlaceHolder("Location");
        GridContainerPersonal.add(jTextFieldPlaceHolderLocation);

        jLabel5.setText("Enter your phone number*");
        GridContainerPersonal.add(jLabel5);

        jTextFieldPlaceHolderPhone.setPlaceHolder("Phone number");
        GridContainerPersonal.add(jTextFieldPlaceHolderPhone);

        jLabel6.setText("Enter your email*");
        GridContainerPersonal.add(jLabel6);

        jTextFieldPlaceHolderEmail.setPlaceHolder("Email");
        GridContainerPersonal.add(jTextFieldPlaceHolderEmail);

        jLabel7.setText("Enter your LinkedIn*");
        GridContainerPersonal.add(jLabel7);

        jTextFieldPlaceHolderLinkedin.setPlaceHolder("LinkedIn");
        GridContainerPersonal.add(jTextFieldPlaceHolderLinkedin);

        jLabel8.setText("Enter your GitHub");
        GridContainerPersonal.add(jLabel8);

        jTextFieldPlaceHolderGithub.setPlaceHolder("GitHub");
        GridContainerPersonal.add(jTextFieldPlaceHolderGithub);

        PersonalInformationPanel.add(GridContainerPersonal);

        nextButtonPersonal.setText("Next");
        nextButtonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonContainerPersonalLayout = new javax.swing.GroupLayout(ButtonContainerPersonal);
        ButtonContainerPersonal.setLayout(ButtonContainerPersonalLayout);
        ButtonContainerPersonalLayout.setHorizontalGroup(
            ButtonContainerPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonContainerPersonalLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(nextButtonPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        ButtonContainerPersonalLayout.setVerticalGroup(
            ButtonContainerPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainerPersonalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nextButtonPersonal)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        PersonalInformationPanel.add(ButtonContainerPersonal);

        jTabbedPane.addTab("Personal Information", PersonalInformationPanel);

        EducationPanel.setLayout(new javax.swing.BoxLayout(EducationPanel, javax.swing.BoxLayout.Y_AXIS));

        jLabel24.setText("Education Section");

        javax.swing.GroupLayout TitleContainerEducationLayout = new javax.swing.GroupLayout(TitleContainerEducation);
        TitleContainerEducation.setLayout(TitleContainerEducationLayout);
        TitleContainerEducationLayout.setHorizontalGroup(
            TitleContainerEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleContainerEducationLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel24)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        TitleContainerEducationLayout.setVerticalGroup(
            TitleContainerEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleContainerEducationLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel24)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        EducationPanel.add(TitleContainerEducation);

        GridContainerEducation.setLayout(new java.awt.GridLayout(8, 2, 10, 15));

        jLabel17.setText("University name*");
        GridContainerEducation.add(jLabel17);

        jTextFieldPlaceHolderUniversity.setPlaceHolder("University");
        GridContainerEducation.add(jTextFieldPlaceHolderUniversity);

        jLabel19.setText("Date of graduation*");
        GridContainerEducation.add(jLabel19);

        jTextFieldPlaceHolderUnidate.setPlaceHolder("Date");
        GridContainerEducation.add(jTextFieldPlaceHolderUnidate);

        jLabel20.setText("Type of degree*");
        GridContainerEducation.add(jLabel20);

        jTextFieldPlaceHolderDegree.setPlaceHolder("Degree");
        GridContainerEducation.add(jTextFieldPlaceHolderDegree);

        jLabel21.setText("Field of study*");
        GridContainerEducation.add(jLabel21);

        jTextFieldPlaceHolderFieldStudy.setPlaceHolder("Field of study");
        GridContainerEducation.add(jTextFieldPlaceHolderFieldStudy);

        jLabel25.setText("Secondary field of study");
        GridContainerEducation.add(jLabel25);

        jTextFieldPlaceHolderFieldStudy2.setPlaceHolder("Secondary field of study");
        GridContainerEducation.add(jTextFieldPlaceHolderFieldStudy2);

        jLabel26.setText("Minor");
        GridContainerEducation.add(jLabel26);

        jTextFieldPlaceHolderMinor.setPlaceHolder("Minor");
        GridContainerEducation.add(jTextFieldPlaceHolderMinor);

        jLabel22.setText("GPA*");
        GridContainerEducation.add(jLabel22);

        jTextFieldPlaceHolderGPA.setPlaceHolder("GPA");
        GridContainerEducation.add(jTextFieldPlaceHolderGPA);

        jLabel23.setText("Relevant coursework");
        GridContainerEducation.add(jLabel23);

        jTextFieldPlaceHolderCoursework.setPlaceHolder("Relevant coursework");
        GridContainerEducation.add(jTextFieldPlaceHolderCoursework);

        EducationPanel.add(GridContainerEducation);

        nextButtonEducation.setText("Next");
        nextButtonEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonEducationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonContainerEducationLayout = new javax.swing.GroupLayout(ButtonContainerEducation);
        ButtonContainerEducation.setLayout(ButtonContainerEducationLayout);
        ButtonContainerEducationLayout.setHorizontalGroup(
            ButtonContainerEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainerEducationLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(nextButtonEducation)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        ButtonContainerEducationLayout.setVerticalGroup(
            ButtonContainerEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonContainerEducationLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(nextButtonEducation)
                .addContainerGap())
        );

        EducationPanel.add(ButtonContainerEducation);

        jTabbedPane.addTab("Education", EducationPanel);

        SkillsPanel.setLayout(new javax.swing.BoxLayout(SkillsPanel, javax.swing.BoxLayout.Y_AXIS));

        jLabel32.setText("Skills Section");

        javax.swing.GroupLayout TitleContainerSkillsLayout = new javax.swing.GroupLayout(TitleContainerSkills);
        TitleContainerSkills.setLayout(TitleContainerSkillsLayout);
        TitleContainerSkillsLayout.setHorizontalGroup(
            TitleContainerSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleContainerSkillsLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleContainerSkillsLayout.setVerticalGroup(
            TitleContainerSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleContainerSkillsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel32)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        SkillsPanel.add(TitleContainerSkills);

        GridContainerSkills.setLayout(new java.awt.GridLayout(4, 2, 10, 15));

        jLabel18.setText("Languages*");
        GridContainerSkills.add(jLabel18);

        jTextFieldPlaceHolderLanguages.setPlaceHolder("Languages");
        jTextFieldPlaceHolderLanguages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderLanguagesActionPerformed(evt);
            }
        });
        GridContainerSkills.add(jTextFieldPlaceHolderLanguages);

        jLabel27.setText("Programming languages");
        GridContainerSkills.add(jLabel27);

        jTextFieldPlaceHolderProgramming.setPlaceHolder("Programming languages");
        GridContainerSkills.add(jTextFieldPlaceHolderProgramming);

        jLabel28.setText("Softwares");
        GridContainerSkills.add(jLabel28);

        jTextFieldPlaceHolderSoftwares.setPlaceHolder("Softwares");
        GridContainerSkills.add(jTextFieldPlaceHolderSoftwares);

        jLabel29.setText("Certifications");
        GridContainerSkills.add(jLabel29);

        jTextFieldPlaceHolderCertifications.setPlaceHolder("Certifications");
        jTextFieldPlaceHolderCertifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderCertificationsActionPerformed(evt);
            }
        });
        GridContainerSkills.add(jTextFieldPlaceHolderCertifications);

        SkillsPanel.add(GridContainerSkills);

        nextButtonSkills.setText("Next");
        nextButtonSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonSkillsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonContainerSkillsLayout = new javax.swing.GroupLayout(ButtonContainerSkills);
        ButtonContainerSkills.setLayout(ButtonContainerSkillsLayout);
        ButtonContainerSkillsLayout.setHorizontalGroup(
            ButtonContainerSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainerSkillsLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(nextButtonSkills)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonContainerSkillsLayout.setVerticalGroup(
            ButtonContainerSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainerSkillsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(nextButtonSkills)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        SkillsPanel.add(ButtonContainerSkills);

        jTabbedPane.addTab("Skills", SkillsPanel);

        WorkPanel.setLayout(new javax.swing.BoxLayout(WorkPanel, javax.swing.BoxLayout.Y_AXIS));

        addWorkButton.setText("Add new work experience");
        addWorkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWorkButtonActionPerformed(evt);
            }
        });
        WorkPanel.add(addWorkButton);

        nextButtonWork.setText("Next");
        nextButtonWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonWorkActionPerformed(evt);
            }
        });
        WorkPanel.add(nextButtonWork);

        WorkScrollPane.setViewportView(WorkPanel);

        jTabbedPane.addTab("Work Experience", WorkScrollPane);

        AchievementsPanel.setLayout(new javax.swing.BoxLayout(AchievementsPanel, javax.swing.BoxLayout.Y_AXIS));

        addAchievementButton.setText("Add new achievement");
        addAchievementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAchievementButtonActionPerformed(evt);
            }
        });
        AchievementsPanel.add(addAchievementButton);

        submitButtonAchievements.setText("Submit");
        submitButtonAchievements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonAchievementsActionPerformed(evt);
            }
        });
        AchievementsPanel.add(submitButtonAchievements);

        AchievementsScrollPane.setViewportView(AchievementsPanel);

        jTabbedPane.addTab("Achievements", AchievementsScrollPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonPersonalActionPerformed
        boolean validInput = submitInputPersonalInfo();
        
        if (validInput) {
            jTabbedPane.setSelectedIndex(1);
        } 
        
    }//GEN-LAST:event_nextButtonPersonalActionPerformed

    private void nextButtonEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonEducationActionPerformed
        boolean validInput = submitInputEducation();
        
        if (validInput) {
            jTabbedPane.setSelectedIndex(2);
        }
        
    }//GEN-LAST:event_nextButtonEducationActionPerformed

    private void jTextFieldPlaceHolderLanguagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderLanguagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderLanguagesActionPerformed

    private void nextButtonSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonSkillsActionPerformed
        boolean validInput = submitInputSkills();
        
        if (validInput) {
           jTabbedPane.setSelectedIndex(3); 
        }
        
    }//GEN-LAST:event_nextButtonSkillsActionPerformed

    private void jTextFieldPlaceHolderCertificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderCertificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderCertificationsActionPerformed

    private void addAchievementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAchievementButtonActionPerformed
        
        AchievementEntryPanel indivAchievementPanel = new AchievementEntryPanel();
        achievementPanelsList.add(indivAchievementPanel);

        AchievementsPanel.add(indivAchievementPanel);
        AchievementsPanel.revalidate();
        AchievementsPanel.repaint();
        this.revalidate();
        this.repaint();
        
        
    }//GEN-LAST:event_addAchievementButtonActionPerformed

    private void submitButtonAchievementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonAchievementsActionPerformed
         submitAchievements();
    }//GEN-LAST:event_submitButtonAchievementsActionPerformed

    private void addWorkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWorkButtonActionPerformed
        WorkEntryPanel indivWorkPanel = new WorkEntryPanel();
        workPanelsList.add(indivWorkPanel);

        WorkPanel.add(indivWorkPanel);
        WorkPanel.revalidate();
        WorkPanel.repaint();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_addWorkButtonActionPerformed

    private void nextButtonWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonWorkActionPerformed
        boolean validInput = submitWorkExperiences();
        
        if (validInput) {
           jTabbedPane.setSelectedIndex(4); 
        }

    }//GEN-LAST:event_nextButtonWorkActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    public interface InputListener extends EventListener {
        void onInputSubmittedPersonal(String name, String location, String phone, String email, String linkedin, String github);
        void onInputSubmittedEducation(String university, String unidate, String degree, String fieldStudy, String fieldStudy2, String minor, String gpa, String coursework);
        void onInputSubmittedSkills(String languages, String programming, String softwares, String certifications);
        void onInputSubmittedAchievements(String[][] achievementInfoArray);
        void onInputSubmittedWork(String[][] workArray);
    }
    
    public void setInputListener(InputListener listener) {
        this.inputListener = listener;
    }
    

    private boolean submitInputPersonalInfo() {
        String github = jTextFieldPlaceHolderGithub.getText();
            
        boolean allValidInput = jTextFieldPlaceHolderName.hasValidInput() && jTextFieldPlaceHolderLocation.hasValidInput() && jTextFieldPlaceHolderPhone.hasValidInput() && jTextFieldPlaceHolderEmail.hasValidInput() && jTextFieldPlaceHolderLinkedin.hasValidInput();
        if (allValidInput) {
            String name = jTextFieldPlaceHolderName.getText();
            String location = jTextFieldPlaceHolderLocation.getText();
            String phone = jTextFieldPlaceHolderPhone.getText();
            String email = jTextFieldPlaceHolderEmail.getText();
            String linkedin = jTextFieldPlaceHolderLinkedin.getText();
            
            // Notify the listener with the input data
            if (inputListener != null) {
                inputListener.onInputSubmittedPersonal(name, location, phone, email, linkedin, github);
            }
            return true;
        } else {
        // Show an error message or handle the case where some fields are empty
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;              
    }
    
    private boolean submitInputEducation() {
        String fieldStudy2 = jTextFieldPlaceHolderFieldStudy2.getText();
        String minor = jTextFieldPlaceHolderMinor.getText();
        String coursework = jTextFieldPlaceHolderCoursework.getText();
            
        boolean allValidInput = jTextFieldPlaceHolderUniversity.hasValidInput() && jTextFieldPlaceHolderUnidate.hasValidInput() && jTextFieldPlaceHolderDegree.hasValidInput() && jTextFieldPlaceHolderFieldStudy.hasValidInput() && jTextFieldPlaceHolderGPA.hasValidInput();
        if (allValidInput) {
            String university = jTextFieldPlaceHolderUniversity.getText();
            String unidate = jTextFieldPlaceHolderUnidate.getText();
            String degree = jTextFieldPlaceHolderDegree.getText();
            String fieldStudy = jTextFieldPlaceHolderFieldStudy.getText();
            String gpa = jTextFieldPlaceHolderGPA.getText();
            
            // Notify the listener with the input data
            if (inputListener != null) {
                inputListener.onInputSubmittedEducation(university, unidate, degree, fieldStudy, fieldStudy2, minor, gpa, coursework);
            }
            return true;
        } else {
        // Show an error message or handle the case where some fields are empty
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
                        
    }
    
    private boolean submitInputSkills() {
        String programming = jTextFieldPlaceHolderProgramming.getText();
        String softwares = jTextFieldPlaceHolderSoftwares.getText();
        String certifications = jTextFieldPlaceHolderCertifications.getText();

            
        boolean allValidInput = jTextFieldPlaceHolderLanguages.hasValidInput();
        
        if (allValidInput) {
            String languages = jTextFieldPlaceHolderLanguages.getText();

            // Notify the listener with the input data
            if (inputListener != null) {
                inputListener.onInputSubmittedSkills(languages, programming, softwares, certifications);
            }
            return true;
        } else {
        // Show an error message or handle the case where some fields are empty
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
                       
    }
    
    private boolean submitAchievements() {
        String[][] achievementInfoArray = new String[achievementPanelsList.size()][3];
                
        for (int i = 0; i < achievementPanelsList.size(); i++) {
            AchievementEntryPanel panel = achievementPanelsList.get(i);
            
            String achievement = panel.getAchievement();
            String affiliation = panel.getAffiliation();
            String date = panel.getDate();
            
            if (achievement.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            achievementInfoArray[i][0] = achievement;
            achievementInfoArray[i][1] = affiliation;
            achievementInfoArray[i][2] = date;
            
            
            if (inputListener != null) {
                inputListener.onInputSubmittedAchievements(achievementInfoArray);
            }
            
        }
        return true;
    }
    
    private boolean submitWorkExperiences() {
        String[][] workArray = new String[workPanelsList.size()][5];
                
        for (int i = 0; i < workPanelsList.size(); i++) {
            WorkEntryPanel panel = workPanelsList.get(i);
            
            String employer = panel.getEmployer();
            String role = panel.getRole();
            String startDate = panel.getStartDate();
            String description = panel.getDescription();
            String endDate;
            
            if (panel.isCurrentJob()) {
                endDate = "Present";
            } else {
                endDate = panel.getEndDate();
            }
            
            if (employer.isEmpty() || role.isEmpty() || startDate.isEmpty()) {
                System.out.println("test");
                JOptionPane.showMessageDialog(this, "Please fill in all required fields", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            workArray[i][0] = employer;
            workArray[i][1] = role;
            workArray[i][2] = startDate;
            workArray[i][3] = endDate;
            workArray[i][4] = description;

            
            if (inputListener != null) {
                inputListener.onInputSubmittedWork(workArray);
            }
        }
        return true;
    }
    
    
    public javax.swing.JPanel getAchievementsPanel() {
        return AchievementsPanel;
    }
    
    public javax.swing.JPanel getWorkPanel() {
        return WorkPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AchievementsPanel;
    private javax.swing.JScrollPane AchievementsScrollPane;
    private javax.swing.JPanel ButtonContainerEducation;
    private javax.swing.JPanel ButtonContainerPersonal;
    private javax.swing.JPanel ButtonContainerSkills;
    private javax.swing.JPanel EducationPanel;
    private javax.swing.JPanel GridContainerEducation;
    private javax.swing.JPanel GridContainerPersonal;
    private javax.swing.JPanel GridContainerSkills;
    private javax.swing.JPanel PersonalInformationPanel;
    private javax.swing.JPanel SkillsPanel;
    private javax.swing.JPanel TitleContainerEducation;
    private javax.swing.JPanel TitleContainerPersonal;
    private javax.swing.JPanel TitleContainerSkills;
    private javax.swing.JPanel WorkPanel;
    private javax.swing.JScrollPane WorkScrollPane;
    private javax.swing.JButton addAchievementButton;
    private javax.swing.JButton addWorkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderCertifications;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderCoursework;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderDegree;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderEmail;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderFieldStudy;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderFieldStudy2;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderGPA;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderGithub;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderLanguages;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderLinkedin;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderLocation;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderMinor;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderName;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderPhone;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderProgramming;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderSoftwares;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderUnidate;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderUniversity;
    private javax.swing.JButton nextButtonEducation;
    private javax.swing.JButton nextButtonPersonal;
    private javax.swing.JButton nextButtonSkills;
    private javax.swing.JButton nextButtonWork;
    private javax.swing.JLabel personalInfoLabel;
    private javax.swing.JButton submitButtonAchievements;
    // End of variables declaration//GEN-END:variables
    
    private InputListener inputListener;
    private ArrayList<AchievementEntryPanel> achievementPanelsList = new ArrayList<>();
    private ArrayList<WorkEntryPanel> workPanelsList = new ArrayList<>();

    
}

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
        TitleContainer = new javax.swing.JPanel();
        personalInfoLabel = new javax.swing.JLabel();
        GridContainer = new javax.swing.JPanel();
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
        ButtonContainer = new javax.swing.JPanel();
        nextButtonPersonal = new javax.swing.JButton();
        EducationPanel = new javax.swing.JPanel();
        nextButtonEducation = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldPlaceHolderUniversity = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderUnidate = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderGPA = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderFieldStudy = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderDegree = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderCoursework = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderFieldStudy2 = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderMinor = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        SkillsPanel = new javax.swing.JPanel();
        nextButtonSkills = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldPlaceHolderLanguages = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderProgramming = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderCertifications = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderSoftwares = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        WorkPanel = new javax.swing.JPanel();
        AchievementsPanel = new javax.swing.JPanel();
        addAchievementButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PersonalInformationPanel.setMaximumSize(new java.awt.Dimension(563, 32767));
        PersonalInformationPanel.setLayout(new javax.swing.BoxLayout(PersonalInformationPanel, javax.swing.BoxLayout.Y_AXIS));

        personalInfoLabel.setText("Personal Information Section");

        javax.swing.GroupLayout TitleContainerLayout = new javax.swing.GroupLayout(TitleContainer);
        TitleContainer.setLayout(TitleContainerLayout);
        TitleContainerLayout.setHorizontalGroup(
            TitleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleContainerLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(personalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        TitleContainerLayout.setVerticalGroup(
            TitleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleContainerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(personalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        PersonalInformationPanel.add(TitleContainer);

        GridContainer.setLayout(new java.awt.GridLayout(7, 2, 10, 15));

        jLabel1.setText("Enter your name*");
        GridContainer.add(jLabel1);

        jTextFieldPlaceHolderName.setPlaceHolder("Name");
        GridContainer.add(jTextFieldPlaceHolderName);

        jLabel4.setText("Enter your location*");
        GridContainer.add(jLabel4);

        jTextFieldPlaceHolderLocation.setPlaceHolder("Location");
        GridContainer.add(jTextFieldPlaceHolderLocation);

        jLabel5.setText("Enter your phone number*");
        GridContainer.add(jLabel5);

        jTextFieldPlaceHolderPhone.setPlaceHolder("Phone number");
        GridContainer.add(jTextFieldPlaceHolderPhone);

        jLabel6.setText("Enter your email*");
        GridContainer.add(jLabel6);

        jTextFieldPlaceHolderEmail.setPlaceHolder("Email");
        GridContainer.add(jTextFieldPlaceHolderEmail);

        jLabel7.setText("Enter your LinkedIn*");
        GridContainer.add(jLabel7);

        jTextFieldPlaceHolderLinkedin.setPlaceHolder("LinkedIn");
        GridContainer.add(jTextFieldPlaceHolderLinkedin);

        jLabel8.setText("Enter your GitHub");
        GridContainer.add(jLabel8);

        jTextFieldPlaceHolderGithub.setPlaceHolder("GitHub");
        GridContainer.add(jTextFieldPlaceHolderGithub);

        PersonalInformationPanel.add(GridContainer);

        nextButtonPersonal.setText("Next");
        nextButtonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonContainerLayout = new javax.swing.GroupLayout(ButtonContainer);
        ButtonContainer.setLayout(ButtonContainerLayout);
        ButtonContainerLayout.setHorizontalGroup(
            ButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainerLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(nextButtonPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        ButtonContainerLayout.setVerticalGroup(
            ButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextButtonPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PersonalInformationPanel.add(ButtonContainer);

        jTabbedPane.addTab("Personal Information", PersonalInformationPanel);

        nextButtonEducation.setText("Next");
        nextButtonEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonEducationActionPerformed(evt);
            }
        });

        jLabel17.setText("University name*");

        jLabel19.setText("Date of graduation*");

        jLabel20.setText("Type of degree*");

        jLabel21.setText("Field of study*");

        jLabel22.setText("GPA*");

        jLabel23.setText("Relevant coursework");

        jLabel24.setText("Education Section");

        jLabel25.setText("Secondary field of study");

        jLabel26.setText("Minor");

        jTextFieldPlaceHolderUniversity.setPlaceHolder("University");

        jTextFieldPlaceHolderUnidate.setPlaceHolder("Date");

        jTextFieldPlaceHolderGPA.setPlaceHolder("GPA");

        jTextFieldPlaceHolderFieldStudy.setPlaceHolder("Field of study");

        jTextFieldPlaceHolderDegree.setPlaceHolder("Degree");

        jTextFieldPlaceHolderCoursework.setPlaceHolder("Relevant coursework");

        jTextFieldPlaceHolderFieldStudy2.setPlaceHolder("Secondary field of study");

        jTextFieldPlaceHolderMinor.setPlaceHolder("Minor");

        javax.swing.GroupLayout EducationPanelLayout = new javax.swing.GroupLayout(EducationPanel);
        EducationPanel.setLayout(EducationPanelLayout);
        EducationPanelLayout.setHorizontalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel24))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)
                        .addGap(108, 108, 108)
                        .addComponent(jTextFieldPlaceHolderUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addGap(95, 95, 95)
                        .addComponent(jTextFieldPlaceHolderUnidate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldPlaceHolderDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21)
                        .addGap(122, 122, 122)
                        .addComponent(jTextFieldPlaceHolderFieldStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldPlaceHolderFieldStudy2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldPlaceHolderMinor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)
                        .addGap(176, 176, 176)
                        .addComponent(jTextFieldPlaceHolderGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23)
                        .addGap(85, 85, 85)
                        .addComponent(jTextFieldPlaceHolderCoursework, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EducationPanelLayout.createSequentialGroup()
                .addComponent(nextButtonEducation)
                .addGap(239, 239, 239))
        );
        EducationPanelLayout.setVerticalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(26, 26, 26)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17))
                    .addComponent(jTextFieldPlaceHolderUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(jTextFieldPlaceHolderUnidate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(jTextFieldPlaceHolderDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(jTextFieldPlaceHolderFieldStudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel25))
                    .addComponent(jTextFieldPlaceHolderFieldStudy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel26))
                    .addComponent(jTextFieldPlaceHolderMinor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldPlaceHolderGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldPlaceHolderCoursework, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(nextButtonEducation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Education", EducationPanel);

        nextButtonSkills.setText("Next");
        nextButtonSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonSkillsActionPerformed(evt);
            }
        });

        jLabel18.setText("Languages*");

        jLabel27.setText("Programming languages");

        jLabel28.setText("Softwares");

        jLabel29.setText("Certifications");

        jLabel32.setText("Skills Section");

        jTextFieldPlaceHolderLanguages.setPlaceHolder("Languages");
        jTextFieldPlaceHolderLanguages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderLanguagesActionPerformed(evt);
            }
        });

        jTextFieldPlaceHolderProgramming.setPlaceHolder("Programming languages");

        jTextFieldPlaceHolderCertifications.setPlaceHolder("Certifications");
        jTextFieldPlaceHolderCertifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlaceHolderCertificationsActionPerformed(evt);
            }
        });

        jTextFieldPlaceHolderSoftwares.setPlaceHolder("Softwares");

        javax.swing.GroupLayout SkillsPanelLayout = new javax.swing.GroupLayout(SkillsPanel);
        SkillsPanel.setLayout(SkillsPanelLayout);
        SkillsPanelLayout.setHorizontalGroup(
            SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkillsPanelLayout.createSequentialGroup()
                .addGroup(SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SkillsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldPlaceHolderSoftwares, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SkillsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel18))
                        .addGap(68, 68, 68)
                        .addGroup(SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPlaceHolderLanguages, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPlaceHolderProgramming, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SkillsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel29)
                        .addGap(131, 131, 131)
                        .addComponent(jTextFieldPlaceHolderCertifications, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SkillsPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(nextButtonSkills))
                    .addGroup(SkillsPanelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel32)))
                .addGap(214, 214, 214))
        );
        SkillsPanelLayout.setVerticalGroup(
            SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkillsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(29, 29, 29)
                .addGroup(SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldPlaceHolderLanguages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextFieldPlaceHolderProgramming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SkillsPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel28))
                    .addComponent(jTextFieldPlaceHolderSoftwares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SkillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SkillsPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel29))
                    .addComponent(jTextFieldPlaceHolderCertifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addComponent(nextButtonSkills)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Skills", SkillsPanel);

        javax.swing.GroupLayout WorkPanelLayout = new javax.swing.GroupLayout(WorkPanel);
        WorkPanel.setLayout(WorkPanelLayout);
        WorkPanelLayout.setHorizontalGroup(
            WorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        WorkPanelLayout.setVerticalGroup(
            WorkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Work Experience", WorkPanel);

        addAchievementButton.setText("Add new achievement");
        addAchievementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAchievementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AchievementsPanelLayout = new javax.swing.GroupLayout(AchievementsPanel);
        AchievementsPanel.setLayout(AchievementsPanelLayout);
        AchievementsPanelLayout.setHorizontalGroup(
            AchievementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AchievementsPanelLayout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(addAchievementButton)
                .addGap(15, 15, 15))
        );
        AchievementsPanelLayout.setVerticalGroup(
            AchievementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AchievementsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addAchievementButton)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Achievements", AchievementsPanel);

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
        submitInputPersonalInfo();
        
        jTabbedPane.setSelectedIndex(1);
        
    }//GEN-LAST:event_nextButtonPersonalActionPerformed

    private void nextButtonEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonEducationActionPerformed
        submitInputEducation();
        
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_nextButtonEducationActionPerformed

    private void jTextFieldPlaceHolderLanguagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderLanguagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderLanguagesActionPerformed

    private void nextButtonSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonSkillsActionPerformed
        submitInputSkills();
        
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_nextButtonSkillsActionPerformed

    private void jTextFieldPlaceHolderCertificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlaceHolderCertificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlaceHolderCertificationsActionPerformed

    private void addAchievementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAchievementButtonActionPerformed
        AchievementEntryPanel indivAchievementPanel = new AchievementEntryPanel();
        achievementPanelsList.add(indivAchievementPanel);
        
        System.out.println("test");
        System.out.println(achievementPanelsList);

        AchievementsPanel.add(indivAchievementPanel);
        AchievementsPanel.revalidate();
        AchievementsPanel.repaint();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_addAchievementButtonActionPerformed

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
    }
    
    public void setInputListener(InputListener listener) {
        this.inputListener = listener;
    }
    

    // Method to be called when the input is ready to be submitted
    private void submitInputPersonalInfo() {
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
        } else {
        // Show an error message or handle the case where some fields are empty
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
                       
    }
    
    private void submitInputEducation() {
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
        } else {
        // Show an error message or handle the case where some fields are empty
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
                       
    }
    
    private void submitInputSkills() {
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
        } else {
        // Show an error message or handle the case where some fields are empty
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
                       
    }
    
    public javax.swing.JPanel getAchievementsPanel() {
        return AchievementsPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AchievementsPanel;
    private javax.swing.JPanel ButtonContainer;
    private javax.swing.JPanel EducationPanel;
    private javax.swing.JPanel GridContainer;
    private javax.swing.JPanel PersonalInformationPanel;
    private javax.swing.JPanel SkillsPanel;
    private javax.swing.JPanel TitleContainer;
    private javax.swing.JPanel WorkPanel;
    private javax.swing.JButton addAchievementButton;
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
    private javax.swing.JLabel personalInfoLabel;
    // End of variables declaration//GEN-END:variables
    
    private InputListener inputListener;
    private ArrayList<AchievementEntryPanel> achievementPanelsList = new ArrayList<>();
    
}

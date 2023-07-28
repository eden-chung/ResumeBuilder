/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resumebuilder;

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
        nextButtonPersonal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPlaceHolderName = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderLocation = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderLinkedin = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderEmail = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderPhone = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
        jTextFieldPlaceHolderGithub = new com.mycompany.resumebuilder.JTextFieldPlaceHolder();
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
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nextButtonPersonal.setText("Next");
        nextButtonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonPersonalActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter your name*");

        jLabel2.setText("Welcome to Resume Builder");

        jLabel3.setText("Personal Information Section");

        jLabel4.setText("Enter your location*");

        jLabel5.setText("Enter your phone number*");

        jLabel6.setText("Enter your email*");

        jLabel7.setText("Enter your LinkedIn*");

        jLabel8.setText("Enter your GitHub");

        jTextFieldPlaceHolderName.setPlaceHolder("Name");

        jTextFieldPlaceHolderLocation.setPlaceHolder("Location");

        jTextFieldPlaceHolderLinkedin.setPlaceHolder("LinkedIn");

        jTextFieldPlaceHolderEmail.setPlaceHolder("Email");

        jTextFieldPlaceHolderPhone.setPlaceHolder("Phone number");

        jTextFieldPlaceHolderGithub.setPlaceHolder("GitHub");

        javax.swing.GroupLayout PersonalInformationPanelLayout = new javax.swing.GroupLayout(PersonalInformationPanel);
        PersonalInformationPanel.setLayout(PersonalInformationPanelLayout);
        PersonalInformationPanelLayout.setHorizontalGroup(
            PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel2))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel3))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(107, 107, 107)
                .addComponent(jTextFieldPlaceHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(94, 94, 94)
                .addComponent(jTextFieldPlaceHolderLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTextFieldPlaceHolderPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(108, 108, 108)
                .addComponent(jTextFieldPlaceHolderEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(90, 90, 90)
                .addComponent(jTextFieldPlaceHolderLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(103, 103, 103)
                .addComponent(jTextFieldPlaceHolderGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(nextButtonPersonal))
        );
        PersonalInformationPanelLayout.setVerticalGroup(
            PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldPlaceHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jTextFieldPlaceHolderLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldPlaceHolderPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jTextFieldPlaceHolderEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonalInformationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(jTextFieldPlaceHolderLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PersonalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPlaceHolderGithub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(nextButtonPersonal))
        );

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

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

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
                .addGap(68, 68, 68)
                .addComponent(submitButton)
                .addGap(99, 99, 99))
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
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(nextButtonEducation)
                        .addContainerGap(59, Short.MAX_VALUE))))
        );

        jTabbedPane.addTab("Education", EducationPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonPersonalActionPerformed
        submitInputPersonalInfo();
        
        jTabbedPane.setSelectedIndex(1);
        
    }//GEN-LAST:event_nextButtonPersonalActionPerformed

    private void nextButtonEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonEducationActionPerformed
        submitInputEducation();
    }//GEN-LAST:event_nextButtonEducationActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        submitButtonClicked();
    }//GEN-LAST:event_submitButtonActionPerformed

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
        void onInputSubmitButton();
    }
    
    public void setInputListener(InputListener listener) {
        this.inputListener = listener;
    }
    
    private void submitButtonClicked() {
        
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
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EducationPanel;
    private javax.swing.JPanel PersonalInformationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderCoursework;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderDegree;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderEmail;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderFieldStudy;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderFieldStudy2;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderGPA;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderGithub;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderLinkedin;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderLocation;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderMinor;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderName;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderPhone;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderUnidate;
    private com.mycompany.resumebuilder.JTextFieldPlaceHolder jTextFieldPlaceHolderUniversity;
    private javax.swing.JButton nextButtonEducation;
    private javax.swing.JButton nextButtonPersonal;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
    
    private InputListener inputListener;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.resumebuilder;

import com.mycompany.resumebuilder.Backend.SQLiteConnector;
import javax.swing.*;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

        
/**
 *
 * @author EdenChung
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ResumeBuilder implements MainJFrame.InputListener {
    
    private CompileLatex latex = new CompileLatex();
    
    public void onInputSubmittedPersonal(String name, String location, String phone, String email, String linkedin, String github) {
        latex.resetPersonal();
        latex.addPersonalInfo(name, location, phone, email, linkedin, github);
        latex.compileFile();
    }
    
    public void onInputSubmittedEducation(String university, String unidate, String degree, String fieldStudy, String fieldStudy2, String minor, String gpa, String coursework) {
        latex.resetEducation();
        latex.addEducationInfo(university, unidate, degree, fieldStudy, fieldStudy2, minor, gpa, coursework);
        latex.compileFile();
    }
    
    public void onInputSubmittedSkills(String languages, String programming, String softwares, String certifications) {
        latex.resetSkills();
        latex.addSkillsInfo(languages, programming, softwares, certifications);
        latex.compileFile();
    }
    
    public void onInputSubmittedAchievements(String[][] achievementInfoArray) {
        latex.resetAchievements();
        latex.addAchievementInfo(achievementInfoArray);
        latex.compileFile();
    }
    
    public void onInputSubmittedWork(String[][] workArray) {
        latex.resetWork();
        latex.addWorkInfo(workArray);
        latex.compileFile();
    }
    
    public void onInputSubmittedProjects(String[][] projectArray) {
        latex.resetProjects();
        latex.addProjectInfo(projectArray);
        latex.compileFile();
    }
    
    public static void main(String[] args) {
        
        ResumeBuilder builder = new ResumeBuilder();
        builder.latex.resetTemplate();
        
        Authentication authenticationFrame = new Authentication();
        authenticationFrame.pack();
        authenticationFrame.setVisible(true);

        
       
    }
        
    
    
}

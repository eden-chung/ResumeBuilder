/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.resumebuilder;

import javax.swing.*;
import java.io.*;

        
/**
 *
 * @author EdenChung
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ResumeBuilder implements NewJFrame.InputListener {
    
    private CompileLatex latex = new CompileLatex();
    
    public void onInputSubmitted(String name, String school, String location, String phone, String email, String linkedin, String github) {
        System.out.println("Name: " + name);
        System.out.println("School: " + school);

        // Once you have the input data, you can proceed with compiling LaTeX or any other tasks
        latex.resetTemplate();
        latex.addPersonalInfo(name, school, location, phone, email, linkedin, github);
        latex.compileFile();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //ResumeBuilder builder = new ResumeBuilder();
        
        //builder.latex.resetTemplate();
        
        NewJFrame frame1 = new NewJFrame();
        frame1.setInputListener(new ResumeBuilder());
        SwingUtilities.invokeLater(() -> frame1.setVisible(true));
        

    }
    
    
}

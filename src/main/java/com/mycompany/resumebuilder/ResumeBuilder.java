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
    
    public void onInputSubmitted(String name, String location, String phone, String email, String linkedin, String github) {
        latex.resetTemplate();
        latex.addPersonalInfo(name, location, phone, email, linkedin, github);
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

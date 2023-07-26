/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resumebuilder;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author EdenChung
 */
public class CompileLatex {
    
    private static final String RESUME_PATH = "/Users/EdenChung/Desktop/Eden/Home/Coding/Java/ResumeBuilder/src/main/java/com/mycompany/resumebuilder/latex_files/resume.tex";
    private static final String RESUME_BACKUP_PATH = "/Users/EdenChung/Desktop/Eden/Home/Coding/Java/ResumeBuilder/src/main/java/com/mycompany/resumebuilder/latex_files/resume_orig.tex";

    
    public void resetTemplate() {
        String pathToBackupFile = RESUME_BACKUP_PATH;
        String pathToTexFile = RESUME_PATH;

        try {
            Path backupPath = Paths.get(pathToBackupFile);
            Path texPath = Paths.get(pathToTexFile);

            // Copy the contents of the backup file to the .tex file
            Files.copy(backupPath, texPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Template reset successful.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Template reset failed.");
        }
    }
    
    public static void compileFile() {
        try {
            String pathToFile = RESUME_PATH;
            String pdflatexPath = "/Library/TeX/texbin/pdflatex";
            
            String outputDirectory = "/Users/EdenChung/Desktop/Eden/Home/Coding/Java/ResumeBuilder/src/main/java/com/mycompany/resumebuilder/latex_files/";
                    
            String[] command = {pdflatexPath, "-interaction=nonstopmode", "-output-directory=" + outputDirectory, pathToFile};
            
            
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();
            


            // Wait for the process to finish
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Compilation successful.");
            } else {
                System.out.println("Compilation failed.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void addPersonalInfo(String name, String school, String location, String phone, String email, String linkedin, String github) {
        try {
            // Read the .tex template file
            String templateContent = new String(Files.readAllBytes(Paths.get(RESUME_PATH)));

            // Replace placeholders with user input
            String resumeContent = templateContent.replace("{name}", name);
            resumeContent = resumeContent.replace("{school}", school);
            resumeContent = resumeContent.replace("{location}", location);
            resumeContent = resumeContent.replace("{phone}", phone);
            resumeContent = resumeContent.replace("{email}", email);
            resumeContent = resumeContent.replace("{linkedin}", linkedin);
                        
            if (!github.equals("")) {
                String fullGithub = "$\\vert$ \\href{" + github + "}{\\underline{" + github + "}}";
                resumeContent = resumeContent.replace("%{github}", fullGithub);
            }
           
            
            


            // Save the modified content back to the .tex file
            Files.write(Paths.get(RESUME_PATH), resumeContent.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    
}


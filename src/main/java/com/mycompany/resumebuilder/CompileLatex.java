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
import java.util.regex.*;

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
    
    public void resetPersonal() {
        try {
            String content = new String(Files.readAllBytes(Paths.get(RESUME_PATH)));

            String startSymbol = "%StartPersonal**";
            String endSymbol = "%EndPersonal**";
            
            String personalInfoTemplate = "%StartPersonal**\n" +
                "\\newcommand{\\myaddress}{%\n" +
                "  {location} $\\vert$ {phone} $\\vert$ {email} $\\vert$ \\href{{linkedin}}{\\underline{{linkedin}}} %{github}\n" +
                "}\n" + "\n" + "\\name{{name}}\n" + "%EndPersonal**";

            int startIndex = content.indexOf(startSymbol);
            int endIndex = content.indexOf(endSymbol);

            if (startIndex != -1 && endIndex != -1) {
                String template = content.substring(0, startIndex) + personalInfoTemplate + content.substring(endIndex + endSymbol.length());

                try {
                    Files.write(Paths.get(RESUME_PATH), template.getBytes());
                    System.out.println("Personal info reset successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Start or End symbol not found. Personal info not reset.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void resetEducation() {
        try {
            String content = new String(Files.readAllBytes(Paths.get(RESUME_PATH)));

            String startSymbol = "%StartEducation**";
            String endSymbol = "%EndEducation**";
            
            String educationTemplate = "%StartEducation**\n" +
                "{\\bf {university}} \\hfill {{unidate}}\n" +
                "\\\\\n" +
                "{degree} {fieldStudy}%{fieldStudy2}\n" +
                "%{minor}\n" +
                ", GPA: {gpa}\n" +
                "\\\\\n" +
                "%{relevantcoursework}\n" +
                "%EndEducation**";

            int startIndex = content.indexOf(startSymbol);
            int endIndex = content.indexOf(endSymbol);

            if (startIndex != -1 && endIndex != -1) {
                String template = content.substring(0, startIndex) + educationTemplate + content.substring(endIndex + endSymbol.length());

                try {
                    Files.write(Paths.get(RESUME_PATH), template.getBytes());
                    System.out.println("Education info reset successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Start or End symbol not found. Education info not reset.");
            }
        } catch (IOException e) {
            e.printStackTrace();
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
    
    public void addPersonalInfo(String name, String location, String phone, String email, String linkedin, String github) {
        try {
            // Read the .tex template file
            String templateContent = new String(Files.readAllBytes(Paths.get(RESUME_PATH)));

            // Replace placeholders with user input
            String resumeContent = templateContent.replace("{name}", name);
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
    
    public void addEducationInfo(String university, String unidate, String degree, String fieldStudy, String fieldStudy2, String minor, String gpa, String coursework) {
        try {
            // Read the .tex template file
            String templateContent = new String(Files.readAllBytes(Paths.get(RESUME_PATH)));

            // Replace placeholders with user input
            String resumeContent = templateContent.replace("{university}", university);
            resumeContent = resumeContent.replace("{unidate}", unidate);
            resumeContent = resumeContent.replace("{degree}", degree);
            resumeContent = resumeContent.replace("{fieldStudy}", fieldStudy);
            resumeContent = resumeContent.replace("{gpa}", gpa);
                        
            if (!fieldStudy2.equals("")) {
                String fullFieldStudy2 = " and " + fieldStudy2 + "%";
                resumeContent = resumeContent.replace("%{fieldStudy2}", fullFieldStudy2);
            }
            
            if (!minor.equals("")) {
                String fullMinor = ", minor in " + minor + "%";
                resumeContent = resumeContent.replace("%{minor}", fullMinor);
            }
            
            if (!coursework.equals("")) {
                String fullCoursework = "Relevant coursework: " + coursework;
                resumeContent = resumeContent.replace("%{relevantcoursework}", fullCoursework);
            }
          

            // Save the modified content back to the .tex file
            Files.write(Paths.get(RESUME_PATH), resumeContent.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resumebuilder.Backend;

/**
 *
 * @author EdenChung
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseSetup {
    
    public static void main(String[] args) {
        String url = "jdbc:sqlite:/Users/EdenChung/Desktop/Eden/Home/Coding/Projects/ResumeBuilder/database.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            Statement statement = connection.createStatement();
            
            String createUsersTable = "CREATE TABLE users (" +
                                      "id INTEGER PRIMARY KEY," +
                                      "username TEXT NOT NULL," +
                                      "password_hash TEXT NOT NULL);";
            statement.execute(createUsersTable);
            
            String createUserInputsTable = "CREATE TABLE user_inputs (" +
                    "id INTEGER PRIMARY KEY," +
                    "user_id INTEGER," +
                    "resume_name TEXT," +
                    "name TEXT," +
                    "location TEXT," +
                    "phone_number TEXT," +
                    "email TEXT," +
                    "linkedin TEXT," +
                    "github TEXT," +
                    "university_name TEXT," +
                    "graduation_date TEXT," +
                    "degree_type TEXT," +
                    "field_of_study TEXT," +
                    "secondary_field_of_study TEXT," +
                    "minor TEXT," +
                    "gpa REAL," +
                    "coursework TEXT," +
                    "languages TEXT," +
                    "programming_languages TEXT," +
                    "softwares TEXT," +
                    "certifications TEXT," +
                    "work_experience_json TEXT," +
                    "projects_json TEXT," +
                    "achievements_json TEXT," +
                    "date_time DATETIME DEFAULT CURRENT_TIMESTAMP);";
            statement.execute(createUserInputsTable);

            System.out.println("Tables created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


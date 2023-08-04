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
        String url = "jdbc:sqlite:/Users/EdenChung/Desktop/Eden/Home/Coding/Projects/ResumeBuilder/src/main/java/com/mycompany/resumebuilder/Backend/database.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            Statement statement = connection.createStatement();
            
            String createUsersTable = "CREATE TABLE users (" +
                                      "id INTEGER PRIMARY KEY," +
                                      "username TEXT NOT NULL," +
                                      "password_hash TEXT NOT NULL);";
            statement.execute(createUsersTable);

            String createTexFilesTable = "CREATE TABLE tex_files (" +
                                         "id INTEGER PRIMARY KEY," +
                                         "user_id INTEGER," +
                                         "file_name TEXT NOT NULL," +
                                         "content BLOB NOT NULL," +
                                         "date_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +
                                         "FOREIGN KEY (user_id) REFERENCES users(id));";
            statement.execute(createTexFilesTable);

            System.out.println("Tables created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


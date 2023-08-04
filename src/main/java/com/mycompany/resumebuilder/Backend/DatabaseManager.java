/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resumebuilder.Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author EdenChung
 */
public class DatabaseManager {
    private static final String DATABASE_URL = "jdbc:sqlite:/Users/EdenChung/Desktop/Eden/Home/Coding/Projects/ResumeBuilder/src/main/java/com/mycompany/resumebuilder/Backend/database.db";

    public static boolean createUser(String username, String password) {
        String hashedPassword = PasswordHashing.hashPassword(password);

        String insertQuery = "INSERT INTO users (username, password_hash) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, hashedPassword);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

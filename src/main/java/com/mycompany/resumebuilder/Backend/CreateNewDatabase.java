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
import java.sql.SQLException;

public class CreateNewDatabase {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.sqlite.JDBC");

            connection = DriverManager.getConnection("jdbc:sqlite:/Users/EdenChung/Desktop/Eden/Home/Coding/Projects/ResumeBuilder/src/main/java/com/mycompany/resumebuilder/Backend/database.db");
            System.out.println("Database created successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

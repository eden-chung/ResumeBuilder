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

public class SQLiteConnector {
    private static Connection connection;

    public static Connection connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:sqlite:/Users/EdenChung/Desktop/Eden/Home/Coding/Projects/ResumeBuilder/src/main/java/com/mycompany/resumebuilder/Backend/database.db";
            connection = DriverManager.getConnection(url);
        }
        return connection;
    }

    public static void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}


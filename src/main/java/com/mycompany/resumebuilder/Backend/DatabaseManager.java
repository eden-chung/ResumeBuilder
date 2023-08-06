/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resumebuilder.Backend;

import com.mycompany.resumebuilder.Backend.UserInputs.PersonData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author EdenChung
 */
public class DatabaseManager {
    private static final String DATABASE_URL = "jdbc:sqlite:/Users/EdenChung/Desktop/Eden/Home/Coding/Projects/ResumeBuilder/database.db";

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
    
    public static boolean checkUserExists(String username) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement statement = connection.prepareStatement("SELECT id FROM users WHERE username = ?")) {
            statement.setString(1, username);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean checkPassword(String username, String password) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement statement = connection.prepareStatement("SELECT password_hash FROM users WHERE username = ?")) {
            statement.setString(1, username);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String storedPasswordHash = resultSet.getString("password_hash");
                    return PasswordHashing.checkPassword(password, storedPasswordHash);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static int getUserId(String username) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement statement = connection.prepareStatement("SELECT id FROM users WHERE username = ?")) {
            statement.setString(1, username);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    
    public static void addAll(String name, String location, String phone, String email, String linkedin, String github,
                                     String university, String graduationDate, String degreeType, String fieldOfStudy,
                                     String secondaryFieldOfStudy, String minor, String gpa, String coursework, 
                                     String programming_languages, String softwares, String certifications, String languages,
                                     String workJSON, String projectsJSON, String achievementsJSON,
                                     int userId, LocalDateTime currentDateTime) {
        String insertQuery = "INSERT INTO user_inputs (name, location, phone_number, email, linkedin, github, " +
                         "university_name, graduation_date, degree_type, field_of_study, secondary_field_of_study, " +
                         "minor, gpa, coursework, " +
                         "languages, programming_languages, softwares, certifications, " +
                         "work_experience_json, projects_json, achievements_json, " +
                         "user_id, date_time)" +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, location);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, linkedin);
            preparedStatement.setString(6, github);
            preparedStatement.setString(7, university);
            preparedStatement.setString(8, graduationDate);
            preparedStatement.setString(9, degreeType);
            preparedStatement.setString(10, fieldOfStudy);
            preparedStatement.setString(11, secondaryFieldOfStudy);
            preparedStatement.setString(12, minor);
            preparedStatement.setString(13, gpa);
            preparedStatement.setString(14, coursework);
            preparedStatement.setString(15, languages);
            preparedStatement.setString(16, programming_languages);
            preparedStatement.setString(17, softwares);
            preparedStatement.setString(18, certifications);
            preparedStatement.setString(19, workJSON);
            preparedStatement.setString(20, projectsJSON);
            preparedStatement.setString(21, achievementsJSON);
            preparedStatement.setInt(22, userId);
            preparedStatement.setObject(23, currentDateTime);

            preparedStatement.executeUpdate();
            System.out.println("success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static PersonData getPersonalInfo(PersonData info, int userId, LocalDateTime currentDateTime) {
        String query = "SELECT name, location, phone_number, email, linkedin, github FROM user_inputs WHERE user_id = ? AND date_time = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL);
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, userId);
            preparedStatement.setObject(2, currentDateTime);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                info = new PersonData();
                info.name = resultSet.getString("name");
                info.location = resultSet.getString("location");
                info.phoneNumber = resultSet.getString("phone_number");
                info.email = resultSet.getString("email");
                info.linkedin = resultSet.getString("linkedin");
                info.github = resultSet.getString("github");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return info;
    }
    
    public static PersonData getEducationInfo(PersonData info, int userId, LocalDateTime currentDateTime) {
        String query = "SELECT university_name, graduation_date, degree_type, field_of_study, secondary_field_of_study, minor, gpa, coursework FROM user_inputs WHERE user_id = ? AND date_time = ?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL);
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, userId);
            preparedStatement.setObject(2, currentDateTime);


            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                info.universityName = resultSet.getString("university_name");
                info.graduationDate = resultSet.getString("graduation_date");
                info.degreeType = resultSet.getString("degree_type");
                info.fieldOfStudy = resultSet.getString("field_of_study");
                info.secondaryFieldOfStudy = resultSet.getString("secondary_field_of_study");
                info.minor = resultSet.getString("minor");
                info.gpa = resultSet.getString("gpa");
                info.coursework = resultSet.getString("coursework");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return info;
    }
    
    public static PersonData getSkillsInfo(PersonData info, int userId, LocalDateTime currentDateTime) {
        String query = "SELECT languages, programming_languages, softwares, certifications FROM user_inputs WHERE user_id = ? AND date_time = ?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL);
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, userId);
            preparedStatement.setObject(2, currentDateTime);


            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                info.languages = resultSet.getString("languages");
                info.programmingLanguages = resultSet.getString("programming_languages");
                info.softwares = resultSet.getString("softwares");
                info.certifications = resultSet.getString("certifications");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return info;
    }
    
    public static PersonData getJsonInfo(PersonData info, int userId, LocalDateTime currentDateTime) {
        String query = "SELECT work_experience_json, projects_json, achievements_json FROM user_inputs WHERE user_id = ? AND date_time = ?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL);
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, userId);
            preparedStatement.setObject(2, currentDateTime);


            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                info.workJSON = resultSet.getString("work_experience_json");
                info.projectsJSON = resultSet.getString("projects_json");
                info.achievementsJSON = resultSet.getString("achievements_json");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return info;
    }
    
    /*
    public static ArrayList<Object[]> retrievePreviousVersions(int userId) {
        ArrayList<Object[]> versions = new ArrayList<>();

        String query = "SELECT DISTINCT date_time FROM user_inputs WHERE user_id = ?";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int versionId = resultSet.getInt("id");
                LocalDateTime versionDateTime = resultSet.getObject("date_time", LocalDateTime.class);

                Object[] versionInfo = { versionId, versionDateTime };
                versions.add(versionInfo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return versions;
    }
*/
    /*
    public static ArrayList<Object[]> retrievePreviousVersions(int userId) {
        ArrayList<Object[]> versions = new ArrayList<>();

        String query = "SELECT DISTINCT date_time FROM user_inputs WHERE user_id = ?";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String timestamp = resultSet.getString("date_time");
                Object[] versionInfo = new Object[1];
                versionInfo[0] = timestamp;
                versions.add(versionInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return versions;
    }*/
    
    public static ArrayList<Object[]> retrievePreviousVersions(int userId) {
        ArrayList<Object[]> versions = new ArrayList<>();

        String query = "SELECT DISTINCT date_time, resume_name FROM user_inputs WHERE user_id = ?";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String timestamp = resultSet.getString("date_time");
                String resumeName = resultSet.getString("resume_name");
                Object[] versionInfo = new Object[2];
                versionInfo[0] = timestamp;
                versionInfo[1] = resumeName;
                versions.add(versionInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return versions;
    }
    
    public static void changeResumeName(String newName, int userId, LocalDateTime currentDateTime) {
        String updateQuery = "UPDATE user_inputs SET resume_name = ? WHERE user_id = ? AND date_time = ?";

        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, userId);
            preparedStatement.setObject(3, currentDateTime);

            preparedStatement.executeUpdate();
            System.out.println("Resume name updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    
}

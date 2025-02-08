package com.gokul.testing;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/book"; // Change database name
        String user = "root";  // Change username
        String password = "Password@12";  // Change password

        // Query to fetch data
        String selectQuery = "SELECT * FROM book_details";
        
        // Query to update data
        String updateQuery = "UPDATE book_details SET title = ? WHERE id = ?";

        try (
           
            Connection conn = DriverManager.getConnection(url, user, password);
            
         
            Statement stmt = conn.createStatement();
        ) {
            // Updating book title where id = 1
            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setString(1, "Updated Book Title");
                pstmt.setInt(2, 1);
                int rowsUpdated = pstmt.executeUpdate();
                
                if (rowsUpdated > 0) {
                    System.out.println("Book details updated successfully!");
                } else {
                    System.out.println("No record found to update.");
                }
            }

            // Execute Query to fetch updated records
            ResultSet rs = stmt.executeQuery(selectQuery);

            // Process the Result Set
            while (rs.next()) {
                System.out.println("id: " + rs.getInt(1) + "  title: " + rs.getString(2));
            }

            // Close result set
            rs.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

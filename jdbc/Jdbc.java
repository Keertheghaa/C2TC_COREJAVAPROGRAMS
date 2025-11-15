package com.tnsif.jdbc;


import java.sql.*;

	public class Jdbc {

		public static void main(String[] args) {
	        // Database credentials
	        String url = "jdbc:postgresql://localhost:5432/C76_db"; // Change database name
	        String user = "postgres"; // Change to your PostgreSQL username
	        String password = "Keerthi@1122"; // Change to your PostgreSQL password
	        
	        // JDBC variables
	        java.sql.Connection conn = null;
	        Statement stmt = null;
	        ResultSet rs = null;

	        try {
	            // Load PostgreSQL JDBC Driver
	            Class.forName("org.postgresql.Driver");

	            // Establish Connection
	            conn = DriverManager.getConnection(url, user, password);

	            // Create Statement
	            stmt = conn.createStatement();

	            // Execute Query
	            String query = "SELECT * FROM student";
	            rs = stmt.executeQuery(query);

	            // Process the result set
	            System.out.println("Student Details:");
	            System.out.println("--------------------------------------");
	            while (rs.next()) {
	                int id = rs.getInt("sid");
	                String name = rs.getString("sname");
	                String city= rs.getString("city");

	                System.out.println("ID: " + id + ", Name: " + name + ", City: " + city );
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close resources
	            try {
	                if (rs != null) rs.close();
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }


}

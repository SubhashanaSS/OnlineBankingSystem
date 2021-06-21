package com.record;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	//access to database
	private static String url = "jdbc:mysql://localhost:3306/transferfunds";
	private static String username = "root";
	private static String password = "1234";
	private static Connection con;
	
	public static Connection getConnection() {
		//check database connection
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 
			
			con = DriverManager.getConnection(url, username, password);
			
			
		}
		catch(Exception ex) {
			System.out.println("Database Connection is not success"); //display error
		}
		
		return con;
	}

}

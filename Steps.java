package org.test.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Steps {

	public static void main(String[] args) {
		try {
			//step 1 : load and register the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//step 2 : Establish the connection between java application and DataBase server
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			//step 3 : Create the platform
			Statement stmt = con.createStatement();
			//step 4 : Execute the sql queries and sql statement
			stmt.executeUpdate("insert into student.student values(10,'arun','mumbai') ");
			
			System.out.print("insert successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

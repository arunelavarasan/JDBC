package org.test.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("Update student.student set place = 'Ambivali' where id = 10");
			
			System.out.print("Update successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}

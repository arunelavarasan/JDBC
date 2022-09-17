package org.test.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PlaceholderInsert {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt = con.prepareStatement("insert into student.student values(?,?,?)");
			
			pstmt.setInt(1, 4);
			pstmt.setString(2,"John");
			pstmt.setString(3,"New York");
			
			pstmt.executeUpdate();
			System.out.print("insert successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
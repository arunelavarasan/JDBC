package org.test.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PlaceholderUpdate {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt = con.prepareStatement("update student.student set place = 'australia' where id = ?");
			
			pstmt.setInt(1, 12);
			
			pstmt.executeUpdate();
			System.out.print("update successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
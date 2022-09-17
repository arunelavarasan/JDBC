package org.test.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PlaceholderDelete {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt = con.prepareStatement("delete from student.student where id = ?");
			
			pstmt.setInt(1, 13);
			
			pstmt.executeUpdate();
			System.out.print("deleted successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
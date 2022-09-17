package org.test.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlaceholderFetch {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt = con.prepareStatement("select * from student.student where id = ?");
			
			pstmt.setInt(1,4);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
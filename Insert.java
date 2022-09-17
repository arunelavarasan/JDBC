package org.test.App;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("insert into student.student values(11,'Miller','US')");
			stmt.executeUpdate("insert into student.student values(12,'SCOTT','UK')");
			stmt.executeUpdate("insert into student.student values(13,'KING','USA')");
			
			System.out.print("insert successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

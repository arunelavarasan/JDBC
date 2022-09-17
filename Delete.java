package org.test.App;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Delete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("delete from student.student where id = 67");
			
			System.out.print("deleted successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

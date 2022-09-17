package org.test.App;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Batch {

	public static void main(String[] args) {
		try {
			String inQry1 = "insert into student.student values(13,'DAVID','UK')";
			String delQry = "delete from student.student where id = 12";
			String inQry2 = "insert into student.student values(12,'Scott','UK')";
			String upQry = "insert into student.student values(15,'KING','USA')";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			Statement stmt = con.createStatement();
			
			stmt.addBatch(inQry1);
			stmt.addBatch(delQry);
			stmt.addBatch(inQry2);
			stmt.addBatch(upQry);
			
			stmt.executeBatch();
			System.out.print("Batch executed successfully please check the database for changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

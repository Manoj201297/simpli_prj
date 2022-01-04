package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertdata {
	
	private static Connection con;
	private static Statement stmt;
	
	public static void main(String[] args) {
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/amazon";
			String username = "root";
			String password = "root";
			String query = "INSERT INTO Amazon VALUE(1,\"Electronics\",\"Mobile phones\");";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl,username,password);
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static screenshot() throws Exception 

}

package JDBC;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class update_deleteDB {
	private static Connection con;
	private static Statement stmt;
	
	
	public static void main(String[] args) throws SQLException {
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/amazon";
			String username = "root";
			String password = "root";
			String query = "Update Amazon Set ID=1;";
			String q1 = "Update Amazon Set category='Electronics' Where ID=1;";
			String q2 = "Update Amazon Set searchterm='Mobile' Where ID=1;";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl,username,password);
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		

}




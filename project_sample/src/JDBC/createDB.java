package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createDB {
	private static Connection con;
	private static Statement stmt;
	
	public static void main(String[] args) {
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/Ecomerce";
			String username = "root";
			String password = "root";
			String query = "Create 	Table Products(Pname VARCHAR(50) NOT NULL, Pcost INT NOT NULL, Pratings INT NOT NULL, Pdiscount_rate INT, Pcost_after_discount INT);";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl,username,password);
			stmt = con.createStatement();
			stmt.execute(query);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
			
	}

}

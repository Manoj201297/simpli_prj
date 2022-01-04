package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/Ecomerce";
		String username = "root";
		String password = "root";
		String query = "select * from Products Where Pname = 'Watch';";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			System.out.println("Pname : " + rs.getString("Pname") +"\t");
			System.out.println("Pcost : " + rs.getString("Pcost") +"\t");
			System.out.println("Pratings : " + rs.getString("Pratings") +"\t");
			System.out.println("Pdiscount : " + rs.getString("Pdiscount_rate") +"\t");
			System.out.println("Pcost after discount : " + rs.getString("Pcost_after_discount"));
		}
		
	}

}

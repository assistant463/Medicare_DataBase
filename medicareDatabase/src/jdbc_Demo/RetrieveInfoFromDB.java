package jdbc_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveInfoFromDB {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/medicare";
		String username = "root";
		String password = "Maz@1";
		String query = "Select * from Product;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Name: " + rs.getString("name") + "\t");
			System.out.print("Brand: " + rs.getString("brand") + "\t");
			System.out.print("Description: " + rs.getString("description") + "\t");
			System.out.print("Price: " + rs.getString("unit_price") + "\t");
			System.out.print("Quantity: " + rs.getString("quantity") + "\t");
			System.out.println("Active: " + rs.getString("is_active") + "\t");
			
		}
		
		
		
	}

}

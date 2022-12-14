package jdbc_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/medicare";
		String username = "root";
		String password = "Maz@1";
		String query = "INSERT INTO Product ( Cheston_Cold, Cipla, For normal cold, 50, 20, true);";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.execute(query);
	}

}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class dbCollection {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/emp";
		String username = "root";
		String password = "root";
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		try {
			// 1. Register Driver
			Class.forName(JDBC_DRIVER);
			
			// 2. Create connection
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully connected to db");
		
		} catch (SQLException e) {
			System.out.println("SqL exception"+e.getMessage());
			
		} catch (ClassNotFoundException e) {
			System.out.println("Connection cannot be made."+e.getMessage());
		}
		finally {
			
		}

	}

}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static final String url = "jdbc:mysql://localhost:3306/emp";
	static final String username = "root";
	static final String password = "root";
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static Connection initConnection() {
		Connection conn = null;
		
		try {
			// 1. Register Driver
			//Class.forName(JDBC_DRIVER);
			
			// 2. Create connection
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully connected to db");
		
		} catch (SQLException e) {
			System.out.println("SqL exception"+e.getMessage());
			
		} //catch (ClassNotFoundException e) {
		//	System.out.println("Connection cannot be made."+e.getMessage());
		//}
		return conn;
	}
}

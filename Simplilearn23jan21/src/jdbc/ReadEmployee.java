package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployee {
	
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/emp";
	String username = "root";
	String password = "root";
	String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	Connection conn = null;
	Statement stm = null;
	
	try {
		// 1. Register Driver
		Class.forName(JDBC_DRIVER);
		
		// 2. Create connection
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Successfully connected to db");
		
		// 3. Create statement
		stm = conn.createStatement();
		
		// 4. Execute query
		String query = "select * from employees";
		ResultSet rest = stm.executeQuery(query);
		
		while(rest.next()) {
			System.out.println(rest.getInt("id")+" "+
		rest.getString("first_name")+" "+
		rest.getString("last_name")+" "+
		rest.getString("email")+" "+
		rest.getString("department")+" "+
		rest.getDouble("salary")+" ");
		}
	
	} catch (SQLException e) {
		System.out.println("SqL exception"+e.getMessage());
		
	} catch (ClassNotFoundException e) {
		System.out.println("Connection cannot be made."+e.getMessage());
	}
	finally {
		
	}
}
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployee2 {
	
public static void main(String[] args) {
	
	Statement stm = null;
	
	try {
		// 2. Create connection
		Connection conn = DBConnection.initConnection();
		
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
		
	}
}
}

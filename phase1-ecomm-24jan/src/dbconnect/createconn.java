package dbconnect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createconn {
	

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		//Mysql@127.0.0.1:3306
		String url = "jdbc:mysql://localhost:3306/emp";
		String username = "root";
		String password = "root";
		try {
			//Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create Connection
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection Successfull!!");
			//Create Statement
			stm = conn.createStatement();
			//Execute Query
			String query = "select * from employees";
			ResultSet rest = stm.executeQuery(query);
			while(rest.next()) {
				System.out.println(rest.getInt("id")+ " "+
						rest.getString("first_name")+ " "+
						rest.getString("last_name")+ " "+
						rest.getString("email")+ " "+
						rest.getString("department")+ " "+
						rest.getDouble("salary")+ " "
						);
			}
		} catch (SQLException e) {
			System.out.println("SQL output :: "+e.getSQLState());
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found :: "+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stm != null) {
				stm.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

	}

}
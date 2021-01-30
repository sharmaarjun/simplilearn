package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		
		try {
			// 1. get connection
			conn = DBConnection.initConnection();
			
			// 2. Create statement
			stm = conn.createStatement();
			
			//3. Execute Query
			String query = "delete from employees where id = 103";
			
			int rowsAffected = stm.executeUpdate(query);
			System.out.println("Count of rows affected :: "+rowsAffected);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//clean up
			if(conn != null) {
				conn.close();
			} if(stm != null) {
				stm.close();
			}
		}

	}

}

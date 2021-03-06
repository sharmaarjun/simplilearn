package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployee {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		
		try {
			// 1. get connection
			conn = DBConnection.initConnection();
			
			// 2. Create statement
			stm = conn.createStatement();
			
			//3. Execute Query
			String query = "insert into employees"+
			"(id,first_name,last_name,email,department,salary)"+
					"values "+
			"(104,'Jack','Sparrow','jack.sparrow@gmail.com','HR',11500),"+
			"(105,'Hunter','Hamsley','triple.h@gmail.com','Admin',11500.21)";
			
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

package dbconnectweb;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnect.DBConnection;

/**
 * Servlet implementation class Testjdbc
 */
@WebServlet("/Testjdbc")
public class Testjdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Testjdbc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//initialize jdbc connection
		try {
			PrintWriter out = response.getWriter();
			
			//Load data from config.properties file
			InputStream in = getServletContext().getResourceAsStream("/config.properties");
			Properties properties = new Properties();
			properties.load(in);
			
			// fetch properties
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			// create connection
			DBConnection conn = new DBConnection(url, username, password);
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
			//print response
			out.println("<html><body>");
			out.println("<h1> DB COnnection is initialized</h1>");
			out.println("</html></body>");
			
			conn.closeConnection();
			
		} catch (SQLException e) {
			System.out.println("NO DB found!!!!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			System.out.println("issue of class"+e.getMessage());
		}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

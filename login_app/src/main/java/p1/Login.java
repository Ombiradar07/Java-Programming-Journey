package p1;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			
			//Create database connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa","root","osm2024");
			
			// Perform SQL operations 
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from data where username='"+username+"' and password = '"+password+"'");
			
			if(result.next())
			{
				System.out.println("Welcome");
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
		}catch(Exception e )
		{
			e.printStackTrace();
		}
		
	}
}

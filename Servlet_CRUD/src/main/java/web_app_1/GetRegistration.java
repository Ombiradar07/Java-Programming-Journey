package web_app_1;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get-Registration")
public class GetRegistration extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public GetRegistration() {
        super();
    }
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	
    	 try {
             // Connect to the database
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa", "root", "osm2024");

             // Perform SQL insert
             Statement stmt = con.createStatement();
             ResultSet result = stmt.executeQuery("Select * from registration");
            out.print("<table border=2> ");
		    out.print("<tr>");
		    
		    out.print("<th>");
		    out.print("Name");
		    out.print("</th> ");
		    
		    out.print("<th>");
		    out.print("Email");
		    out.print("</th> ");
		    
		    out.print("<th>");
		    out.print("Mobile");
		    out.print("</th> ");
		    
		    out.print("</tr>") ;
 				
             
             while(result.next())
             {
            	 out.print("<tr>");
     		    
     		    out.print("<td>");
     		    out.print(result.getString(1));
     		    out.print("</td> ");
     		    
     		   out.print("<td>");
    		    out.print(result.getString(2));
    		    out.print("</td> ");
     		    
    		    out.print("<td>");
     		    out.print(result.getString(3));
     		    out.print("</td> ");
     		    
     		    out.print("</tr>") ;
             }
             out.print("</table>");
             
             
             // Close the connection
             con.close();
         } catch (Exception e) {
             e.printStackTrace();
         }	
    }
}

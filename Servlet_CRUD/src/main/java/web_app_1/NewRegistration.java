package web_app_1;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class NewRegistration extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public NewRegistration() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("firstName");
        String email = request.getParameter("emailId");
        String mobile = request.getParameter("mobile");

        try {
            // Connect to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa", "root", "osm2024");

            // Perform SQL insert
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO registration VALUES('" + name + "','" + email + "','" + mobile + "')");

            // Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

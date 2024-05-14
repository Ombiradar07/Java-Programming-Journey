package jdbc;
import java.sql.*;

public class JDBC {
	public static void main(String[] args) {
		
		try {
			// Create JDBC Connection 
			Connection con = DriverManager
							.getConnection("jdbc:mysql://127.0.0.1/psa", "root", "osm2024");
			System.out.println(con);
			
			
			// Perform sql operations
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into registration "
					         + "values('osm','osm@gmail.com','9182454017')");
			
			// close the database connection
			
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package jdbc;
import java.sql.*;

public class JDBC1 {
	
	public static void main(String[] args) {
		try {
			// create database connection 
			
			Connection con = DriverManager
							.getConnection("jdbc:mysql://127.0.0.1/psa", "root", "osm2024");
			System.out.println(con);
			
			//perform sql operations
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from  registration where email ='osm@gmail.com'");
			
			// close database connection 
			
			con.close();
			
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
	}
	
}

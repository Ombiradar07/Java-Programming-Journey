package jdbc;

import java.sql.*;

public class READINGJDBCDATA {

	public static void main(String[] args) {
		
		try {
			
			//create jdbc connection 
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa", "root", "osm2024");
			System.out.println(con);
			
			//perform jdbc operations
			
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("Select * from registration");
			
			while(result.next())
			{
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
			}
			
			
			// Close jdbc connection
			
			con.close();
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
	}
}

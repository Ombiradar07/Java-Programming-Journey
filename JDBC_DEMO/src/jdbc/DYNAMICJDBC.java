package jdbc;

import java.util.Scanner;
import java.sql.*;

public class DYNAMICJDBC {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name:");
			String name = sc.next() ;
			System.out.println("Enter your email :");
			String email = sc.next();
			System.out.println("Enter your Mobile number :");
			String mobile = sc.next();
			
			sc.close();
			
			// Create JDBC connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa", "root", "osm2024");
			System.out.println(con);
			
			// perform SQL operations
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into registration values('"+name+"','"+email+"','"+mobile+"')");
			
			// Close database connection
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

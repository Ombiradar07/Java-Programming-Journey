package com.ims.model;

import java.sql.*;

public class DAOServiceImpl implements DAOService{
	Connection con =null;	
	private Statement stmt = null;

	public void connectDB() {
		try {
			
			//Create JDBC connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims","root","osm2024");
			stmt = con.createStatement();	
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

// User Authentication
	public boolean verifyLogin(String email, String password) {
		try {
		ResultSet res = stmt.executeQuery("Select * from login where email= '"+email+"'and password = '"+password+"'");
		return res.next();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
// Adding new  Enquiries to DBMS
	public void addEnquiry(String name, String email, String mobile, String course) {
	
		try {
			stmt.executeUpdate("insert into Students values ('"+name+"','"+email+"','"+mobile+"','"+course+"')");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// Getting  Enquires from DBMS
	public ResultSet getEnquiries() {
		try {
			ResultSet res = stmt.executeQuery("Select * from students");
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
			return null;
		}

// Deleting Enquiries from DBMS
	public void deleteEnquiry(String email) {
		
		
	}

// Updating Enquiries in DBMS
	public void updateEnquiry(String email, String mobile) {
		
		
	}


// Closing the DBMS Connection
		public void closeDB() {
		
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	
}

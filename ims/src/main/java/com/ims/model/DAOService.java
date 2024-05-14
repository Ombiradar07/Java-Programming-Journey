package com.ims.model;

import java.sql.ResultSet;

public interface DAOService {
	
	public void connectDB();
	public boolean verifyLogin(String email,String password);
	public void addEnquiry(String name,String email,String mobile,String course);
	public ResultSet getEnquiries();
	public void deleteEnquiry(String email);
	public void updateEnquiry(String email,String mobile);
	public void closeDB();
	

}

package com.ims.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ims.model.DAOServiceImpl;


@WebServlet("/getEnquiries")
public class listEnquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public listEnquiryController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		ResultSet result = service.getEnquiries();
		request.setAttribute("res", result);
		RequestDispatcher rd = request.getRequestDispatcher("listEnquiries.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

package com.ims.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ims.model.DAOServiceImpl;

@WebServlet("/addEnquiry")
public class AddEnquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AddEnquiryController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/AddEnquiry.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String course = request.getParameter("course");	
		
		
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		service.addEnquiry(name, email, mobile, course);
		request.setAttribute("msg", "Enquiry Register Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/AddEnquiry.jsp");
		rd.forward(request, response);
		
	}

}

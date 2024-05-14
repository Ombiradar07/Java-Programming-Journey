package com.mvc_architecture.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc_architecture.model.Addition;

@WebServlet("/additionController")
public class AdditionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AdditionController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		Addition add = new Addition();
		int result = add.addNumbers(num1, num2);
		
		request.setAttribute("res", result);
		RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
		rd.forward(request, response);
		
	}

}

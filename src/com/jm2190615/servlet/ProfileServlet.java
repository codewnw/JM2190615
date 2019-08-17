package com.jm2190615.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In doPost method of ProfileServlet");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		String country = request.getParameter("country");
		String query = request.getParameter("query");
		String[] courses = request.getParameterValues("courses");

		
		PrintWriter out = response.getWriter();
		out.print("<table border=\"2px\">\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Name</td>\r\n" + 
				"			<td>"+name+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Age</td>\r\n" + 
				"			<td>"+age+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Password</td>\r\n" + 
				"			<td>"+password+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Email</td>\r\n" + 
				"			<td>"+email+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"	</table>");
		
	}

}

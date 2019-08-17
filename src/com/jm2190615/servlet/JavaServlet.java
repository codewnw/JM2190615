package com.jm2190615.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/java-enrollment" }, initParams = { @WebInitParam(name = "trainerName", value = "Atul"),
		@WebInitParam(name = "trainerMobile", value = "9876543210") })
public class JavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JavaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");

		ServletConfig config = getServletConfig();
		String trnName = config.getInitParameter("trainerName");
		String trnMobile = config.getInitParameter("trainerMobile");

		ServletContext context = config.getServletContext();
		String institute = context.getInitParameter("institute");

		PrintWriter out = response.getWriter();
		out.print(String.format("Hi, %s\nYour trainer is %s and his mobile number is %s.\nIn the %s institute.", name,
				trnName, trnMobile, institute));
	}

}

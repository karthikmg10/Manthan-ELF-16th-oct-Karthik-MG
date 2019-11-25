package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//GET THE QUERY STRING
		
		String empIdval = req.getParameter("empId");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=\"#dbffe0\">");
		out.print("<font color=\"PaleVioletRed \">");
		out.println("<body>");
		out.println("<h2> Employee Details for Emp Id " + empIdval + "</h2>");
		out.println("Name = Lokesh<br>");
		out.println("Salary = 48000<br>");
		out.println("Designation = Software Dev");
		out.print("</font>");
		out.println("</body>");
		out.println("</html>");
		
		
	}// end of doGet

} //end of class

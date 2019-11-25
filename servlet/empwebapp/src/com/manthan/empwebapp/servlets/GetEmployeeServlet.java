package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String code = context.getInitParameter("countrycode");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=\"#dbffe0\">");
		out.print("<font color=\"PaleVioletRed \">");
		out.println("<body>");
		out.println("<h2> Employee Details-</h2>");
		out.println("Employee Id = 101<br>");
		out.println("Employee Name = Karthik<br>");
		out.println("Employee salary = 45000<br>");
		out.println("<br>country code: " + code);
		out.print("</font>");
		out.println("</body>");
		out.println("</html>");
		
		
	} //End of class
	

}// End of main

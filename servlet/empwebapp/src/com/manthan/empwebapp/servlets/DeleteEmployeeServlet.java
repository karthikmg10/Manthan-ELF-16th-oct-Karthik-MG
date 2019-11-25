package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImp1Manager;

@WebServlet("/delete")
public class DeleteEmployeeServlet extends HttpServlet {
	EmployeeDAO dao = EmployeeDAOImp1Manager.getDaoInstance();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		HttpSession session = req.getSession(false);
		if (session != null) {
			
			int empIdval = Integer.parseInt(req.getParameter("empId"));
			
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empIdval);
			
			if(dao.DeleteEmployee(empIdval))
			{
				out.print("<h2> Record Deleted Sucessfully....</h2>");
			} else {

				out.print("<h2> Record Failed to Delete....</h2>");
			}
			} else {

				out.println("<h2> Please Login First</h2>");
				req.getRequestDispatcher("./loginForm.html").include(req, resp);
				
			}
		out.println("<a href='./logout'>Logout</a>");
		out.print("</html>");
		out.print("</body>");
	}

	
	

}

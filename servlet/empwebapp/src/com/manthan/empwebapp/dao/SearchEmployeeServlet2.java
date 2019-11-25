package com.manthan.empwebapp.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.util.EmployeeDAOImp1Manager;

@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2 extends HttpServlet {

	private EmployeeDAO dao = EmployeeDAOImp1Manager.getDaoInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		int empIdval = Integer.parseInt(req.getParameter("empId"));

		EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empIdval);
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");

		if (employeeInfoBean != null) {
			out.print("<h2> Employee ID " + empIdval + "Found-</h2>");
			out.print("Employee Name = " + employeeInfoBean.getEmpName());
			out.print("<br>Age = " + employeeInfoBean.getAge());
			out.print("<br>Salary =" + employeeInfoBean.getSalary());
		} else {
			out.print("<h2 style='color:blue;'>Employee ID " + empIdval + " Not Found</h2>");
		}
		out.println("<a href='./logout'>Logout</a>");
		out.print("</body>");
		out.print("</html>");
	}

}

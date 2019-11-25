package com.manthan.empwebapp.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.util.EmployeeDAOImp1Manager;

@WebServlet("/addEmployee")
public class Addemployeeservlet extends HttpServlet {

	EmployeeDAO dao = EmployeeDAOImp1Manager.getDaoInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");

		HttpSession session = req.getSession(false);
		if (session != null) {
			EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean");

			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			long mobile = Long.parseLong(req.getParameter("mobile"));
			String designation = req.getParameter("designation");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(empName);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setMobile(mobile);
			employeeInfoBean.setDesignation(designation);

			out.print("<html>");
			out.print("<body>");

			if (dao.addEmployee(employeeInfoBean)) {
				out.print("<h2> Record Inserted Sucessfully....</h2>");
				out.print("<h3> Thanks " + bean.getEmpName() + "to add Record");
			} else {

				out.print("<h2> Record Failed to Insert....</h2>");
			}
		} else {

			out.println("<h2> Please Login First</h2>");

		}
		out.println("<a href='./logout'>Logout</a><br>");
		out.print("</html>");
		out.print("</body>");
	}

}

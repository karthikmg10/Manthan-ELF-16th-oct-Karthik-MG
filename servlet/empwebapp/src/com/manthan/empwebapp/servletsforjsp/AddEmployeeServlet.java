package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImp1;

@WebServlet("/addEmp")
public class AddEmployeeServlet extends HttpServlet {
	
	private EmployeeDAO dao = new EmployeeDAOImp1();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session !=null) {
			EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("employeeinfobean");
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
			
			if(dao.addEmployee(employeeInfoBean)) {
				req.setAttribute("msg", "Employee Added Successfully");
			} else {
				req.setAttribute("msg", "Failed to insert Employee Record");
			}
			req.getRequestDispatcher("./addEmployeeForm").forward(req, resp);
			
		} else {
			req.setAttribute("msg", "Please Login First!!!");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	}
}

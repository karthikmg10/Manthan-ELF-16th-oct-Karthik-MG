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
import com.manthan.empwebapp.util.EmployeeDAOImp1Manager;


@WebServlet("/deleteEmp")
public class DeleteEmployeeServlet extends HttpServlet {

	private EmployeeDAO dao = new EmployeeDAOImp1();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if (session !=null) {
			
			EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("employeeinfobean");
			
			int empId = Integer.parseInt(req.getParameter("empId"));

			EmployeeDAO dao= EmployeeDAOImp1Manager.getDaoInstance();
			employeeInfoBean.setEmpId(empId);

			if(dao.DeleteEmployee(empId))
			{
				req.setAttribute("msg", "Employee Deleted Successfully");
			} else {

				req.setAttribute("msg", "Failed to Delete Employee Record");
			}
			req.getRequestDispatcher("./deleteEmployeeForm").forward(req, resp);
		} else {
			req.setAttribute("msg", "Please Login First!!!");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	}
}


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

@WebServlet("/searchEmp")
public class SearchEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session !=null) {
			int empId = Integer.parseInt(req.getParameter("empId"));
			EmployeeDAO dao = new EmployeeDAOImp1();
			EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);
			
			if (employeeInfoBean != null) {
				req.setAttribute("searchedEmployee", employeeInfoBean);
			} else {
				req.setAttribute("msg", "Employee ID Not Found");
			}
			
			req.getRequestDispatcher("./searchEmployeeForm").forward(req, resp);
			
		} else {
			req.setAttribute("msg", "Please Login First!!!");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	}

}

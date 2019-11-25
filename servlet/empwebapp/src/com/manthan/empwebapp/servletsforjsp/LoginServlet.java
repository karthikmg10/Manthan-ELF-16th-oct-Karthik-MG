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
import com.manthan.empwebapp.util.EmployeeDAOImp1Manager;


public class LoginServlet extends HttpServlet {
	
	EmployeeDAO dao = EmployeeDAOImp1Manager.getDaoInstance();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");
		
		EmployeeInfoBean employeeInfoBean =  dao.authentication(empId, password);
		
		if(employeeInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("Bean", employeeInfoBean);
			req.getRequestDispatcher("./jsp/homepage.jsp").forward(req, resp);
			
		} else {
			req.setAttribute("msg", "Invalid Credentials!!!");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	}
}
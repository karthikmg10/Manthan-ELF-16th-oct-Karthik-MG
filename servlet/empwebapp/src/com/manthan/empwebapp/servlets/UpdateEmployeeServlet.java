package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImp1Manager;

@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet {
	EmployeeDAO dao = EmployeeDAOImp1Manager.getDaoInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");

		HttpSession session = req.getSession(false);
		if (session != null) {

			int empIdval = Integer.parseInt(req.getParameter("empId"));
			long mobile = Long.parseLong(req.getParameter("mobile"));

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empIdval);
			employeeInfoBean.setMobile(mobile);

			if (dao.UpdateEmployee(employeeInfoBean)) {
				out.print("<h2> Record Updated Sucessfully....</h2>");
			} else {

				out.print("<h2> Record Failed to Update....</h2>");
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

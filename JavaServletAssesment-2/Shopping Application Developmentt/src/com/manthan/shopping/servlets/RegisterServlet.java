package com.manthan.shopping.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.manthan.shopping.dao.ShoppingDao;
import com.manthan.shopping.dao.ShoppingDaoImpl;
import com.manthan.shopping.userbean.UserBean;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {

			ShoppingDao dao=new ShoppingDaoImpl();
			UserBean bean=(UserBean) session.getAttribute("userBean");

			int ID=Integer.parseInt(req.getParameter("UserID"));
			String name=req.getParameter("Username");
			String Email=req.getParameter("Email");
			String Password=req.getParameter("password");

			UserBean userbean=new UserBean();

			userbean.setUserID(ID);
			userbean.setUsername(name);
			userbean.setEmail(Email);
			userbean.setPassword(Password);

			if(dao.register(userbean)) {
				req.setAttribute("msg", "Registered successfully");
			}
			else {
				req.setAttribute("msg", "Failed to register");
			}
			req.getRequestDispatcher("./register").forward(req, resp);

		}
		else {
			req.setAttribute("msg", "Please login again");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}
}



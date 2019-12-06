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


@WebServlet("/loginForm")
public class LoginServlet extends HttpServlet {

	ShoppingDao dao=new ShoppingDaoImpl();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Email=req.getParameter("Email");
		String password=req.getParameter("password");

		UserBean userBean=dao.authenticate(Email, password);
		if(userBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("userBean", userBean);
			req.getRequestDispatcher("./search").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Invalid credentials!!");
			req.getRequestDispatcher("/loginForm").forward(req, resp);
		}
	}


}

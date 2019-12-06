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
import com.manthan.shopping.productbean.ProductBean;

@WebServlet("/order")
public class OrderProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int ProductID=Integer.parseInt(req.getParameter("ProductID"));
			ShoppingDao dao=new ShoppingDaoImpl();
			ProductBean bean=dao.searchProduct(ProductID);

			if(bean !=null) {
				req.setAttribute("OrderProduct", bean);
			}
			else {
				req.setAttribute("msg", "Product Id not found ");
			}
			req.getRequestDispatcher("./Order.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Please login first!");
			req.getRequestDispatcher("./Login.jsp").forward(req, resp);
		}
	}
}



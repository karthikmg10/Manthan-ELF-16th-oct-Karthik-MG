package com.manthan.shopping.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.shopping.orderbean.OrderBean;
import com.manthan.shopping.productbean.ProductBean;
import com.manthan.shopping.userbean.UserBean;

public class ShoppingDaoImpl implements ShoppingDao {

	@Override
	public boolean register(UserBean userbean) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean registered = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info_db", "root", "root");
			String sql = "insert into user_info values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, userbean.getUserID());
			pstmt.setString(2, userbean.getUsername());
			pstmt.setString(3, userbean.getEmail());
			pstmt.setString(4, userbean.getPassword());

			int n = pstmt.executeUpdate();

			if (n > 0) {
				registered = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return registered;
	}

	@Override
	public UserBean authenticate(String Email, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		UserBean userbean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/filpkart", "root", "root");
			String sql="select * from user_info where Email=? and Password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, Email);
			pstmt.setString(2, password);

			rs=pstmt.executeQuery();
			if(rs.next()) {
				userbean=new UserBean();
				userbean.setEmail(rs.getString("Email"));
				userbean.setPassword(rs.getString("password"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		return userbean;
	}

	@Override
	public ProductBean searchProduct(int productID) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProductBean infoBean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/filpkart\", \"root\", \"root");
			String sql = "select * from employee_info where emp_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, productID);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				infoBean = new ProductBean();
				infoBean.setProductID(rs.getInt("ProductID"));
				infoBean.setProductName(rs.getString("ProductName"));
				infoBean.setProductCost(rs.getInt("ProductCost"));
				infoBean.setProductColor(rs.getString("ProductColor"));
				infoBean.setDescription(rs.getString("Description"));
				infoBean.setNumberofProducts(rs.getInt("NumberofProducts"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return infoBean;

	}
	

	@Override
	public OrderBean orderProduct(int productID) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			OrderBean infoBean = null;

			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/filpkart\", \"root\", \"root");
				String sql = "select * from employee_info where emp_id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, productID);
				rs = pstmt.executeQuery();

				if (rs.next()) {
					infoBean = new OrderBean ();
					infoBean.setProductID(rs.getInt("ProductID"));
					infoBean.setOrderID(rs.getInt("OrderID"));
					infoBean.setUserID(rs.getInt("UserID"));
					infoBean.setPrice(rs.getInt("Price"));
				}
					

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if (pstmt != null) {
						pstmt.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if (con != null) {
						con.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return infoBean;
	
	}

}



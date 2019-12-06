package com.manthan.shopping.dao;

import com.manthan.shopping.orderbean.OrderBean;
import com.manthan.shopping.productbean.ProductBean;
import com.manthan.shopping.userbean.UserBean;

public interface ShoppingDao {

	public boolean register(UserBean userbean);

	public UserBean authenticate(String Email, String password);

	public ProductBean searchProduct(int productID);

	public OrderBean orderProduct(int productID);
	
	

}

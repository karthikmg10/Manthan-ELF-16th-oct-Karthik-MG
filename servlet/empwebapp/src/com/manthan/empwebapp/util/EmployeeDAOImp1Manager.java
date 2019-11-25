package com.manthan.empwebapp.util;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImp1;

public class EmployeeDAOImp1Manager {
	
	private EmployeeDAOImp1Manager() {
		
	}
	
	public static EmployeeDAO getDaoInstance() {
		return new EmployeeDAOImp1();
	}

}

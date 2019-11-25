package com.manthan.empwebapp.dao;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean authentication(int empId,String password);
	
	public boolean DeleteEmployee(int empId);
	
	public boolean UpdateEmployee(EmployeeInfoBean employeeInfoBean);
	
	public EmployeeInfoBean searchEmployee(int empId);
	
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);

}//End of DAO


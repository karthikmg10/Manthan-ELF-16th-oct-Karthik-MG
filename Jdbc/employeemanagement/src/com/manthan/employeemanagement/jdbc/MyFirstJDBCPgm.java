package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCPgm {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try 
		{
			//1.Load the Driver

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// second way
			// class.forname("com.mysql.jdbc.driver");

			//2.Get the connection via driver

			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");

			//3.Issue SQL query

			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee_info");


			//4.Process the result

			while (rs.next())
			{
				int empId = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				String designation = rs.getString("designation");
				long mobile = rs.getLong("mobile");

				System.out.println("EMP_ID =            	" + empId);
				System.out.println("EMP_Name =          	"+ name);
				System.out.println("Age =           	"+ age);
				System.out.println("Salary =        	"+ salary);
				System.out.println("mobile =        	"+ mobile);
				System.out.println("designation =   	"+ designation);
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			}

		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}

		finally {

			//5.Close all JDBC objects
			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
			if(stmt!=null)
			{
				try
				{
					stmt.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
			if (con!=null)
			{
				try
				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}





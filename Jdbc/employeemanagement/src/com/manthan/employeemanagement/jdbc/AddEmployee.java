package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Emp_Id :");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Emp_Name: ");
		String name = sc.next();

		System.out.println("Enter Emp_age: ");
		int age = sc.nextInt();

		System.out.println("Enter Emp_salary: ");
		double salary = sc.nextDouble();

		System.out.println("Enter Emp_Designation: ");
		String designation = sc.next();

		System.out.println("Enter Emp_Mobile: ");
		long mobile = sc.nextLong();

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dburl, "root","root");

			String query = "insert into employee_info values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setDouble(4, salary);
			pstmt.setString(5, designation);
			pstmt.setLong(6, mobile);

			int n = pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Employee Added Successfully");
			}
			else
			{
				System.out.println("Failed To Add");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		finally {

			//5.Close all JDBC objects

			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
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


	}// End of main()

}// End of class

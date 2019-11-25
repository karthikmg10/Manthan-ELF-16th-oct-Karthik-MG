package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Emp_Id :");
		int empId = sc.nextInt();
		sc.nextLine();

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dburl, "root","root");

			String query = "delete from employee_info where emp_id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);

			int n = pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Employee Deleted Successfully");
			}
			else
			{
				System.out.println("Failed To Delete");
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

	
	



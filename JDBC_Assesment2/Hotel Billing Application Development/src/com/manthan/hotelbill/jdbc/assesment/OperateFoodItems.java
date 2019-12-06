package com.manthan.hotelbill.jdbc.assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OperateFoodItems {

	public void addFoodItem() {
		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter item_code :");
		int item_code = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Food_Name: ");
		String Food_Name = sc.next();


		System.out.println("Enter Price: ");
		double Price = sc.nextDouble();


		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl, "root","root");

			String query = "insert into hotel_bill values(?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, item_code);
			pstmt.setString(2, Food_Name);
			pstmt.setDouble(3, Price);

			int n = pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Food Added Successfully");
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
	}
	public void removeFoodItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item_code");
		int item_code=sc.nextInt();

		Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/hotel_db";
			String sql="delete from hotel_bill where Item_code=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, item_code);
			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("Food Removed successfully");
			}
			else {
				System.out.println("Not successful");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			try {
				if(pstmt!=null) {
					pstmt.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
			try {
				if(con!=null) {
					con.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}

		}
	}
	public void modifyFood() {


		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Food_Name :");
		String Food_Name = sc.next();

		System.out.println("Enter Item_code :");
		int Item_code = sc.nextInt();

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/hotel_db";
			con = DriverManager.getConnection(dburl, "root","root");

			String query = "update hotel_bill set Food_Name = ? where Item_code = ?";

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, Food_Name);
			pstmt.setInt(2, Item_code);

			int n = pstmt.executeUpdate();

			if(n>0)
			{
				System.out.println("Food Modified Successfully");
			}
			else
			{
				System.out.println("Failed To Update");
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
	}
}




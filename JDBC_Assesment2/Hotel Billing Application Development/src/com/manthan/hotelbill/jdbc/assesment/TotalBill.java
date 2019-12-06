package com.manthan.hotelbill.jdbc.assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TotalBill {
	@SuppressWarnings("null")
	public void Totalbill(){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/hotel_db";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			rs=pstmt.executeQuery("select sum(price) from hotel_bill");


			if(rs.next()) {
				
				System.out.println("Toatal bill for the day :"+rs.getDouble("sum(price)"));
			}else {
				System.out.println("data not found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		} 
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
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

}


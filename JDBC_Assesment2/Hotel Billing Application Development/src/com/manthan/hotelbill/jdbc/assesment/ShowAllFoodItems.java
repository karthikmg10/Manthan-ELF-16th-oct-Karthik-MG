package com.manthan.hotelbill.jdbc.assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowAllFoodItems {
	public void showallFood() {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from hotel_bill");

			while(rs.next()) {
				int item_code=rs.getInt("Item_code");
				String Food_Name=rs.getString("Food_Name");
				double Price=rs.getDouble("Price");


				System.out.println("Item_code "+item_code);
				System.out.println("Food_Name "+Food_Name);
				System.out.println("Price : "+Price);
				System.out.println("-------------");


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
				if(stmt!=null) {
					stmt.close();
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

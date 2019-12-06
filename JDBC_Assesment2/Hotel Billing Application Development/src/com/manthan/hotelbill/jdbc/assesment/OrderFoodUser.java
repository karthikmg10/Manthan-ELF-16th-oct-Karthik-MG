package com.manthan.hotelbill.jdbc.assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.manthan.hotelbill.jdbc.assesment.bean.FoodBean;

public class OrderFoodUser {
	public void FoodOrder() {

		FoodBean b = new FoodBean();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		ShowAllFoodItems s =new ShowAllFoodItems();
		s.showallFood();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/hotel_db";
			con= DriverManager.getConnection(dbUrl, "root", "root");


			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The total number of orders");
			int s1=sc.nextInt();
			int arr[]=new int[s1];
			for(int i=0;i<s1;i++) {
				arr[s1]=sc.nextInt();
			}
			for(int i=0;i<s1;i++) {
				String sql="select * from hotel_bill where Item_code=?";
				pstmt=con.prepareStatement(sql,1,arr[s1]);
				rs=pstmt.executeQuery();

				if(rs.next()){
					System.out.println("Item_code" + rs.getInt("item_code"));
					System.out.println("Food_Name" + rs.getString("Food_Name"));
					System.out.println("Price" + rs.getDouble("Price"));
				}
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


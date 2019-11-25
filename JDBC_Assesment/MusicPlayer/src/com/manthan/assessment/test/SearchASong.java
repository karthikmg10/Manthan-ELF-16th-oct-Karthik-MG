package com.manthan.assessment.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchASong {
	public void searchASong() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		System.out.println("enter song name");
		Scanner scan=new Scanner(System.in);
		String song=scan.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/MusicPlayer";
			String sql="select * from MusicFiles where Song_Title=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, song);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int songID=rs.getInt("Song_ID");
				String  title=rs.getString("Song_Title");
				String artName=rs.getString("Artist_Name");
				String albName=rs.getString("Album_Name");
				String location=rs.getString("Song_Location");
				String description=rs.getString("Description");

				System.out.println("The song is :"+title);
				System.out.println("Song_Id :"+songID);

				System.out.println("artist :"+artName);
				System.out.println("album :"+albName);
				System.out.println("location :"+location);
				System.out.println("description :"+description);

				System.out.println("-------------");


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

	}}
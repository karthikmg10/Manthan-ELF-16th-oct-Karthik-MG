package com.manthan.assessment.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowAll {
	public void showAllSongs() {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from MusicFiles");

			while(rs.next()) {
				int songID=rs.getInt("Song_ID");
				String  title=rs.getString("Song_Title");
				String artName=rs.getString("Artist_Name");
				String albName=rs.getString("Album_Name");
				String location=rs.getString("Song_Location");
				String description=rs.getString("Description");

				System.out.println("Playing song "+title);
				System.out.println("Song_Id "+songID);

				System.out.println("artist : "+artName);
				System.out.println("album : "+albName);
				System.out.println("location : "+location);
				System.out.println("description : "+description);

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


package com.manthan.assessment.test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import java.util.Scanner;
import java.util.concurrent.Delayed;



public class PlayASong extends Thread{

	public void playAllSongs() {
		Thread t=new PlayASong();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
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

				System.out.println("Age "+artName);
				System.out.println("Salary "+albName);
				System.out.println("mobile "+location);
				System.out.println("dsignation "+description);

				System.out.println("-------------");
				t.sleep(1000);

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

	public void playRandom() {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			stmt=con.createStatement();

			rs=stmt.executeQuery("select * from MusicFiles order by ");

			while(rs.next()) {
				int songID=rs.getInt("Song_ID");
				String  title=rs.getString("Song_Title");
				String artName=rs.getString("Artist_Name");
				String albName=rs.getString("Album_Name");
				String location=rs.getString("Song_Location");
				String description=rs.getString("Description");

				System.out.println("Playing song "+title);
				System.out.println("Song_Id "+songID);

				System.out.println("Artist name"+artName);
				System.out.println("Album name "+albName);
				System.out.println("Location "+location);
				System.out.println("Description "+description);

				System.out.println("-------------");
				wait(2000);

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
	public void playParticular() {

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

				System.out.println("Playing song "+title);
				System.out.println("Song_Id "+songID);

				System.out.println("artist "+artName);
				System.out.println("album "+albName);
				System.out.println("location "+location);
				System.out.println("description "+description);

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
	}
}

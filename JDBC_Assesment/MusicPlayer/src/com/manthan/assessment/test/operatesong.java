package com.manthan.assessment.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class operatesong {
	public void addASong() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Song_Id");
		int song_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Song title");
		String title=sc.next();

		System.out.println("Artist name ");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Album name ");
		String albname=sc.nextLine();

		System.out.println("Enter song location ");
		String loc=sc.nextLine();

		System.out.println("Enter description");
		String des=sc.nextLine();

		java.sql.Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/MusicPlayer";
			String sql="insert into MusicFiles values(?,?,?,?,?,?)";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, song_id);
			pstmt.setString(2, title);
			pstmt.setString(3, name);
			pstmt.setString(4, albname);
			pstmt.setString(5, loc);
			pstmt.setString(6, des);

			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("Record inserted successfully");
			}
			else {
				System.out.println("Not successful");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
	public void updateSong() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Song_ID");
		int song_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Song title");
		String title=sc.next();

		System.out.println("Artist name ");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Album name ");
		String albname=sc.nextLine();

		System.out.println("Enter song location ");
		String loc=sc.nextLine();

		System.out.println("Enter description");
		String des=sc.nextLine();
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/MusicPlayer";
			String sql="update MusicFiles set Song_title=?,Artist_Name=?, Album_Name=?, Song_Location=?, Description=? where Song_ID=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);


			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3,albname);
			pstmt.setString(4,loc);
			pstmt.setString(5,des);

			pstmt.setInt(6,song_id);

			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("Record updated successfully");
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
	public void deleteSong() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Song Id");
		int song_id=sc.nextInt();

		java.sql.Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/MusicPlayer";
			String sql="delete from MusicFiles where Song_ID=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, song_id);
			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("Record deleted successfully");
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
}

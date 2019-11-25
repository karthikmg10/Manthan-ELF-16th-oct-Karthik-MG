package com.manthan.assessment.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class HomePage {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to play a song");
		System.out.println("press 2 to Search a song");
		System.out.println("press 3 to show all songs");
		System.out.println("press 4 to operate on song");
		int input=sc.nextInt();
		if(input==1) {
			System.out.println("press A to play all songs");
			System.out.println("Press B to play songs randomly");
			System.out.println("press C to play a particular song");

			String ch=sc.next();
			if(ch.equals("A")) {
				PlayASong aSong=new PlayASong();
				aSong.playAllSongs();

			}
			else if(ch.equals("B")) {
				PlayASong aSong=new PlayASong();
				aSong.playRandom();
			}
			else if(ch.equals("C")) {
				PlayASong aSong=new PlayASong();
				aSong.playParticular();
			}
			else {
				System.out.println("enter a valid character!!");
			}
		}
		else if(input==2) {
			SearchASong aSong=new SearchASong();
			aSong.searchASong();
		}
		else if(input==3) {
			ShowAll all=new ShowAll();
			all.showAllSongs();
		}
		else if (input==4) {
			System.out.println("press A to add song to repository");
			System.out.println("Press B to edit a song");
			System.out.println("press C to delete a song");
			String ch=sc.next();
			if(ch.equals("A")) {
				operatesong op=new operatesong();
				op.addASong();
			}
			else if(ch.equals("B")) {
				operatesong op=new operatesong();
				op.updateSong();
			}
			else if(ch.equals("C")) {
				operatesong op=new operatesong();
				op.deleteSong();
			}
			else {
				System.out.println("enter a valid character!!");
			}

		}
		else {
			System.out.println("Invalid output");
		}
	}
}

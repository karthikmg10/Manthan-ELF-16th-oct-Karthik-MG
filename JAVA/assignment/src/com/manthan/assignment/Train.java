package com.manthan.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Train {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Map<Integer,String> m =new HashMap<Integer,String>();

		m.put(101,"Solapur Express");
		m.put(102,"Chennai Express");
		m.put(103,"Mumbai Express");

		Function<Integer, String> in=i -> {
			String name=null;
			for(Integer ii : m.keySet()) {

				if(ii==i) {

					System.out.println(m.get(i));
					name=m.get(i);


				}
			}
			return name;
		};

		Function<String, String>ss=i->{
			for(String ii : m.values()) {

				if(i.equals(i)) {

					System.out.println(i);
					return i;
				}

			}
			return null;
		};


		System.out.println("Enter 1 for name");

		System.out.println("Enter 2 for name");

		int op=s.nextInt();
		s.nextLine();
		if(op==1) {
			System.out.println("Enter the name of train");
			String n=s.nextLine();
			String nn=ss.apply(n);
			if(nn!=null) {
				System.out.println("found train "+nn);
			}else
				System.out.println("train not found");
		}
		else {
			System.out.println("enter the number of train");
			int no=s.nextInt();
			String nn=in.apply(no);
			if(nn!=null) {
				System.out.println("found train "+nn);
			}else
				System.out.println("train not found");
		}
	}



}



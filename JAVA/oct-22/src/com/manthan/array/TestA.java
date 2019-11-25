package com.manthan.array;

public class TestA {

	public static void main(String[] args) {

		int[] a=new int[4];
		a[0]=24;
		a[1]=10;
		a[2]=16;
		a[3]=8;
		
		System.out.println("--------------INT---------------");
		for(int i=0;i<a.length;i++) {

			System.out.println(a[i]);
		}
		
		System.out.println("--------------DOUBLE---------------");



		double[] b=new double[4];
		b[0]=2.4;
		b[1]=1.0;
		b[2]=1.6;
		b[3]=8.5;
		
		for(int i=0;i<b.length;i++) {

			System.out.println(b[i]);	

		}
		
		System.out.println("--------------CHAR---------------");
		
		char[] c=new char[4];
		c[0]='A';
		c[1]='P';
		c[2]='L';
		c[3]='E';
		
		for(int i=0;i<c.length;i++) {

			System.out.println(c[i]);
		}
		
		System.out.println("--------------STRING---------------");


		String[] d=new String[4];
		d[0]="Dimple";
		d[1]="Chinnu";
		d[2]="Raju";
		d[3]="Priya";

		for(int i=0;i<d.length;i++) {

			System.out.println(d[i]);
		}

	}
}

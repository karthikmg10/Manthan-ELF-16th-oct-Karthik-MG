package com.manthan.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Alcount {
	
	public static void main(String[] args) {
		
		ArrayList<Animal> al =new ArrayList<Animal>();
		
		Animal a1=new Dogs();
		Animal a2=new Dogs();
		Animal a3=new Dogs();
		Animal a4=new Dogs();
		Animal a5=new Dogs();
		Animal a6=new Dogs();
		Animal a7=new Dogs();
		Animal a8=new Dogs();
		Animal a9=new Dogs();
		Animal a10=new Lion();
		Animal a11=new Dogs();
		Animal a12=new Dogs();
		Animal a13=new Dogs();
		Animal a14=new Dogs();
		Animal a15=new Dogs();
		Animal a16=new Dogs();
		Animal a17=new Dogs();
		Animal a18=new Dogs();
		Animal a19=new Dogs();
		Animal a20=new Lion();
		
		al.add(a20);
		al.add(a19);
		al.add(a18);
		al.add(a17);
		al.add(a16);
		al.add(a15);
		al.add(a14);
		al.add(a13);
		al.add(a12);
		al.add(a12);
		al.add(a10);
		al.add(a9);
		al.add(a8);
		al.add(a7);
		al.add(a6);
		al.add(a5);
		al.add(a4);
		al.add(a3);
		al.add(a2);
		al.add(a1);
		
		Predicate<Animal> fn = an-> an instanceof Dogs;
		
		List<Animal> bl=al.stream().filter(fn).collect(Collectors.toList());
		
		System.out.println("number of animal "+bl.size());
	}

}

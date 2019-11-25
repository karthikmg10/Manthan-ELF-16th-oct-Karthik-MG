package com.manthan.queue;

import java.util.PriorityQueue;

public class TestA {
	
	public static void main(String[] args) {
		
		PriorityQueue<Double> pq=new PriorityQueue<Double>();
		pq.add(53.6);
		pq.add(36.5);
		pq.add(78.6);
		pq.add(43.5);
		
		for(Double r:pq)
		{
			System.out.println(r);
		}
	}

}

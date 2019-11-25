package com.manthan.assignment;

public class BMI {
	
	double weight;
	double height;
	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	@Override
	public String toString() {
		return "BMI [weight=" + weight + ", height=" + height + "]";
	}
	

}

package com.manthan.hotelbill.jdbc.assesment;

import java.util.Scanner;

import com.manthan.hotelbill.jdbc.assesment.ShowAllFoodItems;
import com.manthan.hotelbill.jdbc.assesment.OperateFoodItems;
import com.manthan.hotelbill.jdbc.assesment.OrderFoodUser;
import com.manthan.hotelbill.jdbc.assesment.TotalBill;

public class FoodBillHomepage {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to show all food items");
		System.out.println("press 2 to take order from customers");
		System.out.println("press 3 to operate on food items");
		System.out.println("press 4 to total bill of the day");
		int input=0;
		while(input!=-1) {
			input=sc.nextInt();
			switch(input){
			case 1:
				ShowAllFoodItems sh=new ShowAllFoodItems();
				sh.showallFood();
				break;
			case 2:
				OrderFoodUser of=new OrderFoodUser();
				of.FoodOrder();
				break;
			case 3:
				System.out.println("press A to add food item");
				System.out.println("Press B to remove food item");
				System.out.println("press C to modify food item");

				String ch=sc.next();
				if(ch.equals("A")) {
					OperateFoodItems  op=new OperateFoodItems ();
					op.addFoodItem();
				}else if(ch.equals("B")) {
					OperateFoodItems  op=new OperateFoodItems ();
					op.removeFoodItem();
				}else if(ch.equals("C")) {
					OperateFoodItems  op=new OperateFoodItems ();
					op.modifyFood();
				}else {
					System.out.println("enter a valid character!!");
				}
				break;
			case 4:
				TotalBill tb=new TotalBill();
				tb.Totalbill();

			default:
				System.out.println("Invalid output");
				break;
			}
			System.out.println();
			System.out.println("------------------------------------>");
			System.out.println("Press 1 to show all food items");
			System.out.println("press 2 to take order from customers");
			System.out.println("press 3 to operate on food items");
			System.out.println("press 4 to total bill of the day");
		}

	}
}






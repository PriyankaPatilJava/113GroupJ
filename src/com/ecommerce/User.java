package com.ecommerce;

import java.util.Scanner;

public class User {
	
	public static void userOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. User Registration");
		System.out.println("2. User Login");
		System.out.println("3. User view Product item as Sorted Order");
		System.out.println("4. Buy Product");
		System.out.println("5. View Cart");
		System.out.println("6. Purchase the item");
		int input = sc.nextInt();
		System.out.println("Enter your choice");

		switch (input) {

		case 1: 
			AddUser.addUser();
			LogIn.LogInUser();
			Product.main(null);
			break;

		case 2:
			LogIn.LogInUser();
			Product.main(null);
			
			break;

		case 3: {Product.ShowProduct();}
			break;

		case 4:{
			Product.BuyOption();}
			break;

		case 5:{ 
			   LogIn.LogInUser();
			    AddToCart.ViewCart();}
		
			break;

		case 6: 
			break;

		default:
			System.out.println("Wrong input");
			userOption();

		}
	}

}

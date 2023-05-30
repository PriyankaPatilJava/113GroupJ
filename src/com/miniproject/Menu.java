package com.miniproject;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args)
	{
		System.out.println("***User Operation***");
		System.out.println(" ");
		System.out.println("1.User Registraton ");
		System.out.println("2.User Login ");
		System.out.println("3.User view Product item as Sorted Order ");
		System.out.println("4.Buy Product ");
		System.out.println("5.View Cart ");
		System.out.println("6.Purchase the item ");
		System.out.println(" ");
		System.out.println("***Admin Operation***");
		System.out.println(" ");
		System.out.println("7.Add Product item ");
		System.out.println("8.Calculate Bill ");
		System.out.println("9.Display amount to End User");
		System.out.println("10.Check Quantity ");
		System.out.println("11.Check registered user ");
		System.out.println("12.Check the particular user history");
		System.out.println(" ");
		System.out.println("****Guest Operation****");
		System.out.println(" ");
		System.out.println("13.View product item ");
		System.out.println("14.Not purchase item ");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice");
			int n = sc.nextInt();
			switch(n) {
			case 1:	
						System.out.println("Enter the first name: ");
						String firstName=sc.next();
						System.out.println("Enter the last name: ");
						String lastName=sc.next();
						System.out.println("Enter the username: ");	
						String userName=sc.next();
						System.out.println("Enter the password: ");
						String password=sc.next();
						System.out.println("Enter the city: ");
						String city=sc.next();
						System.out.println("Enter the mail id: ");
						String mailID=sc.next();	
						System.out.println("Enter the mobile number: ");
						Long mobileNumber=sc.nextLong();
						break;
			case 2:
						System.out.println("Enter Username => ");
						String username = sc.next();
						System.out.println("Enter Password => ");
						String password1 = sc.next();
						System.out.println("user is successfully logged in..");
						break;
			}
		}
	}

}

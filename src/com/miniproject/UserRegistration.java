package com.miniproject;

import java.util.Scanner;

public class UserRegistration {
	
	public void userRegistration() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String firstName=sc.nextLine();
		System.out.println("Enter the last name: ");
		String lastName=sc.nextLine();
		System.out.println("Enter the username: ");	
		String userName=sc.nextLine();
		System.out.println("Enter the password: ");
		int password=sc.nextInt();
		System.out.println("Enter the city: ");
		String city=sc.nextLine();
		System.out.println("Enter the mail id: ");
		String mailID=sc.nextLine();	
		System.out.println("Enter the mobile number: ");
		Long mobileNumber=sc.nextLong();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

     public static void  main(String[]args) {
    	UserRegistration register=new UserRegistration();
 		register.userRegistration();
 		System.out.println("Registration is completed...");
		
	}

}

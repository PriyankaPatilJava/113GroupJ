package com.ecommerce;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Welcome to Shopping Mart----------");
		System.out.println();
		System.out.println("Please select menu:");
		System.out.println("1.User");
		System.out.println("2.Admin");
		System.out.println("3.Guest");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("Welcome user");
		        User.userOption();
		        
		        break;
		        
		case 2: System.out.println("Welcome Admin");
		        AdminUser.AdminLogin();
		        AdminUser.adminFunctions();
		
		        break;
		        
		        
		case 3:  System.out.println("Hello Guest user, Please select available option from below to proceed");   
				 System.out.println("1. View available stock");
				 System.out.println("2.You can register and login to buy products");
				Menu.usrChoice();
				
				 break;
				 
		 default: System.out.println("Wrong choice entered");	
		 		  System.out.println("Please choose from available (1,2,3)menu only");
		 		  main(null);
		
	    }

	}  

	

     public static  void usrChoice() {
    	 System.out.println("Enter your option:");
    	 Scanner sc=new Scanner(System.in);
	     int option=sc.nextInt();
         if(option==1) {
	   
	     ItemShowOnly.showProduct();
         } else if(option==2) {
        	 
        	 AddUser.addUser();
     		LogIn.LogInUser();
     		Product.main(null);
           }
          else {
	      System.out.println("Wrong choice");
	      System.out.println("Please choose from available (1,2)menu only");
	      usrChoice();
	
      }
	 
     }

}

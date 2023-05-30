package com.ecommerce;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminUser {
	static String username=null;
	
	public static void AdminLogin() {
		PreparedStatement stmt=null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter your admin name:");
			String user = sc.next();
			 stmt = Connections.connect().prepareStatement("select admin name from admin where adminname='"+user+"'");
	        
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				 username = rs.getString(1);
			}
		if(user.equals(username))
		{
			System.out.println("Admin login is Successfull");
		}
		else
		{
			System.out.println("Admin username is incorrect");
			 AdminLogin();
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
	   public static  void adminFunctions() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sub Menu for admin Panel");
			System.out.println("1.Add product item");
			System.out.println("2.Calculate Bill");
			System.out.println("3.Display amount to End User");
			System.out.println("4.Check Quantity");
			System.out.println("5.Check registered user");
			System.out.println("6. Check the particular user history");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				Product.ShowProduct();
				System.out.println("Enter product id which you want to add");
				int ip = sc.nextInt();
				Product.productdetails(ip);
				break;

			case 2:
				ProductBill.Bill();
				break;
			case 3:
				System.out.println("select product to show amount");
				Product.SelectProduct();
				break;
			case 4:
				System.out.println("select product to show Available Quantity");
				Product.SelectProduct();
				break;
			case 5:
				AddUser.addUser();
				break;
			case 6:
				AddUser.showUser();
				break;

			default:
				System.out.println("Wrong input!");
				adminFunctions();

			}
		}

}

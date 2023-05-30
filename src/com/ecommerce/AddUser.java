package com.ecommerce;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddUser {
	
	public static void main(String[] args) {
		AddUser.addUser();
		LogIn.LogInUser();
	}

	public static void addUser() {

		PreparedStatement stmt = null;

		try {
			stmt = Connections.connect().prepareStatement("insert into users values(?,?,?,?,?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter the First Name");
			String firstname = sc.next();
			stmt.setString(1, firstname);
			System.out.println("please enter the Last Name");
			String lastname = sc.next();
			stmt.setString(2, lastname);
			System.out.println("please enter the User Name");
			String username = sc.next();
			stmt.setString(3, username);
			System.out.println("please enter the Password");
			String password = sc.next();
			stmt.setString(4, password);
			System.out.println("please enter the City");
			String city = sc.next();
			stmt.setString(5, city);
			System.out.println("please enter the Mail ID");
			String mailid = sc.next();
			stmt.setString(6, mailid);
			System.out.println("please enter the Mobile Number");
			String mobilenumber = sc.next();
			stmt.setString(7, mobilenumber);
			int i = stmt.executeUpdate();
			System.out.println("<<<User register sucsessfully>>>");
			System.out.println("Please Login To continue");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			Connections.connect().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void showUser() {
		PreparedStatement stmt = null;
		try {
			stmt = Connections.connect().prepareStatement("select * from users");
			ResultSet Alluser = stmt.executeQuery();
		 System.out.println(" Product");
		 while(Alluser.next())
		 {
			 
			 System.out.println("user name="+Alluser.getString(1)+" ");
		 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

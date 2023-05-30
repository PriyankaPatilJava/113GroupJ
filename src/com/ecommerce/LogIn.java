package com.ecommerce;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LogIn {
	public static String Username;
	static String Password=null;
	static String User=null;
	static PreparedStatement stmt=null;
	static String passs=null;
	public static void main(String[] args) {
		LogIn.LogInUser();
	}
	
	public static void LogInUser() {    
		
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("please entre your username ");
			String user = sc.next();
			stmt = Connections.connect().prepareStatement("select  username from users where username='"+user+"'");
             User=user;
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				String username = rs.getString(1);
				
				Username=username;
				
			}
			LogIn.UserNameValidation();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void UserNameValidation()
	{
		
		if(Username!=null)
		{
		LogIn.Password();
		}
		else
		{
			System.out.println(" username id not registered");
		LogIn.main(null);
		}
		
	}
	public static void Password()
	{try {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your Password ");
		String pass = sc.next();
		
		passs=pass;
		stmt = Connections.connect().prepareStatement("select password from users where username='"+User+"'");
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			String password = rs.getString(1);
			
			
			Password=password;
			
		}
		LogIn.PasswordValidation();

	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	public static void PasswordValidation()
	{
		
		if(Password.equals(passs)) {
			System.out.println("PassWord is  "+Password);
			System.out.println("<<< login succesfull>>>");
		}
		else
		{
			System.out.println(" Password is incorrect please try again");
		
			Password();		
			}
		
	}

}

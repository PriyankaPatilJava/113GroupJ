package com.ecommerce;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddToCart {
	
	static String username;
	static String name;
	public static void GetUserNameAndProduct() {
		username=LogIn.Username;
		name=Product.ProctName;
	}
	
	public static void addtocart(){
		GetUserNameAndProduct();

		PreparedStatement stmt = null;

		try {
			stmt = Connections.connect().prepareStatement("insert into cart(username,cart) values('"+username+"','"+name+"')");
			stmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	public static void ViewCart() 
	{
		GetUserNameAndProduct();		
		PreparedStatement stmt = null;
              int count=1;
		try {
			stmt = Connections.connect().prepareStatement("select distinct cart from cart where username='"+username+"'");
			ResultSet GetCart = stmt.executeQuery();
			while(GetCart.next())
			{
				System.out.println("Cart product  "+"" + count + "  "+ GetCart.getString(1));
				count++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
		

}

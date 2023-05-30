package com.ecommerce;

import java.sql.Connection;

public class ItemShowOnly {
	private static int input;

	public static void showProduct() {
	
		System.out.println("if you want to buy any product then register yourself first");
		
		Product.ShowProduct();
	}

}

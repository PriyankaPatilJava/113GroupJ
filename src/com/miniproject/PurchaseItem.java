package com.miniproject;

import java.util.HashMap;
import java.util.Scanner;

public class PurchaseItem {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> items = new HashMap<String,Integer>();
		items.put("Laptop",40000);
		items.put("Mobile",20000);
		items.put("Women Cloths" ,1000);
		items.put("Men Cloths", 1500);
		items.put("Kids Cloths",1000);
		items.put("Groceries" , 5000);
		items.put("Handbages",1000);
		items.put("Footware", 1500);
		items.put("Fashion and Beauty",2000);
		items.put("Home Furnishers", 10000);
		
		System.out.println("Username => ");
	}

}

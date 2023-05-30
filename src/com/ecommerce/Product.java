package com.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Product {
	static String ProctName;
	public static void main(String[] args) {
		ShowProduct();
		BuyOption();
	}
	
	public static void productdetails(int Id)
	{PreparedStatement stmt=null;
	PreparedStatement GetProductName=null;
		try {
			GetProductName = Connections.connect().prepareStatement("select name from products where id='"+Id+"'");
			ResultSet ProductName = GetProductName.executeQuery();
			while(ProductName.next())
			{
			String productname = ProductName.getString(1);
			ProctName=productname;
			}
		 stmt = Connections.connect().prepareStatement("select * from products where id='"+Id+"'");
		  
		 ResultSet AllProducts = stmt.executeQuery();
		 System.out.println(" Product Details");
		 while(AllProducts.next())
		 {
			 
			 System.out.println("Product ID="+AllProducts.getString(1)+" ");
				System.out.println("ProductName="+AllProducts.getString(2)+" ");
				System.out.println("ProductDescription="+AllProducts.getString(3)+" ");
				System.out.println("AvailableQuantity="+AllProducts.getString(4)+" ");
				System.out.println("Price="+AllProducts.getString(5)+" ");
				System.out.println();
				System.out.println("  ");
		 }		 
		 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void ShowProduct()
	{PreparedStatement stmt=null;
	int count=1;
		try {
		 stmt = Connections.connect().prepareStatement("select name from products");
		 
		 ResultSet AllProducts = stmt.executeQuery();
		 System.out.println("Available Products");
		 while(AllProducts.next())
		 {
			 
			 
				System.out.println(count+"  "+AllProducts.getString(1)+" ");
				count++;
		 }		 
		 System.out.println("Please enter the product Number ");
		 Product.SelectProduct();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void SelectProduct()
	{Scanner sc=new Scanner(System.in);
	System.out.println("");
		int Number=sc.nextInt();
	switch (Number)
	{
	case 1:{ Product.productdetails(1);}
	break;
	case 2:{ Product.productdetails(2);}
	break;
	case 3:{ Product.productdetails(3);}
	break;
	case 4:{ Product.productdetails(4);}
	break;
	case 5:{ Product.productdetails(5);}
	break;
	case 6:{ Product.productdetails(6);}
	break;
	case 7:{ Product.productdetails(7);}
	break;
	case 8:{ Product.productdetails(8);}
	break;
	case 9:{ Product.productdetails(9);}
	break;
	case 10:{ Product.productdetails(10);}
	break;
	
	default:
	{
		System.out.println("Incorrect Choice");
		SelectProduct();
	}
	}
	}
	public static void BuyOption()

	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1 for BuyProduct");
		System.out.println(" 2 for Go to HomePage");
		System.out.println("Please Choose Number");
			int Number=sc.nextInt();
		switch (Number) 
		{
		case 1:{
			AddToCart.addtocart();
			    System.out.println("*********** Added to cart **********"); 
			    System.out.println("Thanks for Shopping");
			    ShowProduct();
			   }
		break;
		case 2:{
			     
			     ShowProduct();
	           }
		default:
		{
			System.out.println("Incorrect Choice");
			BuyOption();
		}
		}
	}
	public static void productdetailsAll()
	{
		PreparedStatement stmt=null;
		try {
		 stmt = Connections.connect().prepareStatement("select * from productdetails");
		 
		 ResultSet AllProducts = stmt.executeQuery();
		 System.out.println(" Product");
		 while(AllProducts.next())
		 {
			 
			 System.out.println("Product ID="+AllProducts.getString(1)+" ");
				System.out.println("ProductName="+AllProducts.getString(2)+" ");
				System.out.println("ProductDescription="+AllProducts.getString(3)+" ");
				System.out.println("AvailableQuantity="+AllProducts.getString(4)+" ");
				System.out.println("Price="+AllProducts.getString(5)+" ");
				System.out.println();
				System.out.println("             ");
		 }		 
		 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{ 
   	 Connection con = DBUtil.getCon();
		  PreparedStatement pst = null;
		  String query = "insert into product(id, description, name, price, quantity) values(?,?,?,?,?)";	
		  try {
			  pst = con.prepareStatement(query);
			  Scanner sc = new Scanner(System.in);
			  int noofproducts  = sc.nextInt();
			  if(noofproducts > 0) {
			     for(int i=0; i<noofproducts; i++) {
		
			  System.out.println("Please enter Id ");
			  int id = sc.nextInt();
			  System.out.println("Please enter Description ");
			  String description = sc.next();
			  System.out.println("Please enter Name ");
			  String name = sc.next();
			  System.out.println("Please enter Price ");
			  int price = sc.nextInt();
			  System.out.println("Please enter Quantity ");
			  int quantity= sc.nextInt();
			  
			  pst.setInt(1, id);
			  pst.setString(2, description);
			  pst.setString(3, name);
			  pst.setInt(4, price);
			  pst.setInt(5, quantity);
			  
			  int j = pst.executeUpdate(); 
			     }
			  }
			  else {
				  System.out.println("Enter positive values");
			  }
			 }catch(SQLException e) {
			  e.printStackTrace();
	  }
		  con.close();
		  pst.close();
			  				 
		  }
}

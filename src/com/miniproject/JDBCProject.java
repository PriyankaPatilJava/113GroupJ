package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCProject {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/productdb1?characterEncoding=utf8";
			//String user = "root";
			//String password = "root";
			Connection con = DriverManager.getConnection(url,"root","root");
			PreparedStatement pst = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter Id ");
			  int id = sc.nextInt();
			  System.out.println("Please enter Description ");
			  String description = sc.next();
			  System.out.println("Please enter Name ");
			  String name = sc.next();
			  System.out.println("Please enter Price ");
			  float price = sc.nextFloat();
			  System.out.println("Please enter Quantity ");
			  int quantity= sc.nextInt();
			  
			  pst.setInt(1, id);
			  pst.setString(2, description);
			  pst.setString(3, name);
			  pst.setFloat(4, price);
			  pst.setInt(5, quantity);
			   pst.execute(); 
			   
			   pst.close();
			   con.close();
			/*}catch(Exception e) {
				e.printStackTrace();
			}*/
	}

}

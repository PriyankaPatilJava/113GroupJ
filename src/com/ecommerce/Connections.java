package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Connections {
	
	public static Connection connect(){
		Connection con=null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
}
		
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb1","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	

}

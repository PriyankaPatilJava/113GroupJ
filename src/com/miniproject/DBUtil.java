package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	 public static Connection getCon() {
  	   Connection con = null;
  	   try {
  		   Class.forName("com.mysql.jdbc.Driver");
  		   String url = "jdbc:mysql://localhost:3306/productsdb?characterEncoding=utf8";
  		   con = DriverManager.getConnection(url, "root", "root");
  	   }catch (ClassNotFoundException | SQLException e) {
  		   e.printStackTrace();
  	   }
  	   return con;
     }

}

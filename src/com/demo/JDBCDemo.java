package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	  //step 1 : load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password = "root";
		//2: establish connection
		Connection con = DriverManager.getConnection(url,username,password);
		//3 create the statement
		Statement st = con.createStatement();
		// 4 : prepare the sql statement
		String query = "insert into student1 values (13,'ash',26,'1june',9)" ;
		// 5 submit the sql statement
		// 6 process the result
		st.execute(query);
		System.out.println("rows is inserted successfully");
		// 7 : release the resources
		st.close();
		con.close();
	}

}

package com.ex5;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_util {
	
	public Connection getDBConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_060","root","");
					
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	

}

package com;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnects {

	 static Connection con=null;
	 private DBconnects()
	 {
	 }
		 public static Connection getDBconnects()
		 {
			 try
			 {
				 if(con==null)
				 {
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 con=DriverManager.getConnection("jdbc:mysql://localhost/studentdesw","root","");
				 }
				 
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 return con;
		 }
	 }



package com.JavaWebApplications.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDb {
	
	Connection con = null;
	
	public Connection getCon(){
		try {
			Class.forName("com.mysql.jdbc.Driver");	
		}
		catch (ClassNotFoundException e){
			System.out.println("ERROR: can´t find driver " + e.getMessage());
		}
		try {
				//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/desercion","root","root");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/desercion","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}

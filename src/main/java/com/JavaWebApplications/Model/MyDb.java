package com.JavaWebApplications.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDb {
	
	Connection con = null;
	public Connection getCon(){
		try{

				Class.forName("com.mysql.jdbc.Driver");	
				con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/desercion","root","");
				                                   
		}catch (ClassNotFoundException e){
				e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

}

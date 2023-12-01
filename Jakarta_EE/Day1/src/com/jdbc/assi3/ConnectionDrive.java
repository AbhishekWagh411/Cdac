package com.jdbc.assi3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionDrive {

	public static Connection  getcon() {
		
		ResourceBundle rsb = ResourceBundle.getBundle("myproperty");
		String url = rsb.getString("url");
		String user = rsb.getString("user");
		String password = rsb.getString("password");
		Connection con=null;
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}

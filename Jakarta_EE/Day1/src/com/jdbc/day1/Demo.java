package com.jdbc.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Demo {

	public static void main(String[] args) {
		Product p1 = new Product(1, 10, 2026.52, "Abhi");
	Connection con= ConnectionProvider.getCon();
	/*
	try {
		PreparedStatement stmt= con.prepareStatement("insert into product values (?,?,?,?)");
		stmt.setInt(1, p1.getPid());
		stmt.setInt(2, p1.getQty());
		stmt.setDouble(3, p1.getCost());
		stmt.setString(4, p1.getPname());		
		 int i  = stmt.executeUpdate();
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	p1=null;
	System.out.println("========\n"+p1+"\n========");
	try {
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery("select * from product");
		while(rs.next()) {
			int pid=rs.getInt(1);
			int qty=rs.getInt(2);
			double cost=rs.getDouble(3);
			String name=rs.getString(4);
			p1 = new Product(pid, qty, cost, name);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(p1);
	}
}

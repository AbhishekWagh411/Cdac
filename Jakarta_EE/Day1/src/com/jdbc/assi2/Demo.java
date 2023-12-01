package com.jdbc.assi2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Desig");
	String s = sc.nextLine();
	String ss ="jdbc:mysql://localhost:3306/bit";
	try {
		Connection con = DriverManager.getConnection(ss,"root","root");
		PreparedStatement pst= con.prepareStatement("select * from employee where desig=?");
		pst.setString(1, s);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}

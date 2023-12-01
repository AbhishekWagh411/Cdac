package com.jdbc.assi3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.rowset.RowSetProvider;

import com.mysql.cj.jdbc.result.ResultSetFactory;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Enter Details:-");
		Scanner sc = new Scanner(System.in);
		int roll_no =sc.nextInt();
		int age= sc.nextInt();
		String name= sc.next();
		
		Connection con =ConnectionDrive.getcon();
		
		try {
			PreparedStatement psmt = con.prepareStatement("insert into student values(?,?,?)");
			psmt.setInt(1, roll_no);
			psmt.setString(2, name);
			psmt.setInt(3, age);
			int i = psmt.executeUpdate();
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}

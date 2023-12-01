

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private Connection con;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit","root","root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		try {
			
			PreparedStatement pst = con.prepareStatement("insert into Student(name, age , address) values (?,?,?) ");
			pst.setString(1, request.getParameter("name"));
			pst.setInt(2, Integer.parseInt( request.getParameter("age")));
			pst.setString(3, request.getParameter("address"));
			int i =pst.executeUpdate();
			PrintWriter pw = response.getWriter();
			if(i>0)
			pw.println("Data added successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		Statement stmt;
		int roll_no;
		String name ;
		int age ;
		String address;
		PrintWriter pw= response.getWriter();
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Student");
			while(rs.next()) {
				roll_no= rs.getInt(1);
				name = rs.getString(2);
				age = rs.getInt(3);
				address= rs.getString(4);
				pw.println(roll_no+"  "+name+"  "+age+"  "+address);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

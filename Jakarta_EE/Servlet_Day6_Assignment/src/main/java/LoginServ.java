

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * Servlet implementation class LoginServ
 */
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private Connection con;
		
		@Resource(lookup="java:/comp/env/mypool")
		 private DataSource ds;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		try {
			Connection con= ds.getConnection();
			
			PreparedStatement psmt= con.prepareStatement("select * from register where login=? and password=? ");
			psmt.setString(1, request.getParameter("login"));
			psmt.setString(2, request.getParameter("Password"));
			
			ResultSet rs= psmt.executeQuery();
			
			while(rs.next()) {
				pw.println(rs.getInt(1));
				pw.println(rs.getString(2));
				pw.println(rs.getString(3));
				pw.println(rs.getString(4));
				pw.println(rs.getString(5));
				pw.println(rs.getString(6));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

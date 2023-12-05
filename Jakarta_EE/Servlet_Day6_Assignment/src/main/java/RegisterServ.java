

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
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * Servlet implementation class RegisterServ
 */
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	@Resource(lookup="java:/comp/env/mypool")
	 private DataSource ds;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PreparedStatement psmt;
		PrintWriter pw = response.getWriter();
		try {
			con = ds.getConnection();
			psmt= con.prepareStatement("insert into register (Name,Address, Email, login, password) values (?,?,?,?,?)");
			psmt.setString(1, request.getParameter("name"));
			psmt.setString(2, request.getParameter("Address"));
			psmt.setString(3, request.getParameter("email"));
			psmt.setString(4, request.getParameter("login"));
			psmt.setString(5, request.getParameter("password"));
			int i =psmt.executeUpdate();
			if(i>0) {
				pw.println(i+"Register table is Updated");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}

}

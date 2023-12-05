

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
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
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

/**
 * Servlet implementation class DeptServ
 */
public class DeptServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(lookup="java:/comp/env/mypool")
	 private DataSource ds;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con;
		List<String> list = new ArrayList<>(); 
		PrintWriter pw = response.getWriter();
		try {
			con =ds.getConnection();
			PreparedStatement psmt = con.prepareStatement("select dname from dept ");
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
							}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Lname", list);
		RequestDispatcher rd = request.getRequestDispatcher("Dept.jsp");
		rd.forward(request, response);

	}

}

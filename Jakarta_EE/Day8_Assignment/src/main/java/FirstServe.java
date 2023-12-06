

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.tomcat.util.http.fileupload.RequestContext;

/**
 * Servlet implementation class FirstServe
 */
public class FirstServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	@Resource(lookup="java:/comp/env/mypool")
	DataSource ds;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		List<String> list = new ArrayList<>();
		try {
			
			
			con= ds.getConnection();
			PreparedStatement psmt= con.prepareStatement("select pname from product");
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				list.add(rs.getString(1));		
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("lname", list);
		RequestDispatcher rd = request.getRequestDispatcher("Shop.jsp");
		rd.forward(request, response);
		
		
	}

}

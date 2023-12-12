

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.lr.Config;
import com.lr.Register;

/**
 * Servlet implementation class ViewServ
 */
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Session session = Config.getConnection();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Query<Register> query = session.createQuery("from Register");
		List<Register> list= query.list();
		request.setAttribute("mylist", list);
		PrintWriter pw = response.getWriter();
		pw.println("done");
		RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
		rd.forward(request, response);
	}

}

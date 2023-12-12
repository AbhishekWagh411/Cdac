

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lr.Config;
import com.lr.Register;

/**
 * Servlet implementation class RegisterServ
 */
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Session session = Config.getConnection();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated me
		Transaction tr= session.beginTransaction();
		Register register = new Register();
			
		register.setName(request.getParameter("name"));
		register.setAddress(request.getParameter("address"));
		register.setEmail_id(request.getParameter("email"));
		register.setLogin(request.getParameter("login"));
		register.setPassword(request.getParameter("password"));
		
		session.persist(register);
		tr.commit();
		session.close();
		PrintWriter pw = response.getWriter();
		pw.println("done");
	}

}

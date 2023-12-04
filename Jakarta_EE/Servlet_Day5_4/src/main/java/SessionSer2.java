

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SessionSer2
 */
public class SessionSer2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			pw.println(session.getAttribute("book"));
		}

		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}

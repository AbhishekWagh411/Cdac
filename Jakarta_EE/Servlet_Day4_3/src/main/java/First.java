

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig conf;
	public void init(ServletConfig conf)
	{
		this.conf=conf;
		System.out.println("inside init(ServletConfig conf) method");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
		PrintWriter pw=response.getWriter();
		pw.println("Overriding init(ServletConfig conf)");
		/* NullPointerException for following 2 statements*/
		
		pw.println("Config parameter value  "+conf.getInitParameter("user"));
		pw.println("Context parameter value   "+ conf.getServletContext() .getInitParameter("database"));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}

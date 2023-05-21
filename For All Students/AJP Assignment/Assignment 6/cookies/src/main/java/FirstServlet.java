

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
				
			String n=request.getParameter("userName");
			out.print("Welcome "+n);

			Cookie ck=new Cookie("uname",n);//creating cookie object
		       	response.addCookie(ck);//adding cookie in the response

			//creating submit button
			out.print("<form action='servlet2' method='post'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
				
			out.close();

		  }
		catch(Exception e){
			System.out.println(e);
		}
	}

}

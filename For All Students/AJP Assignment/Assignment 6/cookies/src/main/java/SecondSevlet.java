

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondSevlet
 */
@WebServlet("/SecondSevlet")
public class SecondSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SecondSevlet() {
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
			
			Cookie ck[]=request.getCookies();
			out.print("Hello "+ck[0].getValue());

			out.close();

		         }catch(Exception e){System.out.println(e);}
			}
	}


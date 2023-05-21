import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
private static final long serialVersionUID = 1L;
public Welcome() {
super();
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
doGet(request, response);
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
String name=request.getParameter("uname");
pw.print("Hello "+name+"!<br>");
pw.print(" Welcome to this site!");
}
}
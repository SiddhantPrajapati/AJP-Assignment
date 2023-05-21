import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/loginPage")
public class Login extends HttpServlet {
private static final long serialVersionUID = 1L;
public Login() {
super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
//response.getWriter().append("Served at: ").append(request.getContextPath());
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
doGet(request, response);
response.setContentType("text/html");
PrintWriter pwriter = response.getWriter();
String name=request.getParameter("uname");
String pass=request.getParameter("upass");
if(name.equals("Admin") &&pass.equals("root"))
{
RequestDispatcher dis=request.getRequestDispatcher("welcome");
dis.forward(request, response);
}
else
{
pwriter.print("Username or password is incorrect!");
RequestDispatcher dis=request.getRequestDispatcher("index.html");
dis.include(request, response);
}
}
}
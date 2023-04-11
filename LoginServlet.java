import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
   
    private static final long serialVersionUID = 1L;      
   
    public LoginServlet() {
        super();
    }
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
        if (userid != null && emailId.equalsIgnoreCase("manager@gmail.com") && password != null && password.equalsIgnoreCase("manager")) {
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("userid", userid);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    }
}
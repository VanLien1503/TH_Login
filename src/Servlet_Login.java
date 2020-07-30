import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "Servlet_Login",urlPatterns = "/login")
public class Servlet_Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("user_name");
            String password = request.getParameter("pass_word");

            if (username.equals("admin") && password.equals("admin")){
                request.setAttribute("username",username);
                request.setAttribute("LoginTime", new Date());
                // tao doi tuong de chuyen request toi 1 trang jsp moi
                RequestDispatcher dispatcher = request.getRequestDispatcher("/code_gym.jsp");
                // goi doi tuong forward() de chuyen  request toi code_gym.jsp
                dispatcher.forward(request,response);
                // lúc này toàn bộ đối tượng request chứa thông tin từ client và thông tin bổ sung
                // trong servlet chuyển tới trang code_gym.jsp

                // >> tạo file code_gym.jsp để lấy thông tin từ servlets chuyển sang
            }else {
                response.sendRedirect("index.jsp");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package top.zxh.web.servlet;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);

        if (Const.USER_NAME.equals(username) && Const.USER_PASSWORD.equals(password)) {
            response.sendRedirect("/success.html");

        }
        else {
            response.sendRedirect("/fail.html");
        }

    }
}


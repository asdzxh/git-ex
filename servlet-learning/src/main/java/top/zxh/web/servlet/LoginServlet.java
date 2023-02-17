package top.zxh.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain;charset=utf-8");
        String userAgent = request.getHeader("user-agent");
        System.out.printf(userAgent);
        System.out.printf(userAgent);
        PrintWriter writer = response.getWriter();
        if (userAgent.contains("Windows")) {
            writer.write("Windows");
        }else{
            writer.write("安卓端");
        }
    }

}

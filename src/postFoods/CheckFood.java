package postFoods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckFood extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html; charset=Windows-31J");
        PrintWriter out = response.getWriter();
        out.println("<form action=\"送信先\" method=\"post\">");
        out.println("<input type=\"checkbox\" name=\"sports\" value=\"tennis\" />");
        out.println("<input type=\"checkbox\" name=\"sports\" value=\"baseball\" />");
        out.println("<input type=\"checkbox\" name=\"sports\" value=\"football\" />");
        out.println("<input type=\"submit\" value=\"送信\" />");
        out.println("</form>");

    }

}

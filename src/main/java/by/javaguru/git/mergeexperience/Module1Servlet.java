package by.javaguru.git.mergeexperience;

import java.io.*;

import by.javaguru.git.mergeexperience.topics.Module1Topics;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static by.javaguru.git.mergeexperience.topics.Module1Topics.JAKARTA;

@WebServlet("/module1")
public class Module1Servlet extends HttpServlet {
    private String message;
    public void init() {
        message = "Модуль 1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<table>");
        for (Module1Topics value : Module1Topics.values()){
            if(value == JAKARTA){
                out.println("<tr><td>"
                        + value.getOrder() + "</td><td>"
                        + value.getTopic() + "</td><td>"
                        + value.getDesc()
                        + "</td><td><a href=\"MoreDetailedModule1\">Подробнее</a>"
                        + "</td></tr>");
            } else {
                out.println("<tr><td>"
                        + value.getOrder() + "</td><td>"
                        + value.getTopic() + "</td><td>"
                        + value.getDesc()
                        + "</td><td><a href=\"notExists\">Подробнее</a>"
                        + "</td></tr>");
            }

        }
        out.println("</table>");
        out.println("<button><a href=\"module4\"><- </a></button>");
        out.println("<button><a href=\"module2\"> -></a></button>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
package by.javaguru.git.mergeexperience;

import by.javaguru.git.mergeexperience.topics.Module1Topics;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MoreDetailedModule1")
public class MoreDetailedModule1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("Jakarta (ранее известный как Java EE) — это набор спецификаций и технологий \n" +
                "для разработки масштабируемых, распределённых и транзакционных приложений на языке Java.");
        out.println("</body></html>");

    }
}

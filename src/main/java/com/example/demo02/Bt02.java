package com.example.demo02;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bt02", value = "/Bt02")
public class Bt02 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Giải Thích Cấu Trúc Thư Mục" + "</h1>");
        out.println("<p>src/main/java: Chứa mã nguồn Java, bao gồm Servlet, Controller, Class xử lý logic, v.v.</p>");
        out.println("<p>src/main/resources: Chứa các file cấu hình, static resource hoặc template (nếu dùng Spring, Freemarker, Thymeleaf,...)</p>");
        out.println("<p>src/main/webapp: Chứa giao diện web (JSP, HTML, CSS, JS) và thư mục WEB-INF dùng để cấu hình deployment cho ứng dụng</p>");
        out.println("<p>src/main/webapp/index.jsp: Là điểm truy cập đầu tiên (entry point), được trình duyệt hiển thị – ở đây ta để nội dung \"Hello, World!\"</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

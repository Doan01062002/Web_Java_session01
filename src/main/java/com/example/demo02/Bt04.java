package com.example.demo02;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Bt04")
public class Bt04 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>Triển khai Java Web trên Tomcat</title></head><body>");
        out.println("<h1 style='color: green;'>Xin chào từ Servlet!</h1>");
        out.println("<h2>Bạn đã triển khai thành công ứng dụng web Java!</h2>");

        out.println("<h3>Các bước triển khai:</h3>");
        out.println("<ol>");
        out.println("<li>1 Viết Servlet và JSP như bình thường.</li>");
        out.println("<li>2 Đóng gói thành file <code>.war</code> (ví dụ: <code>DemoWebApp.war</code>).</li>");
        out.println("<li>3 Copy file <code>.war</code> vào thư mục <code>Tomcat/webapps/</code>.</li>");
        out.println("<li>4 Khởi động Tomcat bằng <code>startup.bat</code> hoặc từ IDE.</li>");
        out.println("<li>5 Truy cập</li>");
        out.println("</ol>");

        out.println("<h3>Cách khắc phục sự cố nếu có:</h3>");
        out.println("<ul>");
        out.println("<li><b>HTTP 404</b>: Kiểm tra đường dẫn servlet, cấu hình URL và tên WAR đã đúng chưa.</li>");
        out.println("<li><b>HTTP 500</b>: Có thể do lỗi code, xem log trong thư mục <code>Tomcat/logs/</code>.</li>");
        out.println("<li><b>Không hiển thị tiếng Việt</b>: Đảm bảo <code>UTF-8</code> cho cả JSP và Servlet.</li>");
        out.println("<li><b>Tomcat không khởi động</b>: Có thể port bị chiếm → sửa <code>server.xml</code>.</li>");
        out.println("</ul>");

        out.println("</body></html>");
    }
}

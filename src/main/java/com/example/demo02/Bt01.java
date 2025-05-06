package com.example.demo02;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bt01", value = "/Bt01")
public class Bt01 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<img src=\"https://github.com/Doan01062002/Web_Java_session01/blob/main/bt01.png?raw=true\" alt=\"Lights\" style=\"width:100%\">");
        out.println("<p>Client: Trình duyệt web gửi yêu cầu (HTTP Request) đến server và hiển thị nội dung nhận được.</p>");
        out.println("<p>Web Server: Nhận yêu cầu từ client, chuyển tiếp đến Application Server và gửi lại phản hồi.</p>");
        out.println("<p>Application Server: Chứa logic nghiệp vụ (Servlet, JSP, Spring MVC...) xử lý dữ liệu, tương tác DB.</p>");
        out.println("<p>Database: Lưu trữ dữ liệu, cung cấp dữ liệu cho Application Server.</p>");

        out.println("<h3>Mối Quan Hệ Giữa Các Thành Phần</h3>");
        out.println("<p>Khi người dùng thao tác trên trình duyệt (Client), trình duyệt sẽ gửi HTTP request đến Web Server (ví dụ: Apache Tomcat). Web Server sẽ tiếp nhận yêu cầu và chuyển nó đến Application Server, nơi chứa các thành phần như Servlet hoặc Controller xử lý logic nghiệp vụ (ví dụ: đăng nhập, đăng ký khóa học). Nếu cần truy xuất dữ liệu, Application Server sẽ kết nối đến Database thông qua JDBC hoặc ORM (như Hibernate), thực hiện truy vấn SQL, rồi nhận kết quả. Sau đó, kết quả được xử lý và gửi ngược lại cho Client dưới dạng trang HTML, JSON hoặc XML thông qua Web Server.\n" +
                "\n</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
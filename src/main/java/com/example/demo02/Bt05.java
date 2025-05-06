package com.example.demo02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Bt05")
public class Bt05 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            int a = 10;
            int b = 0; //Tạo lỗi chia cho 0
            int c = a / b;

            response.getWriter().println("<h1>Kết quả: " + c + "</h1>");

        } catch (Exception e) {
            // Gửi lỗi sang trang error.jsp
            request.setAttribute("errorMessage", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}

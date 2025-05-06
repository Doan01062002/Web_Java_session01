package com.example.demo02;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bt03", value = "/Bt03")
public class Bt03 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        String name = "Nguyễn Văn A";
        int age = 21;

        // Truyên ữ liệu từ servlet đến JSP
        request.setAttribute("UserName", name);
        request.setAttribute("UserAge", age);

        // Chuyển tiếp đến JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}
package com.example.demo02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Bt06", value = "/Bt06")
public class Bt06 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        handleRegister(request, response);
    }

    private void handleRegister(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Nhận dữ liệu từ form
        String fullName = request.getParameter("fullName");
        String className = request.getParameter("className");
        String vehicleType = request.getParameter("vehicleType");
        String licensePlate = request.getParameter("licensePlate");

        // Kiểm tra đơn giản: nếu đủ thông tin thì thành công
        boolean isValid = fullName != null && className != null && !fullName.isEmpty() && !className.isEmpty();

        // Gửi dữ liệu sang trang JSP
        request.setAttribute("fullName", fullName);
        request.setAttribute("className", className);
        request.setAttribute("vehicleType", vehicleType);
        request.setAttribute("licensePlate", licensePlate);
        request.setAttribute("status", isValid ? "success" : "fail");

        request.getRequestDispatcher("resultRegister.jsp").forward(request, response);
    }
}


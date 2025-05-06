package com.example.demo02;

import com.example.demo02.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentTicketServlet", value = "/StudentTicketServlet")
public class Bt07 extends HttpServlet {
    private List<Student> studentList;

    @Override
    public void init() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Nguyễn Văn A", "10A1", "Xe máy", "59X1-123.45"));
        studentList.add(new Student("Trần Thị B", "11B2", "Xe đạp", "Không có"));
        studentList.add(new Student("Lê Văn C", "12C3", "Xe buýt", "Mã thẻ: 001122"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        request.setAttribute("students", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listStudent.jsp");
        dispatcher.forward(request, response);
    }
}


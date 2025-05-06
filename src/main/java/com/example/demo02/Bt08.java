package com.example.demo02;

import com.example.demo02.model.Task;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TaskServlet")
public class Bt08 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ArrayList<Task> tasks = new ArrayList<>();
    private int taskIdCounter = 1;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            String taskName = request.getParameter("taskName");
            if (taskName != null && !taskName.trim().isEmpty()) {
                Task newTask = new Task(taskIdCounter++, taskName, "DOING");
                tasks.add(newTask);
            }
        } else if ("toggle".equals(action)) {
            int taskId = Integer.parseInt(request.getParameter("taskId"));
            for (Task task : tasks) {
                if (task.getId() == taskId) {
                    task.setStatus(task.getStatus().equals("DOING") ? "COMPLETED" : "DOING");
                    break;
                }
            }
        }

        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("task.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("task.jsp").forward(request, response);
    }
}
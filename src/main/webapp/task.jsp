<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.example.demo02.model.Task" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>To-Do List</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f0f4f8, #d9e4f5);
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
        }
        .header {
            background: linear-gradient(90deg, #4B0082, #6A0DAD);
            color: white;
            padding: 15px;
            text-align: center;
            border-radius: 10px 10px 0 0;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .header span {
            margin: 0 15px;
            cursor: pointer;
            transition: color 0.3s;
        }
        .header span:hover {
            color: #FFD700;
        }
        .form-container {
            margin: 20px 0;
            text-align: center;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 80%;
            max-width: 600px;
        }
        .form-container input[type="text"] {
            padding: 10px;
            width: 60%;
            border: 2px solid #4B0082;
            border-radius: 5px;
            font-size: 16px;
            transition: border-color 0.3s;
        }
        .form-container input[type="text"]:focus {
            border-color: #6A0DAD;
            outline: none;
        }
        .add-button, .action-button {
            background: linear-gradient(90deg, #4B0082, #6A0DAD);
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background 0.3s, transform 0.2s;
            margin-left: 10px;
        }
        .add-button:hover, .action-button:hover {
            background: linear-gradient(90deg, #6A0DAD, #8A2BE2);
            transform: translateY(-2px);
        }
        .task-table {
            width: 80%;
            margin: 20px auto;
            border-collapse: separate;
            border-spacing: 0;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }
        .task-table th, .task-table td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: center;
            font-size: 16px;
        }
        .task-table th {
            background: linear-gradient(90deg, #4B0082, #6A0DAD);
            color: white;
            text-transform: uppercase;
        }
        .task-table tr {
            background-color: #fff;
            transition: background-color 0.3s;
        }
        .task-table tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        .task-table tr.doing {
            background-color: #FFFACD;
        }
        .task-table tr.completed {
            background-color: #E6E6FA;
        }
        .task-table tr:hover {
            background-color: #f0f0f0;
        }
    </style>
</head>
<body>
<div class="header">
    <span>Trang chủ</span> | <span>Liên hệ</span> | <span>Giỏ hàng</span> | <span>Tài khoản</span>
</div>

<div class="form-container">
    <form action="TaskServlet" method="post" accept-charset="UTF-8">
        <input type="text" name="taskName" placeholder="Enter new job" required>
        <button type="submit" name="action" value="add" class="add-button">Add</button>
    </form>
</div>

<table class="task-table">
    <tr>
        <th>ID</th>
        <th>Job Name</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Task> tasks = (ArrayList<Task>) request.getAttribute("tasks");
        if (tasks != null) {
            for (Task task : tasks) {
    %>
    <tr class="<%= task.getStatus().toLowerCase() %>">
        <td><%= task.getId() %></td>
        <td><%= task.getName() %></td>
        <td><%= task.getStatus() %></td>
        <td>
            <form action="TaskServlet" method="post" style="display:inline;" accept-charset="UTF-8">
                <input type="hidden" name="taskId" value="<%= task.getId() %>">
                <button type="submit" name="action" value="toggle" class="action-button">Change status</button>
            </form>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
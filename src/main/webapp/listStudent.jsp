<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="com.example.demo02.model.Student" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Danh sách vé xe học sinh</title>
    <style>
        table { border-collapse: collapse; width: 70%; margin: auto; }
        th, td { border: 1px solid #aaa; padding: 8px; text-align: center; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>
<h2 style="text-align:center;">Danh sách học sinh đã đăng ký vé xe</h2>
<table>
    <tr>
        <th>Họ và tên</th>
        <th>Lớp</th>
        <th>Loại xe</th>
        <th>Biển số xe</th>
    </tr>

    <%
        List<Student> students = (List<Student>) request.getAttribute("students");
        if (students != null) {
            for (Student student : students) {
    %>
    <tr>
        <td><%= student.getName() %></td>
        <td><%= student.getClassName() %></td>
        <td><%= student.getVehicleType() %></td>
        <td><%= student.getLicensePlate() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="4">Không có dữ liệu học sinh nào.</td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>

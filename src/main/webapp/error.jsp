<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/6/2025
  Time: 8:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông báo lỗi</title>
    <style>
        body { font-family: Arial; color: red; padding: 20px; }
        .error-box { border: 1px solid red; padding: 10px; background-color: #ffe6e6; }
    </style>
</head>
<body>
<h2>🥲 Rất tiếc, đã xảy ra lỗi!</h2>
<div class="error-box">
    <p><strong>Chi tiết lỗi:</strong></p>
    <p>${errorMessage}</p>
</div>
<a href="index.jsp">Quay lại trang chính</a>
</body>
</html>

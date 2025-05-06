<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        table {
            border-collapse: collapse;
            width: 40%;
        }
        td, th {
            border: 1px solid #aaa;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
<h1>Hello, World!
</h1>
<br/>
<a href="Bt01">Bt01</a>
<a href="Bt02">Bt02</a>
<a href="Bt03">Bt03</a>
<h2>Thông Tin Người Dùng (Bt03)</h2>
<table>
    <tr>
        <th>Tên</th>
        <td>${UserName}</td>
    </tr>
    <tr>
        <th>Tuổi</th>
        <td>${UserAge}</td>
    </tr>
</table>
<h1>Welcome to Java Web! (Bt04)</h1>
<a href="Bt04">Đi tới Servlet (Bt04)</a>
<br>
<a href="Bt05">Bt05</a>
<br>
<a href="register.jsp">Bt06</a>
<br>
<a href="StudentTicketServlet">Bt07</a>
<br>
<a href="TaskServlet">Bt08</a>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Đăng ký vé xe</title>
</head>
<body>
<h2>Form Đăng Ký Vé Xe Cho Học Sinh</h2>
<form method="post" action="${pageContext.request.contextPath}/Bt06">
    <label>Họ và tên:</label><br>
    <input type="text" name="fullName" required><br><br>

    <label>Lớp:</label><br>
    <input type="text" name="className" required><br><br>

    <label>Loại xe:</label><br>
    <select name="vehicleType">
        <option value="Xe đạp">Xe đạp</option>
        <option value="Xe máy">Xe máy</option>
        <option value="Xe buýt">Xe buýt</option>
    </select><br><br>

    <label>Biển số xe:</label><br>
    <input type="text" name="licensePlate"><br><br>

    <button type="submit">Đăng ký</button>
</form>
</body>
</html>

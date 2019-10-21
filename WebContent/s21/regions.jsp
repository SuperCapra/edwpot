<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<sql:query dataSource="jdbc/hr" var="regions">select * from regions</sql:query>
<title>HR Regions</title>
</head>
<body>
    <h1>HR Regions by tag</h1>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="cur" items="${regions.rows}">
            <tr>
                <td>${cur.REGION_ID}</td>
                <td>${cur.REGION_NAME}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
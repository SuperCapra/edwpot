<%@ page import="java.time.LocalTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hello JSP</title>
</head>
<body>
    <h1>
        <% //dentro questo elemento c'� effettivamente il comando java e questo � una servelet mascherata
            out.print(LocalTime.now());
        %>
    </h1>
    <a href="/edwpot/index.html"> Back Home </a>
</body>
</html>
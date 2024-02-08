<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Tasks</h1>
<form action="AddTaskServlet" method="post">
Enter a task:
<input type="text" name="Tasks" size="50">
<input type="submit" value="Enter" />
</form>
</body>
</html>
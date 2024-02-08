<%@ page import="java.util.List" %>
<%@ page import="model.Task" %>
<%@ page import="model.TaskManager" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Task Result</title>
</head>
<body>
    <h1>Task Result</h1>
    
    <%-- Display a confirmation message or any other relevant information here --%>
    <p>Task has been added successfully!</p>
    
    <h2>Task List</h2>
    
    <ul>
        <% List<Task> tasks = TaskManager.getAllTasks(); %>
        <% for (Task task : tasks) { %>
            <li><%= task.getDescription() %></li>
        <% } %>
    </ul>
    
    <p><a href="index.jsp">Add Another Task</a></p>
    <p><a href="deleteTask.jsp">Delete Task</a></p>
    <p><a href="editTask.jsp">Edit Tasks</a>
</body>
</html>
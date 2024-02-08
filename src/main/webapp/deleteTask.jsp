<%@ page import="java.util.List" %>
<%@ page import="model.Task" %>
<%@ page import="model.TaskManager" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Task</title>
</head>
<body>
    <h1>Delete Task</h1>
    
    <h2>Task List</h2>
    
    <form action="DeleteTaskServlet" method="post">
        <ul>
            <% List<Task> tasks = TaskManager.getAllTasks(); %>
            <% for (Task task : tasks) { %>
                <li>
                    <%= task.getDescription() %>
                    <input type="hidden" name="taskDescription" value="<%= task.getDescription() %>">
                    <input type="submit" value="Delete">
                </li>
            <% } %>
        </ul>
    </form>
    
    <p><a href="taskResult.jsp">Back to Task Result</a></p>
</body>
</html>
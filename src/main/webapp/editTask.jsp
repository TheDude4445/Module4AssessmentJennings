<%@ page import="java.util.List" %>
<%@ page import="model.Task" %>
<%@ page import="model.TaskManager" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Task</title>
</head>
<body>
    <h1>Edit Task</h1>
    
    <h2>Task List</h2>
    
    <form action="UpdateTaskServlet" method="post">
        <% List<Task> tasks = TaskManager.getAllTasks(); %>
        <% int taskCounter = 0; %>
        <% for (Task task : tasks) { %>
            <div>
                <label for="task<%= taskCounter %>">Task Description:</label>
                <input type="text" id="task<%= taskCounter %>" name="taskDescription<%= taskCounter %>" value="<%= task.getDescription() %>">
            </div>
            <% taskCounter++; %>
        <% } %>
        <input type="submit" value="Save Changes">
    </form>
    
    <p><a href="taskResult.jsp">Back to Task Result</a></p>
</body>
</html>
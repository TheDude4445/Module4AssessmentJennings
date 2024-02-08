package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Task;
import model.TaskManager;

/**
 * Servlet implementation class AddTaskServlet
 */
@WebServlet("/AddTaskServlet")
public class AddTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the task input from the form
        String taskDescription = request.getParameter("Tasks");

        // Perform validation if necessary (e.g., check if the taskDescription is not empty)

        // Create a Task object with the description
        Task newTask = new Task(taskDescription);

        // Add the task object to your task management system
        TaskManager.addTask(newTask); // You should have a method like this in your TaskManager class
        
        System.out.println("Task added: " + newTask.getDescription());

        // Redirect the user to a result page (taskResult.jsp in this case)
        response.sendRedirect("taskResult.jsp");
    }
}

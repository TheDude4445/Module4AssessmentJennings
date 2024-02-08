package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Task;
import model.TaskManager;

/**
 * Servlet implementation class DeleteTaskServlet
 */
@WebServlet("/DeleteTaskServlet")
public class DeleteTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the task description from the request
        String taskDescriptionToDelete = request.getParameter("taskDescription");

        // Get the list of tasks from the TaskManager
        List<Task> tasks = TaskManager.getAllTasks();

        // Find and remove the task with the matching description
        for (Task task : tasks) {
            if (task.getDescription().equals(taskDescriptionToDelete)) {
                tasks.remove(task);
                break; // Exit the loop after the first match is found and removed
            }
        }

        // Redirect the user back to the task result page
        response.sendRedirect("taskResult.jsp");
    }
}

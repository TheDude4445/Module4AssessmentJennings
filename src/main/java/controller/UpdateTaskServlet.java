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
 * Servlet implementation class UpdateTaskServlet
 */
@WebServlet("/UpdateTaskServlet")
public class UpdateTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the list of tasks from the TaskManager
        List<Task> tasks = TaskManager.getAllTasks();

        // Iterate through the tasks and update their descriptions
        for (int i = 0; i < tasks.size(); i++) {
            String updatedDescription = request.getParameter("taskDescription" + i);

            // Update the task description if not empty
            if (updatedDescription != null && !updatedDescription.isEmpty()) {
                tasks.get(i).setDescription(updatedDescription);
            }
        }

        // Redirect the user back to the task result page
        response.sendRedirect("taskResult.jsp");
    }
}

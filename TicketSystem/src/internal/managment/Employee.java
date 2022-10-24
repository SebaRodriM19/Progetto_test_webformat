package internal.managment;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import internal.exception.ImNotCEOException;
import internal.exception.TaskNotFoundException;
/**
 * This interface represents the employee in a factory
 *
 */

public interface Employee {

		
	/**
	 * Method overwritten in subclasses.
	 * Stamp the time when employee enter the factory
	 */
	LocalDate stampBadgeToEnter();
	
	/**
	 * Method overwritten in subclasses.
	 * Stamp the time when employee leave the factory
	 */
	 LocalDate stampBadgeToLeave();
	
	 
		/**
		 * Method to hires employee. Only the CEO can be use this action
		 * 
		 * @param typeEmployee
		 * @param name
		 * @param phoneNumber
		 * @param emailAddress
		 * @param badgeID
		 * @return new employee
		 */
		// possible exception in this method... only CEO can do this action
		public Employee hiresEmployee(String typeEmployee, String name, String phoneNumber, String emailAddress,
				int badgeID) throws ImNotCEOException;

		/**
		 * CEO creates project with a PM and a name for the project
		 * @param projectManager, project manajer
		 * @param nameProject, project name
		 * @return new project
		 */
		public Project createProject(Employee projectManager, String nameProject);
		
		
		/**
		 * PM creates tasks 
		 * @param descriprion, represent the task description 
		 * @param deadline, represents the day limit to complete the task
		 * @return newTask, the creation of new task
		 */
		public Task createTask(String descriprion, Date deadline) ;
		
		/**
		 * PM assigns a task to DEV
		 * @t, represents the task to assign
		 * @dev, represents the dev
		 */
		public void assignTask(Task t, DEV dev);
		

		/**
		 * PM remove a task to DEV
		 * @t, represents the task to remove
		 * @dev, represents the dev
		 */
		public void removeTask(Task t, DEV dev);
		
		
		/**
		 * This method change the task status and evntually send a commit
		 * 
		 * @trhows TaskNotFoundException, if the task is not assigned to DEV, generates
		 *         exception
		 * @param task, task to change status to
		 * @param dev,  Developer who change the status
		 */
		public void changeTaskStatus(Task task, DEV dev, StatusTask newStatus) throws TaskNotFoundException;

		/**
		 * This function shows the tasks assigned to the DEV
		 */
		public void showTasks(DEV dev);

		/**
		 * Shows list of task to do
		 * 
		 * @return List of Task
		 */
		public List<Task> getTasksToDo();

}

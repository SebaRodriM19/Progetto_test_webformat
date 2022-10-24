package internal.managment;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class CompanyManagment {
	//list of all projects with the development team
	private static List<ProjectDevelopment> listProjects;
	
	
	/**
	 * Add Project Development in list of projects
	 */
	//possible exception 
	public void addProjectDevelopment(ProjectDevelopment projDev) {
		listProjects.add(projDev);
	}
	
	/**
	 * Add Project Development in list of projects
	 */
	//possible exception 
	public void removeProjectDevelopment(ProjectDevelopment projDev) {
		listProjects.remove(projDev);
	}
	
	
	/**
	 * Create and assign task to a dev
	 */
	//you can iterate on the map to extract the PM, create the task and assign it to the DEV
	public void createAndAssignTaskToDev(DEV dev, PM pm, String descriptionTask, Date deadline) {
		Task t = pm.createTask(descriptionTask, deadline);
		pm.assignTask(t, dev);
	}
	
	/**
	 * Remove ONE task to a DEV
	 */
	//you can iterate on the map to extract the PM, remove the task to the DEV
	public void removeTaskToDev(DEV dev, PM pm, Task t) {
		pm.removeTask(t, dev);
	}
	
	/**
	 * Function that shows task, according to a DEV, the tasks in processing
	 * @param dev, employee that we want to know about his tasks in processing
	 */
	public void showTaskInProcessign(DEV dev) {
		for (Task task : dev.getTasksToDo()) {
			if(task.getStatusTask().equals(StatusTask.IN_PROCESSING)) {
				System.out.println(task.toString());
			}
		} 
		
	}
	
	/**
	 * Create and assign to a team a new DEV
	 */
	public void createAndAssignNewDev(EmployeeFactory emplFact, Team team, String typeEmployee, String name, String phoneNumber, String emailAddress, int badgeID) {
		Employee em = emplFact.getEmployee(typeEmployee, name, phoneNumber, emailAddress, badgeID);
		team.addDev(team, em);
	}
	
	/**
	 * Function that shows different teams who works on tasks in the same project
	 */
	public void showCrossTeamProject() {
		int counter = 0;
		
		for (ProjectDevelopment projectDevelopment : listProjects) {
			//From project count the team who works on ad print the toString of cross project 
			for (List<Team> teams : projectDevelopment.getProjectDevelopment().values()) {
				counter ++;
			}
			if(counter >= 2) {
				for (Project project : projectDevelopment.getProjectDevelopment().keySet()) {
					System.out.println(project.toString());
				}
			}
			
			counter = 0;
		}
	}
	
	
	/**
	 * Shows the PM of reference to the DEV
	 * @param Iterator 
	 */
	//si può fare sicuramente diversamente e con un costo decisamente minore...
	//possibilità che si generino diverse eccezioni
	public String showPmReferenceToDev(DEV dev, int Iterator) {
		
		HashMap<Project, List<Team>> projTeam = null;
		List<Employee> listDev = null;
		Employee projMan = null;
		
		for (ProjectDevelopment projectDevelopment : listProjects) {
			projTeam = projectDevelopment.getProjectDevelopment();
			Project p = (Project) projTeam.keySet();
			
			for (List<Team> teams : projTeam.values()) {
				for (Team team : teams) {
					listDev =team.getListDeveloper();
					
					for (Employee employee : listDev) {
						if(employee.equals(dev)) {
							projMan=  p.getProjectManager();
						return projMan.toString();
						}
					}
					
				}
			}
			
		}
		
		return projMan.toString();
	}

	
}
		

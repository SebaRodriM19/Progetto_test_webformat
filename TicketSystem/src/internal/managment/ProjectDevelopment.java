package internal.managment;

import java.util.HashMap;
import java.util.List;

public class ProjectDevelopment {

	//This map contains the development teams (one or more) associated with a project
	private  HashMap<Project, List<Team>> projectDevelopment;

		
	/**
	 * Construcotr project development
	 * @param projectDevelopment
	 */
	public ProjectDevelopment(HashMap<Project, List<Team>> projectDevelopment) {
	
		this.projectDevelopment=projectDevelopment;
	}
		
	/**
	 * Get the map of project with development team
	 * @return project development
	 */
	public HashMap<Project, List<Team>> getProjectDevelopment() {
		return this.projectDevelopment;
	}
	
}

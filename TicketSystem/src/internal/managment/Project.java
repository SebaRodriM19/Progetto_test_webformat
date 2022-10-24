package internal.managment;


public class Project {

	private Employee projectManager;
	private String nameProject;
	
	
	public Project(Employee projectManager, String nameProject) {
		this.projectManager = projectManager;
		this.nameProject = nameProject;
	}

	/**
	 * Get the PM
	 * @return employye PM
	 */
	public Employee getProjectManager() {
		return this.projectManager;
	}
	
	/**
	 * Set PM
	 * @param projectManager, new PM
	 */
	public void setProjectManager(Employee projectManager) {
		this.projectManager = projectManager;
	}
	
	/**
	 * Get name project
	 * @return string name project
	 */
	public String getNameProject() {
		return this.nameProject;
	}
	
	/**
	 * Change name project 
	 * @param nameProject, new name project
	 */
	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

}

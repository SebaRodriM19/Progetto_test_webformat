package internal.managment;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import internal.exception.TaskNotFoundException;

public class CEO implements Employee{
	//NOTA per ORM:
	//attributi che verranno utilizzati come colonne della tabella Employee(entità genitore) e dovrà essere specificato il ruolo per ogni tipologia 
	//di impiegato (CEO,PM,DEV)
	private String name;
	private String numberPhone;
	private String emailAddress;
	private int badgeID;
	
	/**
	 * Constructor method to create CEO
	 * @param name
	 * @param numberPhone
	 * @param emailAddress
	 * @param badgeID
	 */
	public CEO(String name, String numberPhone, String emailAddress, int badgeID) {
		this.name = name;
		this.numberPhone = numberPhone;
		this.emailAddress = emailAddress;
		this.badgeID = badgeID;
	}

	/**
	 * Return employee name
	 * @return string, represents the employee name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Modify employee name
	 * @param name, string, represents the employee name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Return employee number phone
	 * @returnstring, represents the employee number phone
	 */
	public String getNumberPhone() {
		return numberPhone;
	}
	
	/**
	 * Modify the employee number phone
	 * @param numberPhone, represents the new employee number phone
	 */
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	
	/**
	 * Return emmployee email address
	 * @return emailAddress, represents employee email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	
	/**
	 * Modify employee email address
	 * @param emailAddress, represents the new employee email address
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	//I assume that the badge code changes depending on the role
		//example: badges of the pm have 5 characters, those of the dev 7 and ceo 4.
		
	/**
	* Return employee badgeID
	* @return badgeID, represents employee badge code
	*/
	public int getBadgeID() {
		return badgeID;
	}
		
	/**
	 * Modify employee badge code
	 * @param badgeID, represents new employee badge code
	 */
	public void setBadgeID(int badgeID) {
		this.badgeID = badgeID;
	}
	
	/**
	 * Stamp the time when CEO enter the factory
	 */
	@Override
	public LocalDate stampBadgeToEnter() {
		return LocalDate.now();	
	}
	
	/**
	 * Stamp the time when CEO leave the factory
	 */
	@Override
	public LocalDate stampBadgeToLeave() {
		return LocalDate.now();
	}

	/**
	 * CEO hires a new employee tha can be a PM or a DEV
	 * @param typeEmployee, string to decide the type of employee
	 * @param name, employee name 
	 * @param phoneNumber, employee phone eumber 
	 * @param emailAddress, employee email address
	 * @param badgeID, employee badge
	 */
	@Override
	public Employee hiresEmployee(String typeEmployee, String name, String phoneNumber, String emailAddress, int badgeID) {
		Employee em = null; // it can be initialize in main method
		
		if(typeEmployee.equalsIgnoreCase("PM")){
			 em = new PM(name, phoneNumber, emailAddress, badgeID);
		
		} else if (typeEmployee.equalsIgnoreCase("DEV")){
			em = new DEV(name, phoneNumber, emailAddress, badgeID);
		}
		return em;
	}
	
	/**
	 * CEO creates project with a PM and a name for the project
	 * @param projectManager, project manajer
	 * @param nameProject, project name
	 * @return new project
	 */
	public Project createProject(Employee projectManager, String nameProject) {
		
		return new Project(projectManager, nameProject);
	}

	
	/**
	 * Return employee data
	 */
	@Override
	public String toString() {
		return "{ "+ "\n" +"name: " + this.name  + "\n" + "Number Phone: " + this.numberPhone + "\n" +  "Email Address: " + this.emailAddress + "\n"
				+ "badgeID: " + this.badgeID + "\n" + " }";
	}

	@Override
	public void changeTaskStatus(Task task, DEV dev, StatusTask newStatus) throws TaskNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTasks(DEV dev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Task> getTasksToDo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task createTask(String descriprion, Date deadline) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignTask(Task t, DEV dev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTask(Task t, DEV dev) {
		// TODO Auto-generated method stub
		
	}
	
	
}

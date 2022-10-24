package internal.managment;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import internal.exception.TaskNotFoundException;

public class DEV implements Employee{
	//NOTA per ORM:
	//attributi che verranno utilizzati come colonne della tabella Employee(entità genitore) e dovrà essere specificato il ruolo per ogni tipologia 
	//di impiegato (CEO,PM,DEV)
	private String name;
	private String numberPhone;
	private String emailAddress;
	private int badgeID;
	private List<Task> tasksToDo;
	

	/**
	 * Constructor method to create DEV
	 * @param name
	 * @param numberPhone
	 * @param emailAddress
	 * @param badgeID
	 */
	public DEV(String name, String numberPhone, String emailAddress, int badgeID) {
		this.name = name;
		this.numberPhone = numberPhone;
		this.emailAddress = emailAddress;
		this.badgeID = badgeID;
	}

	/**
	 * Stamp the time when DEV enter the factory
	 */
	@Override
	public LocalDate stampBadgeToEnter() {
		return LocalDate.now();
	}
	
	/**
	 * Stamp the time when DEV leave the factory
	 */
	@Override
	public LocalDate stampBadgeToLeave() {
		return LocalDate.now();
		
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
	 * Shows list of task to do
	 * @return List of Task
	 */
	public List<Task> getTasksToDo() {
		return this.tasksToDo;
	}
	
	/**
	 * This method change the task status and evntually send a commit
	 * @trhows TaskNotFoundException, if the task is not assigned to DEV, generates exception
	 * @param task, task to change status to
	 * @param dev, Developer who change the status
	 */
	public void changeTaskStatus(Task task, DEV dev, StatusTask newStatus) throws TaskNotFoundException{
	
			for (Iterator<Task> taskIterator = dev.getTasksToDo().iterator(); taskIterator.hasNext();) {
				Task taskTochange = taskIterator.next();
				if(taskTochange.equals(task)) {
					task.setStatusTask(newStatus);
					break;
				}
			}
		}
			

	/**
	 * This function shows the tasks assigned to the DEV
	 */
	public void showTasks(DEV dev) {
		for (Task task : dev.getTasksToDo()) {
			System.out.println(task.toString());
		}	
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
	public Employee hiresEmployee(String typeEmployee, String name, String phoneNumber, String emailAddress,
			int badgeID) {
		return null;
	}

	@Override
	public Project createProject(Employee projectManager, String nameProject) {
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

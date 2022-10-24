package internal.managment;

import java.util.Date;

public class Task {
	
	private String description;
	private StatusTask statusTask;
	private Date deadline;
	
	/**
	 * Task constructor
	 * @param description, string that represents the task decription
	 * @param statusTask, enum represents the task status
	 * @param deadline, date represents the deadline for completing the task 
	 */
	public Task(String description, Date deadline) {
		this.description = description;
		this.statusTask = StatusTask.CREATED;
		this.deadline = deadline;
	}

	/**
	 * get task description 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * set task description
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * gest status task
	 * @return
	 */
	public StatusTask getStatusTask() {
		return statusTask;
	}
	
	/**
	 * set status task
	 * @param statusTask
	 */
	public void setStatusTask(StatusTask statusTask) {
		this.statusTask = statusTask;
	}
	
	/**
	 * get deadline
	 * @return
	 */
	public Date getDeadline() {
		return deadline;
	}
	/**
	 * set deadline
	 * @param deadline
	 */
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	/**
	 * Show the task details
	 */
	@Override
	public String toString() {
		return "Task [description=" + description + ", statusTask=" + statusTask + ", deadline=" + deadline + "]";
	}
	
	
}

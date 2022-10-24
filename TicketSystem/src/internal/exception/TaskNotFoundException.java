package internal.exception;

public class TaskNotFoundException extends Exception {
	
	public TaskNotFoundException() {
		super("Task not assigned to dev");
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
}

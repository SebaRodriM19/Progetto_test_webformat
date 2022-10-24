package internal.managment;

public class EmployeeFactory {

	/**
	 * Factory that creates employees
	 * @param typeEmployee, string that represents the type of employee that we want
	 * @param name, string represents employee name
	 * @param phoneNumber. string represents employee phone number
	 * @param emailAddress, string represents employee email address
	 * @param badgeID, ineger represents employee badge 
	 * @return new employee
	 */
	public Employee getEmployee(String typeEmployee, String name, String phoneNumber, String emailAddress, int badgeID) {
		
		if(typeEmployee.equalsIgnoreCase("CEO")) {
			
			return new CEO(name,phoneNumber,emailAddress,badgeID);
			
		} else if (typeEmployee.equalsIgnoreCase("PM")) {
			
			return new PM(name,phoneNumber,emailAddress,badgeID);
			
		}else if(typeEmployee.equalsIgnoreCase("DEV")) {
			
			return new DEV(name,phoneNumber,emailAddress,badgeID);
		}
		
		return null;
	}
	

}

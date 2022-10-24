package internal.managment;

import java.util.List;

public class Team {
	
	private List<Employee> listDeveloper;
	private int idTeam;
	
	/**
	 * Constructor team list of DEV
	 * @param idTeam , identifier of the team
	 * @param listDeveloper, list of developer
	 */
	public Team(List<Employee> listDeveloper, int idTeam) {
		this.listDeveloper = listDeveloper;
		this.idTeam = idTeam;
	}
	
	/**
	 * Get id of team
	 * @return
	 */
	public int getIdTeam() {
		return idTeam;
	}
	
	/**
	 * Get the list of DEV in a team
	 * @return the list of DEV in the team
	 */
	public List<Employee> getListDeveloper() {
		return listDeveloper;
	}
	
	/**
	 * Add developer in a team
	 * @param team, where we want to add the DEV
	 * @param e, employee to add
	 */
	public void addDev(Team team, Employee e) {
		team.getListDeveloper().add(e);
	}


}

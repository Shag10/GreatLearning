public class Manager{
	private int id;
	private String name;
	private String department;
	private int numOfTeammates;
	public Manager(int id, String name, String department, int numOfTeammates) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.numOfTeammates = numOfTeammates;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getNumOfTeammates() {
		return numOfTeammates;
	}
	public void setNumOfTeammates(int numOfTeammates) {
		this.numOfTeammates = numOfTeammates;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", department=" + department + ", numOfTeammates="
				+ numOfTeammates + "]";
	}
	
	
}

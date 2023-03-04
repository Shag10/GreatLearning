package ManagementSystem.pojos;

public class TeamMate {
	private int empId;
	private int managerId;
	private String empName;
	private String department;
	private char gender;
	
	public TeamMate(int empId, int managerId, String empName, String department, char gender) {
		super();
		this.empId = empId;
		this.managerId = managerId;
		this.empName = empName;
		this.department = department;
		this.gender = gender;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "TeamMate [empId=" + empId + ", managerId=" + managerId + ", empName=" + empName + ", department="
				+ department + ", gender=" + gender + "]";
	}
	
	
}

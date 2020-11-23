
public interface Employee {
	public void showEmployeeDetails();
}

class Developer implements Employee {
	private String name;
	private long empId;
	private String position;

	public Developer(String name, long empId, String position) {
		this.name = name;
		this.empId = empId;
		this.position = position;
	}
	
	@Override
	public void showEmployeeDetails() {
		System.out.println("Developer details : " + this.name + ", " + this.empId + ", " + this.position);
	}
}

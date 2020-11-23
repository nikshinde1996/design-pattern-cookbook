import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private List<Employee> employeesList = new ArrayList<Employee>();
	
	private String name;
	private double salary;
	
	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public void showEmployeeDetails() {
		for(Employee emp: employeesList) {
			emp.showEmployeeDetails();
		}
	}
	
	public Employee getEmployee(int i) {
		return this.employeesList.get(i);
	}
	
	public void add(Employee e) {
		this.employeesList.add(e);
	}
	
	public void remove(Employee e) {
		this.employeesList.remove(e);
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}

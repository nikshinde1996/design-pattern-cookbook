
public class Client {
	public static void main(String args[]) {
		Employee emp1 = new Developer("Dev1", 100, "Developer");
		Employee emp2 = new Developer("Dev2", 100, "Developer");
		Employee emp3 = new Developer("Dev3", 100, "Developer");
		Employee emp4 = new Developer("Dev4", 100, "TPM");
		
		Manager manager = new Manager("Mike", 25000);
		manager.add(emp1);
		manager.add(emp2);
		manager.add(emp3);
		
		Manager manager2 = new Manager("Nike", 50000);
		manager2.add(emp4);
		
		// add composite as employee
		manager2.add(manager);
		
		manager2.showEmployeeDetails();
	}
}

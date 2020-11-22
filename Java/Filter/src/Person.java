
public class Person {
	private String name;
	private String gender;
	private String maritalStatus;
	
	Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	
	String getName() {
		return this.name;
	}
	
	String getGender() {
		return this.gender;
	}
	
	String getMaritalStatus() {
		return this.maritalStatus;
	}
}

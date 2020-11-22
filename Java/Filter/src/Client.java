import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String args[]) {
		List<Person> persons = new ArrayList<Person>();

	    persons.add(new Person("Client1","Male", "Single"));
	    persons.add(new Person("Client2", "Male", "Married"));
	    persons.add(new Person("Client3", "Female", "Married"));
	    persons.add(new Person("Client4", "Female", "Single"));
	    persons.add(new Person("Client5", "Male", "Single"));
	    persons.add(new Person("Client6", "Male", "Single"));
	    
	    CriteriaMale maleCriteria = new CriteriaMale();
	    
	    CriteriaSingle singleCriteria = new CriteriaSingle();
	    
	    List<Person> malePersons = maleCriteria.meetsCriteria(persons);
	    List<Person> singlePersons = singleCriteria.meetsCriteria(persons);
	    
	    AndCriteria oc = new AndCriteria(maleCriteria, singleCriteria);
	    List<Person> singleMales = oc.meetsCriteria(persons);
	    
	    for(Person p: singleMales) {
	    	System.out.println("[" +p.getName()+ ", "+p.getGender()+ ", " +p.getMaritalStatus()+ "]");
	    }
	}
}

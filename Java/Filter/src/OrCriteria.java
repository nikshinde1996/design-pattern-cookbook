import java.util.List;

public class OrCriteria implements Criteria {
	
	private Criteria criteria1;
	private Criteria criteria2;
	
	public OrCriteria(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public List<Person> meetsCriteria(List<Person> persons) {
		List<Person> filteredPersons1 = this.criteria1.meetsCriteria(persons);
		List<Person> filteredPersons2 = this.criteria2.meetsCriteria(persons);
		for(Person person: filteredPersons2) {
			if(!filteredPersons1.contains(person)) filteredPersons1.add(person);
		}
		return filteredPersons1;
	}
}

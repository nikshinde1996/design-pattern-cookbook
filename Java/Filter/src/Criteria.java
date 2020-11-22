import java.util.ArrayList;
import java.util.List;

public interface Criteria {
	List<Person> meetsCriteria(List<Person> persons);
}

class CriteriaMale implements Criteria {
	public List<Person> meetsCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<>();
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}

class CriteriaFemale implements Criteria {
	public List<Person> meetsCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<>();
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}

class CriteriaSingle implements Criteria {
	public List<Person> meetsCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<>();
		for(Person person: persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}

class CriteriaMarried implements Criteria {
	public List<Person> meetsCriteria(List<Person> persons) {
		List<Person> marriedPersons = new ArrayList<>();
		for(Person person: persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("MARRIED")) {
				marriedPersons.add(person);
			}
		}
		return marriedPersons;
	}
}

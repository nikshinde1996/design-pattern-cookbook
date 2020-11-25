
public class Projector {
	private String descritpion;
	
	Projector(String descritpion) {
		this.descritpion = descritpion;
	}
	
	public void project() {
		System.out.println(descritpion + " Projector::project");
	}
}

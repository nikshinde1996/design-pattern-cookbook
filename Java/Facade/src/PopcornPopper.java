
public class PopcornPopper {
	private String descritpion;
	
	PopcornPopper(String descritpion) {
		this.descritpion = descritpion;
	}
	
	public void pop() {
		System.out.println(descritpion + " PopcornPopper::pop");
	}
}

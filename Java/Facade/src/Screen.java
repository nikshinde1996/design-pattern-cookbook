
public class Screen {
	private String descritpion;
	
	Screen(String descritpion) {
		this.descritpion = descritpion;
	}
	
	public void show() {
		System.out.println(descritpion + " Screen::show");
	}
}


public class Amplifier {
	private String descritpion;
	
	Amplifier(String descritpion) {
		this.descritpion = descritpion;
	}
	
	public void amplify() {
		System.out.println(descritpion + " Amplifier::amplify");
	}
}

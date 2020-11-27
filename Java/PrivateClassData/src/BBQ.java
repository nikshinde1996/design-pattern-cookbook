
// This class is very exposed and directly allows mutation of class data
public class BBQ {
	private int countMeat;
	private int countChicken;
	private int countPotatoes;
	private int countCorns;
	private int countCarrots;
	
	public BBQ(
		int countMeat, int countChicken, int countPotatoes, int countCorns, int countCarrots
	) {
		this.countMeat = countMeat;
		this.countChicken = countChicken;
		this.countPotatoes = countPotatoes;
		this.countCorns = countCorns;
		this.countCarrots = countCarrots;
	}
	
	public void mix() {
		System.out.println("BBQ'ing countMeat: " + this.countMeat + 
				" ,countChicken: " + this.countChicken +
				" ,countPotatoes: " + this.countPotatoes +
				" ,countCorns: " + this.countCorns +
				" ,countCarrots: " + this.countCarrots);
	}
}

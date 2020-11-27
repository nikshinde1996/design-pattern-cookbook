
public class BBQData {
	private int countMeat;

	private int countChicken;
	private int countPotatoes;
	private int countCorns;
	private int countCarrots;
	
	public BBQData(
		int countMeat, int countChicken, int countPotatoes, int countCorns, int countCarrots
	) {
		this.countMeat = countMeat;
		this.countChicken = countChicken;
		this.countPotatoes = countPotatoes;
		this.countCorns = countCorns;
		this.countCarrots = countCarrots;
	}
	
	public int getCountMeat() {
		return countMeat;
	}

	public int getCountChicken() {
		return countChicken;
	}

	public int getCountPotatoes() {
		return countPotatoes;
	}

	public int getCountCorns() {
		return countCorns;
	}

	public int getCountCarrots() {
		return countCarrots;
	}
}


// For ImmutableBBQ class its data is protected by BBQData class, and its methods in are 
// not able to manipulate the data of the ImmutableBBQ class.

public class ImmutableBBQ {
	private BBQData bbqData;
	
	public ImmutableBBQ(
		int countMeat, int countChicken, int countPotatoes, int countCorns, int countCarrots
	) {
		this.bbqData = new BBQData(countMeat, countChicken, countPotatoes, countCorns, countCarrots);
	}
	
	public void mix() {
		System.out.println("ImmutableBBQ'ing countMeat: " + this.bbqData.getCountMeat() + 
				" ,countChicken: " + this.bbqData.getCountChicken()+
				" ,countPotatoes: " + this.bbqData.getCountPotatoes() +
				" ,countCorns: " + this.bbqData.getCountCorns() +
				" ,countCarrots: " + this.bbqData.getCountCarrots());
	}
}

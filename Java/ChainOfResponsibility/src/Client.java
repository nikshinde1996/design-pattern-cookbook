
public class Client {
	private DispenseChain c1;
	
	public Client() {
		
		// initialize the chain
		this.c1 = new Dollor50Dispensor();
		DispenseChain c2 = new Dollor20Dispensor();
		DispenseChain c3 = new Dollor10Dispensor();
		
		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	public static void main(String args[]) {
		Client atmDispensor = new Client();
		atmDispensor.c1.dispense(new Currency(180));
		
		
		//	Output:
		//		Dispensing 3 50$ notes.
		//		Dispensing 1 20$ notes.
		//		Dispensing 1 10$ notes.

	}
}

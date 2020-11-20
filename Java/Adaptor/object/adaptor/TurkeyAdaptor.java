package object.adaptor;

public class TurkeyAdaptor implements Duck {
	Turkey turkey;
	
	public TurkeyAdaptor(Turkey turkey) {
		this.turkey = turkey;
	}
	
	// This method isn't available for Turkey, but we need to 
	// adapt it accordingly, 
	public void quack() {
		this.turkey.gobble();
	}

	@Override
	public void fly() {
		this.turkey.fly();
	}
}

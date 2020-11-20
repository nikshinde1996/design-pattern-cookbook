package src;

public interface BuilderInterface {
	void buildBody();
	void insertWheels();
	void addHeadLights();
	Product getVehical();
}

class Car implements BuilderInterface {
	private Product product = new Product(); 
	
	@Override
	public void buildBody() {
		product.add("Building body of the car.");
	}

	@Override
	public void insertWheels() {
		product.add("Inserting the 4 wheels of the car.");
	}

	@Override
	public void addHeadLights() {
		product.add("Adding head lights of the car.");
	}

	@Override
	public Product getVehical() {
		return product;
	}	
}

class MotorCycle implements BuilderInterface {
	private Product product = new Product(); 
	
	@Override
	public void buildBody() {
		product.add("Building body of the MotorCycle.");
	}

	@Override
	public void insertWheels() {
		product.add("Inserting the 2 wheels of the MotorCycle.");
	}

	@Override
	public void addHeadLights() {
		product.add("Adding head lights of the MotorCycle.");
	}

	@Override
	public Product getVehical() {
		return product;
	}	
}

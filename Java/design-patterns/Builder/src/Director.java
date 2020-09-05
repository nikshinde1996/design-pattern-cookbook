package src;

public class Director {
	BuilderInterface builder;
	
	public void construct(BuilderInterface builder) {
		this.builder = builder;
		this.builder.buildBody();
		this.builder.insertWheels();
		this.builder.addHeadLights();
	}
}

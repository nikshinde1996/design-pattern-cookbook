
abstract class HouseTemplate {
	// Template method is final, so subclasses cannot override it
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println();
	}
	
	// default implementation of hook methods
	private void buildFoundation() {
		System.out.println("Building Foundation");
	}
	
	// methods to be implemented by subclasses
	public abstract void buildPillars();
	public abstract void buildWalls();
	
	private void buildWindows(){
		System.out.println("Building Glass Windows");
	}
}


class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Building pillars with Wooden coating");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}
	
}

class GlassHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Building pillars with Glass coating");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}
	
}

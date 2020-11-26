
public interface RobotInterface {
	public void print();
	
	// Extrinsic data is passed as argument
	public void setRobotColor(String color);
}

class Robot implements RobotInterface {

	String robotType; // Intrinsic data 
	String robotColor; // Extrinsic data (passed as arguments)
	
	public Robot(String type) {
		this.robotType = type;
	}
	
	public void setRobotColor(String color) {
		this.robotColor = color;
	}
	
	@Override
	public void print() {
		System.out.println("Robot :: [" + this.robotType + ", " + this.robotColor + "]");
	}
}

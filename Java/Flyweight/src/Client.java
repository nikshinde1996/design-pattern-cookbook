import java.util.Random;

public class Client {
	public static void main(String args[]) {
		RobotFactory robotFactory = new RobotFactory();
		
		try {
			RobotInterface smallRobot = robotFactory.getRobotFactory("SMALL");
			smallRobot.print();
			
			for(int i=0;i<3;i++) {
				// reused since small robot is already created.
				smallRobot = robotFactory.getRobotFactory("SMALL");
			}
			
			
			RobotInterface largeRobot = null;
			for(int i=0;i<5;i++) {
				// large robot is created once, later reused.
				largeRobot = robotFactory.getRobotFactory("LARGE");
				largeRobot.setRobotColor(getRandomColor());
				largeRobot.print();
			}
			
			System.out.println("Distinct robots created : " + robotFactory.totalObjectsCreated());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static String getRandomColor() {
		Random r = new Random();
		int rInt = r.nextInt();
		if(rInt%2 == 0) return "RED";
		else return "GREEN";
	}
}

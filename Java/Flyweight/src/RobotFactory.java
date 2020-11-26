import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	Map<String, RobotInterface> robotList = new HashMap<String, RobotInterface>();
	
	public int totalObjectsCreated() {
		return robotList.size();
	}
	
	public RobotInterface getRobotFactory(String robotType) throws Exception {
		RobotInterface robot = null;
		if(robotList.containsKey(robotType)) {
			robot = robotList.get(robotType);
		} else {
			switch(robotType) {
			case "SMALL":
				System.out.println("Creating Small Robot.");
				robot = new Robot("SMALL");
				robotList.put("SMALL", robot);
				break;
			case "LARGE":
				System.out.println("Creating Large Robot.");
				robot = new Robot("LARGE");
				robotList.put("LARGE", robot);
				break;
			default:
				throw new Exception("Invalid robotCategory found.");
			}
		}
		return robot;
	}
}

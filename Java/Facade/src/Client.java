
public class Client {
	public static void main(String args[]) {
		Amplifier amplifier = new Amplifier("Tesla");
		MoviePlayer moviePlayer = new MoviePlayer("Tesla");
		PopcornPopper popper = new PopcornPopper("Tesla"); 
		Projector projector = new Projector("Tesla");
		Screen screen = new Screen("Tesla");
		
		HomeTheaterFacade facade = new HomeTheaterFacade(
			amplifier, 
			moviePlayer,
			popper,
			projector,
			screen
		);
		facade.watchMovie();
	}
}

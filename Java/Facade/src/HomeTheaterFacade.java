
public class HomeTheaterFacade {
	Amplifier amplifier;
	MoviePlayer moviePlayer;
	PopcornPopper popper;
	Projector projector;
	Screen screen;
	
	HomeTheaterFacade(
		Amplifier amplifier,
		MoviePlayer moviePlayer,
		PopcornPopper popper,
		Projector projector,
		Screen screen
	) {
		this.amplifier = amplifier;
		this.moviePlayer = moviePlayer;
		this.popper = popper;
		this.projector = projector;
		this.screen = screen;
	}
	
	// function that delegates client request to the subsystems
	public void watchMovie() {
		this.popper.pop();
		this.amplifier.amplify();
		this.projector.project();
		this.screen.show();
		this.moviePlayer.playMovie();
	}
}

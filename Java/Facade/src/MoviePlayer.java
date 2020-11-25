
public class MoviePlayer {
	private String descritpion;
	
	MoviePlayer(String descritpion) {
		this.descritpion = descritpion;
	}
	
	public void playMovie() {
		System.out.println(descritpion + " MoviePlayer::playMovie");
	}
}

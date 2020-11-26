
public class ProxyImage implements Image {
	private RealImage realImage;
	String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(this.realImage == null) {
			this.realImage = new RealImage(this.fileName); 
		}
		this.realImage.display();
	}
}


public interface Image {
	void display();
}

class RealImage implements Image {
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		laodFromDisk(fileName);
	}
	
	@Override
	public void display() {
		System.out.println("RealImage::display -> " + fileName);
	}
	
	public static void laodFromDisk(String fileName) {
		System.out.println("RealImage::laodFromDisk -> " + fileName);
	}
}
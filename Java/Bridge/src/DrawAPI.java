
// Implementer interface
public interface DrawAPI {
	void drawCircle();
}

// Concrete implementer 1
class RedCircle implements DrawAPI {

	@Override
	public void drawCircle() {
		System.out.println("draw::RedCircle");
	}
}

//Concrete implementer 2
class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle() {
		System.out.println("draw::GreenCircle");
	}
}
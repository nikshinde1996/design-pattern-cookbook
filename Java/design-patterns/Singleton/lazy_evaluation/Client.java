package lazy_evaluation;

public class Client {
	public static void main(String args[]) {
		Singleton s = Singleton.getInstance();
		s.setData(20);
		
		System.out.println("Data by first reference : "+ s.getData());
		
		// get another reference to Singleton to check
		// if it's the same object
		
		s = null;
		s = Singleton.getInstance();
		
		System.out.println("Data by second reference : "+ s.getData());
	}
}

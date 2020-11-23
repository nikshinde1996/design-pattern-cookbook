
public class Client {
	public static void main(String args[]) {
		ConcreteComponent cc = new ConcreteComponent();
		
		ConcreteDecorator1 cd1 = new ConcreteDecorator1();
		cd1.setComponent(cc);
		
		
		// we can also use concrete decorator to other 
		ConcreteDecorator2 cd2 = new ConcreteDecorator2();
		cd2.setComponent(cd1);
		
		// Amazing...This would internally add both cd1 and cd2 features in cc 
		cd2.doJob();
	} 
}

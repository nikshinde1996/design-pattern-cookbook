package object.adaptor;

public class Client {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		// Turkey being incompatible with the Duck, the adaptor
		// is designed to wrap Turkey interface methods with Duck 
		Duck turkeyAdaptor  = new TurkeyAdaptor(turkey);
		
		duck.quack();
		
		// This method wraps the gobble method inside the quack method of adaptor.
		turkeyAdaptor.quack();
	}
}

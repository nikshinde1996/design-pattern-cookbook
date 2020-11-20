package object.adaptor;

public interface Duck {
	public void fly();
	public void quack();
}

class MallardDuck implements Duck {

	@Override
	public void fly() {
		System.out.println("MallardDuck::fly()");
	}

	@Override
	public void quack() {
		System.out.println("MallardDuck::quack()");
	}
}
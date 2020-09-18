package object.adaptor;

public interface Turkey {
	public void fly();
	public void gobble();
}

class WildTurkey implements Turkey {

	@Override
	public void fly() {
		System.out.println("WildTurkey::fly()");
	}

	@Override
	public void gobble() {
		System.out.println("WildTurkey::gobble()");
	}
}
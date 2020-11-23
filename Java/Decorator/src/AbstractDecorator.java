
public abstract class AbstractDecorator extends Component {
	protected Component component;
	
	public void setComponent(Component c) {
		component = c;
	}
	
	public void doJob() {
		if(component != null) component.doJob();
	}
}


class ConcreteDecorator1 extends AbstractDecorator {
	public void doJob() {
		super.doJob();
		
		// add additional responsibilities
		System.out.println("ConcreteDecorator1::Adding new functionalities");
	}
}

class ConcreteDecorator2 extends AbstractDecorator {
	public void doJob() {
		super.doJob();
		
		// add additional responsibilities
		System.out.println("ConcreteDecorator2::Adding new functionalities");
	}
}
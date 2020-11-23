
abstract class Component {
	public abstract void doJob();
}

class ConcreteComponent extends Component {

	@Override
	public void doJob() {
		System.out.println("ConcreteComponent::Closed for modification");
	}	
}
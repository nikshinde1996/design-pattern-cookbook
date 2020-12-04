
abstract class User {
	protected ChatMediator med;
	protected String name;
	
	public User(ChatMediator med, String name) {
		this.med = med;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
}


class UserImp extends User {
	
	public UserImp(ChatMediator med, String name) {
		super(med, name);
	}
	
	@Override
	public void send(String message) {
		System.out.println(this.name + " sending message = " + message);
		med.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " receiving message = " + message);
	}
}

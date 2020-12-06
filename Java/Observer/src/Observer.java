
public interface Observer {
	
	// method to update the observer, used by subject 
	public void update();
	
	// attach with the subject to observe
	public void setSubject(Subject subject);
}

class MyTopicObserver implements Observer {
	private String name;
	private Subject topic;
	
	public MyTopicObserver(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		// this method could take data of the subjects state that was changed, 
		String message = (String) topic.getUpdate(this);
		if(message == null) {
			System.out.println(name + " :: No new message " + message);
		} else {
			System.out.println(name + " :: Consuming message " + message);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}
	
}
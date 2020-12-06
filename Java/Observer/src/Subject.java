import java.util.ArrayList;
import java.util.List;

public interface Subject {
	
	// methods to register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	// methods to notify observers of change
	public void notifyObservers();
	
	// methods to get updates from the subject, not required but added so observers can query
	public Object getUpdate(Observer obj);
	
}

class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	public MyTopic() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("null observer");
		if(!observers.contains(obj)) observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		if(obj == null) throw new NullPointerException("null observer");
		if(observers.contains(obj)) observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		if(!changed) return;
		
		observersLocal = new ArrayList<>(this.observers);
		this.changed = false;
		for(Observer observer: observersLocal) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message; 
	}
	
	// method to post message to the topic
	public void postMessage(String message) {
		System.out.println("Message posted to the topic : " + message);
		this.message = message;
		this.changed = true;
		notifyObservers();
	}
	
}


public class Client {
	public static void main(String args[]) {
		// create subject
		MyTopic topic = new MyTopic();
		
		// create observers
		MyTopicObserver observer1 = new MyTopicObserver("Obj1");
		MyTopicObserver observer2 = new MyTopicObserver("Obj2");
		MyTopicObserver observer3 = new MyTopicObserver("Obj3");
		
		// register the observers
		topic.register(observer1);
		topic.register(observer2);
		topic.register(observer3);
		
		// attach the observer to the subject
		observer1.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);
		
		// check if any update is available
		observer1.update();
		
		// now send message to subject, trigger notifyAll
		topic.postMessage("New message");
	}
}

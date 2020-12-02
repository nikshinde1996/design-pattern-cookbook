
public interface Collection {
	public Iterator createIterator();
}


class NotificationCollection implements Collection {
	static final int MAX_ITEMS = 6;
	int noofItems = 0;
	Notification[] notificationList;

	public NotificationCollection() {
		notificationList = new Notification[MAX_ITEMS];
		addItem("Notification 1");
		addItem("Notification 2");
		addItem("Notification 3");
	}
	
	public void addItem(String str) {
		if(noofItems >= MAX_ITEMS) {
			System.err.print("Notification collection full");
		} else {
			notificationList[noofItems] = new Notification(str);
			noofItems++;
		}
	}
	
	@Override
	public Iterator createIterator() {
		return new NotificationIterator(notificationList);
	}
	
}
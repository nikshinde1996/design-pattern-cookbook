
public class NotificationIterator implements Iterator {
	Notification[] notificationList;
	
	// maintains current position of the iterator over the array
	int pos = 0;
	
	public NotificationIterator(Notification[] notificationList) {
		this.notificationList = notificationList;
	}
	
	
	@Override
	public boolean hasNext() {
		if(pos >= this.notificationList.length || this.notificationList[pos] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Notification notification = this.notificationList[pos];
		pos+=1;
		return notification;
	}
	
}

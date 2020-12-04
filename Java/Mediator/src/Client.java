
public class Client {
	public static void main(String args[]) {
		ChatMediator med = new ChatMediatorImpl();
		User user1 = new UserImp(med, "user1");
		User user2 = new UserImp(med, "user2");
		User user3 = new UserImp(med, "user3");
		User user4 = new UserImp(med, "user4");
		
		med.addUser(user1);
		med.addUser(user4);
		med.addUser(user3);
		med.addUser(user2);
		
		user1.send("hello people");
	}
}

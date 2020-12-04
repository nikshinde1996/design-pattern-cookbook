import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
	public void sendMessage(String message, User user);
	void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	
	public ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, User user) {
		for(User u: this.users) {
			if(u != user) u.receive(message);
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
}
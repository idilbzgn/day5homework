package core.abstracts;

import entities.concretes.User;

public interface AuthService {
	void login(User user);
	static void register(User user) {
		// TODO Auto-generated method stub
		
	}
	void login(String string, String string2);
	
	

}

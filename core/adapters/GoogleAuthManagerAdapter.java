package core.adapters;

import GoogleAuthService.GoogleAuthManager;
import core.abstracts.AuthService;
import entities.concretes.User;

public class GoogleAuthManagerAdapter implements AuthService {
GoogleAuthManager manager = new GoogleAuthManager(null);
	

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}

package business.concretes;

import business.abstracts.UserService;
import core.abstracts.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public abstract class UserManager implements UserService {
	private UserDao userDao;
	private AuthService authService;

	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	public void login(User user) {
		
	}

	public void register(User user1) {
		

	}
}

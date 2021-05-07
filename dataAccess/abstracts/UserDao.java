package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void Update(User user);
	User getEmail(String message);
	
}

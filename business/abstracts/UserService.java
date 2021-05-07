package business.abstracts;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
public interface UserService {
	void login(UserDao user);
	void register(UserDao user);
}

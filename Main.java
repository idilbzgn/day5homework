
import business.concretes.UserManager;
import core.abstracts.AuthService;
import core.adapters.GoogleAuthManagerAdapter;
import entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		User user1 = new User(1, "idil", "bezgin", "idil@email.com", "123456");
	
		AuthService authService = new GoogleAuthManagerAdapter();


		AuthService.register(user1);

		System.out.println("-----------------------------");

	

	}
}
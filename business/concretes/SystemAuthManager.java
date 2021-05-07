package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public abstract class SystemAuthManager implements AuthService{
	private UserDao userDao;

	public SystemAuthManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public void login(User user) {
		if (user.getEmail() == null || user.getPassword() == null) {
			System.out.println("Email ve þifre zorunlu alandýr.");
			return;
		}
		System.out.println("Sistem Ýle Giriþ Baþarýlý.");
	}

	public static void register(User user, UserDao User) {
		if (user.getPassword().length() < 6) {
			System.out.println("Þifre 6 karakterden kýsa olmamalýdýr.");
			return;

		}
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ýsim - soyisim 2 karakterdden kýsa olmamalýdýr.");
			return;
		}
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (!matcher.matches()) {
			System.out.println("Mail adresi e posta formatýnda olmalýdýr. (example@example.com)");
			return;
		}
		
	
		System.out.println("Kayýt Baþarýlý");

	}

	public void login(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	
}

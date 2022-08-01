package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();

	private UserManager() {

	}

	public static UserManager getInsatnce() {
		return instance;

	}

	public User createUser(long id, String e_mail, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setE_mail(e_mail);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);

		return user;

	}
}

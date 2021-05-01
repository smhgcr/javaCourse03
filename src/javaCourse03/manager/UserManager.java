package javaCourse03.manager;

import javaCourse03.model.User;

public class UserManager {

	public void showAllUser(User[] users) {

		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanicisi mevcut");
		}

	}

	public int getUserById(User user) {
	
		return user.getId();
	}

	public void add(User user) {

		getUserById(user);
		System.out.println(user.getId() + " numarali " + user.getFirstName() + " " + user.getLastName() + " kullanicisi eklendi.");
	}

	public void delete(User user) {

		getUserById(user);
		System.out.println(user.getId() + " numarali " + user.getFirstName() + " " + user.getLastName() + " kullanicisi silindi.");
	}
	
	

}

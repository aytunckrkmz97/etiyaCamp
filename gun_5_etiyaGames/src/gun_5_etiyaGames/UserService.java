package gun_5_etiyaGames;

public class UserService {
	public void save(User user) {

		if (user.age <= 15) {
			System.out.println("yasiniz uygun degil.");
		} else {

			System.out.println("User added succesfully :" + user.firstName);

		}
	}
	
	public User [] getUsers() {
		User user1 = new User();
		user1.age = 15;
		user1.firstName = "Aytunc";
		user1.lastName ="Korkmaz";
		
		User user2 = new User();
		user2.age = 25;
		user2.firstName = "Taha";
		user2.lastName ="Bayav";
		
		User [] users = {user1, user2};
		
		return users;
	}
	
	
}

package gun_5_etiyaGames;

public class Main {

	public static void main(String[] args) {
		
		GameService gameService = new GameService();
		for (Game game:gameService.getGames()) {
			System.out.println(game.name);
		}
		
		
		UserService userService = new UserService();
		
		User user = new User();
		
		user.age = 17;
		user.firstName = "Yagmur";
		user.lastName = "Teke";
		
		userService.save(user);
		
		
		
	}

}

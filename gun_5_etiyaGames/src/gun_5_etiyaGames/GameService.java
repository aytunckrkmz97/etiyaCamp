package gun_5_etiyaGames;

public class GameService {
	//dy ye kaydedilir.
	public void save(Game game) {
		System.out.println("Game saved successfully: " + game.name);
	
	}

	public Game [] getGames () {
		
		Game game1 = new Game();
		game1.name = "GTA5";
		game1.price = 10 ;
		game1.gameType = "Action";
		
		Game game2 = new Game();
		game2.name = "Age of Empires";
		game2.price = 60;
		game2.gameType = "Action";
		
		
		Game [] games = {game1, game2};
		
		
		return games;
	}
}
 
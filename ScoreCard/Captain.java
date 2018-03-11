import java.util.Random;

public class Captain implements Player{
	public PlayerName getPlayerName(){
		int pick = new Random().nextInt(PlayerName.values().length);
		return PlayerName.values()[pick];
	}
	public PlayerName1 getPlayerName1(){
		int pick = new Random().nextInt(PlayerName1.values().length);
		return PlayerName1.values()[pick];
	}

	public int getExperience(){
		return (int) Math.random()%10;
	}

}

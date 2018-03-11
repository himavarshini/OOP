import java.util.Random;
public class Batsman implements Player{
	int runs ;
	public PlayerName1 getPlayerName1(){
		int pick = new Random().nextInt(PlayerName1.values().length);
		return PlayerName1.values()[pick];
	}
	public PlayerName getPlayerName(){
		int pick = new Random().nextInt(PlayerName.values().length);
		return PlayerName.values()[pick];
	}
	public int getRuns()
	{
		Random rand = new Random();
		runs = rand.nextInt(50);
		return runs;
	}
}

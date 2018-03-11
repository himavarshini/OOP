import java.util.*;

public class Bowler implements Player{
	Random rand = new Random();
	int wickets = rand.nextInt(9);
	int bowOverNum = rand.nextInt(20);
	int runsGiven = rand.nextInt(36);
	public BowlingType getBowlingType()
	{
		int p = new Random().nextInt(BowlingType.values().length);
		return BowlingType.values()[p];
	}
	public PlayerName getPlayerName(){
		int pick = new Random().nextInt(PlayerName.values().length);
		return PlayerName.values()[pick%10];
	}
	public PlayerName1 getPlayerName1(){
		int pick = new Random().nextInt(PlayerName1.values().length);
		return PlayerName1.values()[pick%10];
	}
	public int getWickets()
	{
		return wickets;
	}
	public int getRunsGiven()
	{
		return runsGiven;
	}
	public int getBowOverNum()
	{
		return bowOverNum;
	}
	
}
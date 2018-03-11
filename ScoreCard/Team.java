import java.util.Random;

public class Team {
	Captain c = new Captain();
	public PlayerName getCaptainName()
	{
		return c.getPlayerName();
	}
	public PlayerName1 getCaptainName1()
	{
		return c.getPlayerName1();
	}
	public TeamName getTeamName(){
			int pick = new Random().nextInt(TeamName.values().length);
			return TeamName.values()[pick];
		}
	
		
}

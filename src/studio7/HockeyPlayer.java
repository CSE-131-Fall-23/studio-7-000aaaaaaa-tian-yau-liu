package studio7;

public class HockeyPlayer {
	private static String name;
	private static int numJersey;
	private static int numGames;
	private static int numGoals;
	private static int numAssists;
	private static int numPoints;
	
	
	public HockeyPlayer(String iName, int iNumJersey, int iNumGames, int iNumGoals, int iNumAssists, int iNumPoints) {
		name = iName;
		numJersey = iNumJersey;
		numGames = iNumGames;
		numGoals = iNumGoals;
		numAssists = iNumAssists;
		numPoints = iNumPoints;
	}
	
	public void setGoals(int goals) {
		numGoals = goals;
	}
	
	public void setAssists(int assists) {
		numAssists = assists;
	}
	
	public void setPoints(int points) {
		numPoints = points;
	}
	
	public void completeGame(int goal, int assists) {
		setGoals(numGoals + goal);
		setAssists(numAssists + assists);
		setPoints(numPoints + goal + assists);
		numGames ++;
	}
	
}

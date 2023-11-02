package studio7;

public class Die {
	
	private static int sides;
	
	public Die (int iSides) {
		sides = iSides;
	}
	
	public static int throwDie() {
		return (int)(Math.random()*(sides))+1;
	}
	
}

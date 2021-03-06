package dependency_association;

public class Player {
	private String name;
	private double balance;
	private int rollOutcome;

	// Player -----> Die: dependency
	public Player(String name, double balance, Die die) {
		super();
		this.name = name;
		this.balance = balance;
		this.rollOutcome = die.roll();
	}
	
	public int getRollOutcome() {
		return rollOutcome;
	}

}

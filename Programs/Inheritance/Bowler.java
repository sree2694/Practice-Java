package Inheritance;

public class Bowler extends Players {
	private int ballsbowled;
	private int wickets;
	private int runsGiven;
	public Bowler() {
		super();
	}
	public Bowler(String name, int matches, int ballsbowled, int wickets, int runsGiven) {
		super(name, matches);
		this.ballsbowled = ballsbowled;
		this.wickets = wickets;
		this.runsGiven = runsGiven;
	}
	public int getBallsbowled() {
		return ballsbowled;
	}
	public void setBallsbowled(int ballsbowled) {
		this.ballsbowled = ballsbowled;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getRunsGiven() {
		return runsGiven;
	}
	public void setRunsGiven(int runsGiven) {
		this.runsGiven = runsGiven;
	}
	
	public double calEconomy() {
		return runsGiven/(ballsbowled/6);
		
	}
	public double calAverage() {
		System.out.println("====Bowlers===");
		return runsGiven/wickets;
	}
	@Override
	public String toString() {
		return "Bowler [ballsbowled=" + ballsbowled + ", wickets=" + wickets + ", runsGiven=" + runsGiven
				+ ", calEconomy()=" + calEconomy() + ",\n toString()=" + super.toString() + "]";
	}
	
	
	

	

}

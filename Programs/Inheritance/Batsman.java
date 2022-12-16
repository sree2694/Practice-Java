package Inheritance;

public class Batsman extends Players {
	private int runsScored;
	private int ballsFaced;
	private int noOfCenturies;
	private int noOfHalfCenturies;
	private int dissmissals;
		
	public Batsman() {
		super();
	}

	public Batsman(String name, int matches, int runsScored, int ballsFaced, int noOfCenturies, int noOfHalfCenturies,
			int dissmissals) {
		super(name, matches);
		this.runsScored = runsScored;
		this.ballsFaced = ballsFaced;
		this.noOfCenturies = noOfCenturies;
		this.noOfHalfCenturies = noOfHalfCenturies;
		this.dissmissals = dissmissals;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getNoOfCenturies() {
		return noOfCenturies;
	}

	public void setNoOfCenturies(int noOfCenturies) {
		this.noOfCenturies = noOfCenturies;
	}

	public int getNoOfHalfCenturies() {
		return noOfHalfCenturies;
	}

	public void setNoOfHalfCenturies(int noOfHalfCenturies) {
		this.noOfHalfCenturies = noOfHalfCenturies;
	}

	public int getDissmissals() {
		return dissmissals;
	}

	public void setDissmissals(int dissmissals) {
		this.dissmissals = dissmissals;
	}
	public double calStrikerate(){
		return (runsScored* 100/ballsFaced);
	}

	
	@Override
	public String toString() {
		return "Batsman [runsScored=" + runsScored + ", ballsFaced=" + ballsFaced + ", noOfCenturies=" + noOfCenturies
				+ ", noOfHalfCenturies=" + noOfHalfCenturies + ", dissmissals=" + dissmissals + ", calStrikerate()="
				+ calStrikerate() + ",\n toString()=" + super.toString() + "]";
	}
public double calAverage() {
		System.out.println("=====Batsman Average====");
		return runsScored/dissmissals;
		
	}
	

	
}

package Inheritance;

public class Players {

	private int id;
	private String name;
	private int matches;
	public static int idgenerator = 0;
	
	
	public Players() {
		super();
		this.id = ++idgenerator;
	}
	
	public Players( String name, int matches) {
		super();
		this.id = ++idgenerator;
		this.name = name;
		this.matches = matches;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	
	
	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", matches=" + matches + "]";
	}

	public double calAverage() {
		System.out.println("====Cal Average====");
		return 0;
	}

	
}



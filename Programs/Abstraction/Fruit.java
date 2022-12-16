package Abstraction;

public abstract class Fruit {
	private String color;
	private String season;
	
	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Fruit(String color, String season) {
		super();
		this.color = color;
		this.season = season;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public abstract void prepare(); //abstract method


	@Override
	public String toString() {
		return "Fruit [color=" + color + ", season=" + season + "]";
	}

		
}

package Inheritance;

public class Bike extends Vehicle {
	private int displacement;
	private int gears;
	private int speed;
	
	public Bike() {
		super();
		}

		public Bike(String brand, String model, String registration, int displacement, int gears, int speed) {
		super(brand, model, registration);
		this.displacement = displacement;
		this.gears = gears;
		this.speed = speed;
	}



	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [displacement=" + displacement + ", gears=" + gears + ", speed=" + speed + ", toString()="
				+ super.toString() + "]";
	}
		
}
package Inheritance;

public class Car extends Vehicle{
	private int gears;
	private int speed;
	
	public Car() {
		super();
	}

	public Car(String brand, String model, String registration, int gears, int speed) {
		super(brand, model, registration);
		this.gears = gears;
		this.speed = speed;
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
		return "Car [gears=" + gears + ", speed=" + speed + ", toString()=" + super.toString() + "]";
	}
	
	
}

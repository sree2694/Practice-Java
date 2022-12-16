package Inheritance;

public class Vehicle {
	private String brand;
	private String model;
	private String registration;
	
	
	
	public Vehicle() {
		super();
		}

	public Vehicle(String brand, String model, String registration) {
		this.brand = brand;
		this.model = model;
		this.registration = registration;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String followSafety() {
		return "Wear Seatbelt/Helmet";
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", registration=" + registration + ", followSafety()="
				+ followSafety() + ", drive()=" + drive() + "]\n";
	}


	public boolean drive() {
		boolean selfdrive = true;
		if(selfdrive) 
		return selfdrive;
		else
		return false;
	}

}

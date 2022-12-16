package ObjectAndClasses;

public class Mobile {
	String brand;
	double price;
	int ram;
	String processor;
	String color;
	double size;
	double camera;
	int battery;
	public void receiveCall() {
		System.out.println("Receive call...");
	}
	public void makeCall() {
		System.out.println("Making a call...");
	}
	public void print() {
		System.out.println("Battery: "+battery);
		System.out.println("Brand: "+brand);
		System.out.println("price: "+price);
		System.out.println("ram: "+ram);
		System.out.println("processor: "+processor);
		System.out.println("color: "+color);
	}
}

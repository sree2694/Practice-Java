package ObjectAndClasses;

public class Traingle {

	private double side1;
	private double side2;
	private double side3;
	
	public Traingle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Traingle() {
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
	}

	
	

	public double getside1() {
		return this.side1;
	}

	public void setside1(double side1) {
		this.side1 = side1;
	}

	public double getside2() {
		return this.side2;
	}

	public void setside2(double side2) {
		this.side2 = side2;
	}

	public double getside3() {
		return this.side3;
	}

	public void setside3(double side1) {
		this.side3 = side3;
	}

	public double Perimeter() {
		return side1 + side2 + side3;
	}

	public double Area() {
		double s = Perimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public String print() {
		return "Side1: " + side1 + "\nSide2: " + side2 + "\nSide3: " + side3 + "\nPerimeter: " + Perimeter()
				+ "\nArea: " + Area();

	}
}

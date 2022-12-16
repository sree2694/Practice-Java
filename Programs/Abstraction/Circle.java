package Abstraction;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		
		return 3.14* radius *radius;
	}
	public double getPerimeter ()	{
		return 2 * 3.14 *radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getarea()=" + getArea() + ", getperimeter()=" + getPerimeter()
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}

	
	

}

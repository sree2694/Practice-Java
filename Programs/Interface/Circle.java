package Interface;

public class Circle implements Shape{

	private int radius;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * pi* radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}

	
}

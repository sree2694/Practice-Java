package Abstraction;

public abstract class Shape {
	private String color;
	private boolean filled;
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}

}

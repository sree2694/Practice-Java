package Abstraction;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle(String color, boolean filled, int length, int breadth) {
		super(color, filled);
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public double getArea()
    {
        return length * breadth;
    }

   public double getPerimeter()
    {
        return 2 * (length + breadth);
    }
@Override
public String toString() {
	return "Rectangle [length=" + length + ", breadth=" + breadth + ", getArea()=" + getArea() + ", getPerimeter()="
			+ getPerimeter() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
}


}

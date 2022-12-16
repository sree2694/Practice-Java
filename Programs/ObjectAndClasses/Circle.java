package ObjectAndClasses;

public class Circle {
	public double radius;
	public int id;
	
	public Circle() {
		this.id =0;
		this.radius =0;
	}
	
	public Circle(int id, double radius) {
		this.id =id;
		this.radius =radius;
	}
	
	public static final double pi = 3.14;
	public double area() {
		double area =0;
		area = pi * radius *radius;
		return area;
	}
	public double perimeter ()	{
		return 2 * pi *radius;
	}
	public String print() {
		return "Id: "+id+"\nRadius: "+radius+"\nArea: "+area()+"\nPerimeter: "+perimeter();
		
	}
		
}



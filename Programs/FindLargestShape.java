

public class FindLargestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 4);
		Circle c = new Circle(3.5);
		System.out.println("Rectangle Area : " + r.getRectangleArea());
        System.out.println("Circle Area : " + c.getCircleArea());
        
        if(r.getRectangleArea()>c.getCircleArea()) {
        	System.out.println("LargestArea is Rectangle : "+r.getRectangleArea());
        }
        else
        	System.out.println("LargestArea is Circle : "+c.getCircleArea());
	}

}

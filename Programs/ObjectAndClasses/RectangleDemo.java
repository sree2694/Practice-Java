package ObjectAndClasses;

public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 5);
		System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
	}

}

package ObjectAndClasses;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 12;
		c1.id = 1;
		//c1.radius = 5;
		System.out.println(c1.print());
		
			
		Circle c2 = new Circle();
		//c2.radius = 5;
		//c2.id = 2;
		System.out.println("==========");
		System.out.println("\n"+c2.print());
		//System.out.println(c1);
		
		System.out.println("==========");
		Circle c3 = new Circle(3,10);
		System.out.println(c3.print());
	}

}

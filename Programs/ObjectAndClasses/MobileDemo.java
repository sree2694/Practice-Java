package ObjectAndClasses;

public class MobileDemo {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.battery = 3200;
		m1.brand = "Moto";
		m1.camera = 20;
		m1.color = "Black";
		m1.price = 13000;
		m1.processor = "Snapdragon 420";
		m1.ram = 4;
		m1.size = 5.54;
		
	//	System.out.println("Battery: "+m1.battery);
	//	System.out.println("Brand: " +m1.brand);
	//	System.out.println("Price: "+m1.price);

		m1.receiveCall();
		m1.makeCall();
		m1.print();
		
		Mobile m2 = new Mobile();
		m2.battery = 5000;
		m2.brand = "Samsung";
		m2.camera = 5.2;
		m2.color ="Grey";
		m2.price = 7000;
		m2.processor = "Quadcore";
		System.out.println();
	//	System.out.println("Friends Mobile");
	//	System.out.println("Battery: "+m2.battery);
	//	System.out.println("Brand: "+m2.brand);
		System.out.println();
		
		m2.print();

	}

}

package ObjectAndClasses;

public class TraingleDemo {

	public static void main(String[] args) {
		Traingle tri = new Traingle(1,2,3);
		System.out.println(tri.print());
		
		Traingle t2 = new Traingle();
		t2.setside1(2);
		t2.setside2(3);
		t2.setside3(5);
		System.out.println(t2.print());
			}
	
	
}

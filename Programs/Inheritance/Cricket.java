package Inheritance;

public class Cricket {

	public static void main(String[] args) {
		Batsman b1 = new Batsman("Sachin",463, 18000, 21367,49, 96, 3000);
		System.out.println(b1);
		
		System.out.println("ID: "+b1.getId());
		
		Bowler b0 = new Bowler("Sachin",43, 36, 1, 31);
		System.out.println(b0);
		
		System.out.println(b1.calAverage());
		
		Players p1 = new Batsman("Dhoni",343, 10561, 12052, 10, 71, 50);
		System.out.println(p1.calAverage());
		
		Bowler b2 = new Bowler("Sachin",43, 36, 1, 31);
		System.out.println(b2.calAverage());
	}

}

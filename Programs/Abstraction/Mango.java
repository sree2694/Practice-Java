package Abstraction;

public class Mango extends Fruit{

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, String season) {
		super(color, season);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
			System.out.println("Season: "+getSeason()+"\nColor: "+getColor());
			System.out.println("Cut the fruit");
		
	}


}

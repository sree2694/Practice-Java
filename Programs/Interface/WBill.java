package Interface;

public class WBill implements Bill {

	private int NoofLitr;
	public static final double charge = 3;
	
	public WBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WBill(int noofLitr) {
		super();
		NoofLitr = noofLitr;
	}

	public double getNoofLitr() {
		return NoofLitr;
	}

	
	public static double getCharge() {
		return charge;
	}

	@Override
	public double calcBill() {
		
		return NoofLitr*charge;
	}

	@Override
	public void displayBill() {
		// TODO Auto-generated method stub
	System.out.println("NoofLitr=" + NoofLitr +  ", calcBill()=" + calcBill());	
	}
	
}

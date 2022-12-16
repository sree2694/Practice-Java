package Interface;

public class Electricity implements Bill{
	
	public static final int unitcharge=5;
	private int noofunits;

	
	public Electricity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electricity(int noofunits) {
		super();
		this.noofunits = noofunits;
	}

	public int getNoofunits() {
		return noofunits;
	}

	public void setNoofunits(int noofunits) {
		this.noofunits = noofunits;
	}

	public static int getUnitcharge() {
		return unitcharge;
	}

	@Override
	public double calcBill() {
		// TODO Auto-generated method stub
		return unitcharge * noofunits;
	}

	@Override
	public void displayBill() {
		// TODO Auto-generated method stub
		System.out.println("Electricity [noofunits=" + noofunits + ", calcBill()=" + calcBill() + "]");
	}

	

}

package Bank;

public class ICICI implements Bank {
	private static final double ROI = 8.5;
	Customer cust;
	
	public ICICI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICI(Customer cust) {
		super();
		this.cust = cust;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public static double getRoi() {
		return ROI;
	}

	@Override
	public double calROI() {
		// TODO Auto-generated method stub
		return cust.getInvestment() * cust.getTenure() * ROI / 100;
	}

	@Override
	public void displayROI() {
		// TODO Auto-generated method stub
		System.out.println("ICICI [cust=" + cust + ", getCust()=" + getCust() + "]");
	}

}

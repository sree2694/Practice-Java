package Bank;

public class SBI implements Bank {
	
	private static final double ROI = 7.8;
	Customer cust;
	
	public SBI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SBI(Customer cust) {
		super();
		this.cust = cust;
	}

	public static double getRoi() {
		return ROI;
	}

	@Override
	public double calROI() {
		
		return cust.getInvestment() * cust.getTenure() * ROI / 100;
	}

	@Override
	public void displayROI() {
		System.out.println("SBI [cust=" + cust + ", calROI()=" + calROI() + "]");		
	}


}

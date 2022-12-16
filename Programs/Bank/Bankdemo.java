package Bank;

public class Bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer(1178787, "saving", 50000, 50);
		SBI sbi = new SBI(c1);
		sbi.displayROI();
		
		ICICI icici = new ICICI(c1);
		icici.displayROI();
	}

}

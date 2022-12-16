package cabcustomerproblem;

public class CabCustomeServiceTester {
	public static void main(String[] args) {
		CabCustomer cust1 = new CabCustomer(1, "Bhanu", "Mehdipatnam", "Gandimaisamma", 26, 98987666);
		CabCustomer cust2 = new CabCustomer(2, "Bhanu", "Mehdipatnam", "Gandimaisamma", 20, 989876669);
		CabCustomer cust3 = new CabCustomer(3, "Bhanu", "Mehdipatnam", "Gandimaisamma", 14, 995930507);
		CabCustomerService service = new CabCustomerService();
		service.addCabCustomer(cust1);
		service.addCabCustomer(cust2);
		service.addCabCustomer(cust3);
		for (CabCustomer s : service.getCustomerList())
			System.out.println(s);
		System.out.println(service.isFirstCustomer(cust3));
		System.out.println(service.calculateBill(cust1));
		System.out.println(service.printBill(cust3));
	}
}

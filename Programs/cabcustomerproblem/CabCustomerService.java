package cabcustomerproblem;

import java.util.ArrayList;

public class CabCustomerService {

	// TODO Auto-generated method stub
	private ArrayList<CabCustomer> customerList = new ArrayList<>();

	public ArrayList<CabCustomer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<CabCustomer> customerList) {
		this.customerList = customerList;
	}

	public void addCabCustomer(CabCustomer obj) {
		customerList.add(obj);
	}

	public boolean isFirstCustomer(CabCustomer obj) {
		for (CabCustomer C : customerList) {
			if (obj.getPhoneno() == C.getPhoneno())
				return false;
		}

		return true;
	}

	public double calculateBill(CabCustomer obj) {
		if (isFirstCustomer(obj))
			return 0.0;
		else if (obj.getDistance() <= 4)
			return 80.0;
		else
			return 80.0 + ((obj.getDistance() - 4) * 6);

	}

	public String printBill(CabCustomer obj) {
		return obj.getCustomerName() + "Please Pay your Bill of Rs." + calculateBill(obj);
	}
}
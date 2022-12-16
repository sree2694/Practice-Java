package cabcustomerproblem;

public class CabCustomer {
	private int custId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private long phoneno;

	public CabCustomer() {
		super();
	}

	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			long phoneno) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phoneno = phoneno;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phoneno=" + phoneno + "]";
	}


}

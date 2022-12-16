package Association;

public class Address {
	private String houseno;
	private String streetname;
	private String landmark;
	private String city;
	private String state;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String houseno, String streetname, String landmark, String city, String state, int pincode) {
		super();
		this.houseno = houseno;
		this.streetname = streetname;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", streetname=" + streetname + ", landmark=" + landmark + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}

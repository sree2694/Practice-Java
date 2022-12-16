package Bank;

public class Customer {
	private long Acountno;
	private String Saving;
	private long Investment;
	private int tenure;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long acountno, String saving, long investment, int tenure) {
		super();
		Acountno = acountno;
		Saving = saving;
		Investment = investment;
		this.tenure = tenure;
	}

	public long getAcountno() {
		return Acountno;
	}

	public void setAcountno(long acountno) {
		Acountno = acountno;
	}

	public String getSaving() {
		return Saving;
	}

	public void setSaving(String saving) {
		Saving = saving;
	}

	public long getInvestment() {
		return Investment;
	}

	public void setInvestment(long investment) {
		Investment = investment;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "Customer [Acountno=" + Acountno + ", Type=" + Saving + ", Investment=" + Investment + ", tenure="
				+ tenure + "]";
	}
	
	
	
}

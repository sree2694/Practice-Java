package Association;

public class IdCard {

	int idNo;
	String bloodGrp;
	int emergencyNo;
	public IdCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IdCard(int idNo, String bloodGrp, int emergencyNo) {
		super();
		this.idNo = idNo;
		this.bloodGrp = bloodGrp;
		this.emergencyNo = emergencyNo;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public String getBloodGrp() {
		return bloodGrp;
	}
	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
	public int getEmergencyNo() {
		return emergencyNo;
	}
	public void setEmergencyNo(int emergencyNo) {
		this.emergencyNo = emergencyNo;
	}
	@Override
	public String toString() {
		return "IdCard [idNo=" + idNo + ", bloodGrp=" + bloodGrp + ", emergencyNo=" + emergencyNo + "]";
	}
	
}

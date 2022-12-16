package Abstraction;

public class Class11 extends Student {
	private int t_P;
	private int t_C;
	private int t_M;
	private int p_P;
	private int p_C;
	private int p_M;
	private int eng;
	private int hin;
	
	
	public Class11() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Class11(int t_P, int t_C, int t_M, int p_P, int p_C, int p_M, int eng, int hin) {
		super();
		this.t_P = t_P;
		this.t_C = t_C;
		this.t_M = t_M;
		this.p_P = p_P;
		this.p_C = p_C;
		this.p_M = p_M;
		this.eng = eng;
		this.hin = hin;
	}


	public int getT_P() {
		return t_P;
	}


	public void setT_P(int t_P) {
		this.t_P = t_P;
	}


	public int getT_C() {
		return t_C;
	}


	public void setT_C(int t_C) {
		this.t_C = t_C;
	}


	public int getT_M() {
		return t_M;
	}


	public void setT_M(int t_M) {
		this.t_M = t_M;
	}


	public int getP_P() {
		return p_P;
	}


	public void setP_P(int p_P) {
		this.p_P = p_P;
	}


	public int getP_C() {
		return p_C;
	}


	public void setP_C(int p_C) {
		this.p_C = p_C;
	}


	public int getP_M() {
		return p_M;
	}


	public void setP_M(int p_M) {
		this.p_M = p_M;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getHin() {
		return hin;
	}


	public void setHin(int hin) {
		this.hin = hin;
	}


	@Override
	public double findpercentage() {

	return (t_P + t_C + t_M + p_P + p_C + p_M+ eng + hin)/800;
	}


	@Override
	public String toString() {
		return "Class11 [t_P=" + t_P + ", t_C=" + t_C + ", t_M=" + t_M + ", p_P=" + p_P + ", p_C=" + p_C + ", p_M="
				+ p_M + ", eng=" + eng + ", hin=" + hin + ", findpercentage()=" + findpercentage() + "]";
	}

}

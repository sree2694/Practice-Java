package Association;

public class Student {
	private String name;
	private final IdCard icard;

	public Student(){
		super();
	icard = new IdCard();
	}

	public Student(String name, IdCard icard) {
		super();
		this.name = name;
		this.icard = icard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdCard getIcard() {
		return icard;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", icard=" + icard + "]";
	}

}

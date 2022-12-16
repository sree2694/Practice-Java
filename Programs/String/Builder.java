package String;
public class Builder {

	public static void main(String[] args) {
		StringBuilder random = new StringBuilder(" Hello ");
		random.append(" Have a Good Day!");
		random.delete(15, 21);
		
		System.out.println(random);
		System.out.println(random.length());
	}

}

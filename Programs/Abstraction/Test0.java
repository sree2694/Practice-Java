package Abstraction;

public class Test0 {

	public static void main(String[] args) {
		Child ch1 = new Child();
		ch1.printInstace();
		ch1.printStatic();

		System.out.println("=========");
		Parent p = new Child();
		p.printInstace();
		p.printStatic();

	}

}

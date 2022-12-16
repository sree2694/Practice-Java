package Arrays;

public class MarksDemo {

	public static void main(String[] args) {
		int marks[] = {64,77,84,28,56};
		int sum= 0;
		for(int counter= 0; counter<marks.length; counter++) {
			System.out.println(marks[counter]);
			sum = sum +marks[counter];
		}
		System.out.println("Sum of all 5 subject marks:"+sum);
	}

}

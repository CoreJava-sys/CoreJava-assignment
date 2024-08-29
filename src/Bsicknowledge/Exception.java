package Bsicknowledge;

public class Exception {

	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println("element of index 3: " + numbers[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}

	}
}

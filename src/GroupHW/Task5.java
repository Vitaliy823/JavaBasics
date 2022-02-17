package GroupHW;

public class Task5 {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?
		int a = 45;
		int b = 12;
		System.out.println("Before a=" + a + "  b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After a=" + a + " b=" + b);
	}
}

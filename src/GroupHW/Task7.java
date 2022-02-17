package GroupHW;

public class Task7 {

	public static void main(String[] args) {
    //Write a Java Program to print the first 10 numbers of Fibonacci series.
		int a = 0, b = 1, c = 0;
		System.out.print("The first 10 numbers of Fibonacci is: ");
		for (int i = 0; i < 10; i++) {
			c = b + a;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}

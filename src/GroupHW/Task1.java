package GroupHW;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] oneD = new int[5];
		int sum = 0;
		for (int i = 0; i < oneD.length; i++) {
			System.out.println("Please enter number");
			oneD[i] = input.nextInt();
		}
		input.close();
		for (int i = 0; i < oneD.length; i++) {
			sum = sum + oneD[i];
		}
		System.out.println("Sum of entered numbers is " + sum);
	}
}

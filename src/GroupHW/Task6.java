package GroupHW;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(num + " is not prime number");
		} else {
			System.out.println(num + " is prime number");
		}

	}

}

package com.syntax.class10;

public class HW4 {

	public static void main(String[] args) {

		// From an array of integer elements find the largest number.

		int[] number = {-100, 45, 100, 32 };

		int largest = number[0];

		for (int n = 1; n < number.length; n++) {

			if (number[n] > largest) {

				largest = number[n];
			}
		}

		System.out.println(largest);

		largest = number[0];

		for (int num : number) {
			if (num > largest) {
				largest=num;
			}
		}
		
		System.out.println(largest);

	}
}

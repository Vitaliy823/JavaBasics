package com.syntax.class07;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		int price = 3;
		Scanner input = new Scanner(System.in);
		System.out.println("Please pay for coffee");
		int paid = input.nextInt();

		while (price != paid) {
			if (paid < 3) {
				System.out.println("Please give more");
				paid = input.nextInt();

			} else {
				System.out.println("Please give less");
			paid = input.nextInt();
			}
		}
		System.out.println("Please enjoy your coffee");
	}

}

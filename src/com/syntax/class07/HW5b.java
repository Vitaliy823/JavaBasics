package com.syntax.class07;

import java.util.Scanner;

public class HW5b {

	public static void main(String[] args) {
		int price = 3;
		Scanner input = new Scanner(System.in);
		System.out.println("Please pay for coffee");
		int paid;
		do {
			paid = input.nextInt();
			if (paid < 3) {
				System.out.println("Please pay more");
			} else {
				System.out.println("Please pay less");
			}
		} while (price != paid);
		System.out.println("Please enjoy your coffee");
	}

}

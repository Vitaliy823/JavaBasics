package com.syntax.class05;

import java.util.Scanner;

public class HW1b {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter day");
		int day = input.nextInt();
		if (day >= 1 && day <= 5) {
			System.out.println("It is weekday");
		} else if (day >= 6 || day <= 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
	}

}

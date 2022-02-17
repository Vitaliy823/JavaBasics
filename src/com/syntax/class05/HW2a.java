package com.syntax.class05;

import java.util.Scanner;

public class HW2a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = input.nextInt();
		if (num >= 1 && num <= 10) {
			System.out.println("small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("large");
		} else {
			System.out.println("out of range");
		}

	}

}

package com.syntax.class04;

public class HW5 {

	public static void main(String[] args) {
		int years = 18;
		int salary = 40000;

		if (years >= 5) {
			System.out.println("eligable for bonus");
			if (salary > 50000) {
				System.out.println("Bonus 5000");
			} else {
				System.out.println("Bonus 3000");
			}
		} else {
			System.out.println("Not eligable");
		}

	}

}

package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		int age = 18;
		int weight = 120;

		if (age >= 18) {
			System.out.println("eligable check weight");
			if (weight > 110) {
				System.out.println("You are eligable");
			} else {
				System.out.println("You are not eligable by weight");
			}
		} else {
			System.out.println("not eligable");
		}
	}
}

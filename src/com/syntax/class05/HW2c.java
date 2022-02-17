package com.syntax.class05;

import java.util.Scanner;

public class HW2c {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter quiz score");
		int quiz = input.nextInt();
		System.out.println("Please enter mid term score");
		int mid = input.nextInt();
		System.out.println("Please enter final score");
		int fin = input.nextInt();
		int score = (quiz + mid + fin) / 3;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 70 && score < 90) {
			System.out.println("B");
		} else if (score >= 50 && score < 70) {
			System.out.println("C");
		} else if (score < 50) {
			System.out.println("F");

		}

	}

}

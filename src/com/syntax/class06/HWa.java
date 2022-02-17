package com.syntax.class06;

import java.util.Scanner;

public class HWa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter grade");
		char grade = input.next().charAt(0);
		String answer;
		switch (grade = Character.toUpperCase(grade)) {
		case 'A':
			answer = "Excellent";
			break;
		case 'B':
			answer = "Good";
			break;
		case 'C':
			answer = "Average";
			break;
		case 'D':
			answer = "Bad";
			break;
		default:
			answer = "Not Acceptable";
		}
		System.out.println("Your grage is " + grade + " " + answer);

	}

}

package com.syntax.class06;

import java.util.Scanner;

public class HWb2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number 1");
		int n1 = input.nextInt();
		System.out.println("Please enter operator");
		String operator = input.next();
		System.out.println("Please enter number 2");
		int n2 = input.nextInt();
		int n = 0;
		switch (operator) {
		case "+":
			n = n1 + n2;
			break;
		case "-":
			n = n1 - n2;
			break;
		case "*":
			n = n1 * n2;
			break;
		case "/":
			n = n1 / n2;
			break;
		}
		System.out.println(n1 + operator + n2 + "=" + n);

	}

}

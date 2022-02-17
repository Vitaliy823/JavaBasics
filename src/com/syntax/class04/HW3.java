package com.syntax.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Your city?");
		String city = input.nextLine();
		System.out.println("Enter temperature");

		double temp = input.nextDouble();
		temp = (temp - 32) / 2;
		System.out.println("temperature in city " + city + " is " + temp + " C");

	}

}

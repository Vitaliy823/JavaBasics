package com.syntax.class05;

import java.util.Scanner;

public class HW1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height = input.nextInt();
		if (height < 60) {
			System.out.println("short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("medium");
		} else {
			System.out.println("tall");
		}

	}

}

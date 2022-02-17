package com.syntax.class05;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter day");
		String day=input.nextLine();
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("no class");
		} else if (day.equals("Thuesday") || day.equals("Wednesday")) {
			System.out.println("manual");
		} else if (day.equals("Thursday")) {
			System.out.println("rewiew");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Java");
		}
	}

}

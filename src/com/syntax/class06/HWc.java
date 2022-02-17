package com.syntax.class06;

import java.util.Scanner;

public class HWc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Is there anything on Sale?");
		String sale = input.next();
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price?");
			double price = input.nextDouble();
			int discount;
			double fprice = 0;
			if (price > 0 && price < 20) {
				discount = 10;
				fprice = price * 0.9;
			} else if (price > 20 && price < 100) {
				discount = 20;
				fprice = price * 0.8;
			} else if (price > 100 && price < 500) {
				discount = 30;
				fprice = price * 0.7;
			} else {
				discount = 50;
				fprice = price * 0.5;
			}
			System.out.println(
					"After discount " + discount + "% the price of the item reduce from " + price + " to " + fprice);
		}else {
			System.out.println("I am not going for shopping");
		}

	}

}

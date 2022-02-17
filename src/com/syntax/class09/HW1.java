package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		String[] cars = { "Mercedes-Benz", "BMW", "Audi", "Porshe", "Ferrari", "Ford" };
		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		System.out.println("------------");
		for (int a = 0; a < cars.length; a++) {
			System.out.print(cars[a] + " ");
		}

	}

}

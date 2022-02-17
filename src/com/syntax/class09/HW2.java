package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		String[] animals = { "cat", "dog", "horse", "mouse", "monkey" };
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("----------");
		for (int a = 0; a < animals.length; a++) {
			System.out.println(animals[a]);
		}
	}

}

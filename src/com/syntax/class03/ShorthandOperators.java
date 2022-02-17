package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {

		// +, -, *, /, %

		int num = 100;
		num = num + 100;
		System.out.println(num);// 200

		num += 100; // this exact means --> this num=num+100
		System.out.println(num);// 300

		num -= 20;
		System.out.println(num);// 280

		num /= 10; // shorter way of num=num/10
		System.out.println(num);// 28

		num %= 3;
		System.out.println(num);// 1

		// 3
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);
		
		// 4
		int cake = 25;
		cake %= 7;
		System.out.println(cake);
	}
}

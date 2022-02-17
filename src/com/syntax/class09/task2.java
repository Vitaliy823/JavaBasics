package com.syntax.class09;

public class task2 {

	public static void main(String[] args) {
		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grade[1]);
		//2nd way
		char[] grade2;
		grade2 = new char[5];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[1]);
	}

}

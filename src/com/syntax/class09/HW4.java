package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 70, 12, 230 };
		int largest = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		System.out.println(largest);

	}

}

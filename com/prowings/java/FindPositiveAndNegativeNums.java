package com.prowings.java;

import java.util.Scanner;

public class FindPositiveAndNegativeNums {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter How many numbers You want take");
		int i = sc.nextInt();
		int[] nums = new int[i];
		System.out.println("Enter " + i + " Numbers");
		for (int j = 0; j < nums.length; j++) {
			nums[j] = sc.nextInt();
		}
		positiveNumbers(nums);
		negativeNumbers(nums);

	}

	private static void positiveNumbers(int[] nums) {
		int[] positive = new int[nums.length];
		System.out.println("Positive Numbers :-");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				positive[i] = nums[i];
				System.out.println(positive[i]);
			}
		}
	}

	private static void negativeNumbers(int[] nums) {
		int[] negative = new int[nums.length];
		System.out.println("Nagative Numbers :-");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0) {
				negative[i] = nums[i];
				System.out.println(negative[i]);
			}
		}

	}
}

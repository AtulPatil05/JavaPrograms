package com.prowings.array;

public class SumOfArray {

	public static void main(String[] args) {
		int[] nums = { 12, 34, 56, 3, 5, 8 };
		int res = findSumOfArray(nums);
		System.out.println("Sum of Array is :- " + res);
	}

	public static int findSumOfArray(int[] nums) {

		int sum = 0;
		for (int i : nums)
			sum += i;
		return sum;
	}
}

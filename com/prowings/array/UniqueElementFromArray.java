package com.prowings.array;

import java.util.Arrays;

public class UniqueElementFromArray {

	public UniqueElementFromArray() {
	}

	public static int[] findUniqueElements(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					nums[j] = 0;
			}
		}
		int counter = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 0)
				counter++;
		int[] unique = new int[counter];
		int count = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 0)
				unique[count++] = nums[i];
		return unique;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 5, 6, 3, 7, 5, 5, 3, 3, 2, 4, 5, 7, 4, 2, 5, 2 };

		int[] result = findUniqueElements(nums);
		System.out.println(Arrays.toString(result));
	}
}
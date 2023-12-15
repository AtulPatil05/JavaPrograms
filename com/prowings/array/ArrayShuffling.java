package com.prowings.array;

import java.util.Arrays;

public class ArraySuffling {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		suffleArray(arr);
	}

	public static void suffleArray(int[] arr) {

		int value = 0;
		int length = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			if (true) {
				value = arr[length - 1];
				arr[length - 1] = arr[i];
				arr[i] = value;
				value = arr[length - 2];
				arr[length - 2] = arr[i + 1];
				arr[i + 1] = value;

			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

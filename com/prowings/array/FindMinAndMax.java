package com.prowings.array;

import java.util.Arrays;

public class FindMinAndMax {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 7, 9, 3, 8 };
		System.out.println("Input Array : " + Arrays.toString(arr));

		findMinMax(arr);
	}

	private static void findMinMax(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int value = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = value;
				}
			}
		}
		System.out.println("Maximum Number :- " + arr[arr.length - 1]);
		System.out.println("Minimum Number :- " + arr[0]);
	}
}
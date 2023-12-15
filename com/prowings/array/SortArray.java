package com.prowings.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] arr = { 6, 4, 3, 2, 9, 8, 7, 5, 1 };
		System.out.println("Input Array :- " + '\n' + Arrays.toString(arr));
		sortArray(arr);
	}

	public static void sortArray(int[] arr) {

		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					value = arr[j];
					arr[j] = arr[i];
					arr[i] = value;
				}
			}
		}
		System.out.println("Sorted Array :- " + '\n' + Arrays.toString(arr));
	}
}

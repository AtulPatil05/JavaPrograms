package com.prowings.array;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };

		int[] res = findDuplicates(arr);
		System.out.println("Unique Array " + Arrays.toString(res));

	}

	private static int[] findDuplicates(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
		int[] dup = new int[count];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dup[i] = arr[i];
					break;
				}
			}
		}
		return dup;
	}
}

package com.prowings.array;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 7, 7, 1, 1, 2, 3, 3 };

		int[] res = findDuplicates(arr);
		System.out.println("Duplicate Elements " + Arrays.toString(res));

	}

	private static int[] findDuplicates(int[] arr) {

		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			arr2[i] = arr[i];
		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			for (int j = i + 1; j < arr.length; j++)
				if (k < arr.length)
					if (arr[i] == arr[j]) {
						arr[j] = 0;
					}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr2[j]) {
					count++;
					break;
				}
			}
		}
		int[] dup = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr2[j]) {
					dup[index++] = arr[i];
					break;
				}
			}
		}
		return dup;
	}
}

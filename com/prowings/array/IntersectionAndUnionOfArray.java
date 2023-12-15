package com.prowings.array;

import java.util.Arrays;

public class IntersectionAndUnionOfArray {

	public static void main(String[] args) {

		int[] arr1 = { 5, 6, 7, 9, 10 };
		int[] arr2 = { 1, 2, 3, 4, 5, 5, 7, 10 };
		System.out.println("Input Array 1 :- " + '\n' + Arrays.toString(arr1));
		System.out.println("Input Array 2 :- " + '\n' + Arrays.toString(arr2));

		intersectionElements(arr1, arr2);
		unionElements(arr1, arr2);
	}

	public static void unionElements(int[] arr1, int[] arr2) {

		int[] merge = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, merge, 0, arr1.length);
		System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);

		for (int i = 0; i < merge.length; i++) {
			for (int j = i + 1; j < merge.length; j++) {
				if (merge[i] == merge[j])
					merge[j] = 0;
			}
		}
		int count = 0;
		for (int i = 0; i < merge.length; i++) {
			for (int j = 0; j < merge.length; j++) {
				if (merge[i] != 0) {
					count++;
					break;
				}
			}
		}
		int counter = 0;
		int[] union = new int[count];
		for (int i = 0; i < merge.length; i++) {
			for (int j = 0; j < merge.length; j++) {
				if (merge[i] != 0) {
					union[counter++] = merge[i];
					break;
				}
			}
		}
		System.out.println("Union Elements :- " + '\n' + Arrays.toString(union));
	}

	private static void intersectionElements(int[] arr1, int[] arr2) {

		int count = 0;
		boolean bln = false;
		int length = 0;
		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr2.length; j++)
				if (arr1[i] == arr2[j]) {
					count++;
					break;
				}
		int[] intersection = new int[count];
		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr2.length; j++)
				if (arr1[i] == arr2[j]) {
					intersection[length++] = arr1[i];
					bln = true;
					break;
				}
		if (bln)
			System.out.println("Intersection Elements :- " + '\n' + Arrays.toString(intersection));
		else
			System.out.println("There are No Intersection Elements");
	}
}

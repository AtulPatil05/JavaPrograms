package com.prowings.array;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter an Index From to Raotate ");
		int index = sc.nextInt();

		rotateAnArray(arr, index);

	}

	public static void rotateAnArray(int[] arr, int index) {

		int[] rotate = new int[arr.length];
		int countre = 0;
		for (int i = index - 1; i < arr.length; i++)
			rotate[countre++] = arr[i];
		for (int i = 0; i < index - 1; i++)
			rotate[countre++] = arr[i];
		System.out.println(Arrays.toString(rotate));
	}
}

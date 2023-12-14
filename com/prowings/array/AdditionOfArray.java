package com.prowings.array;

import java.util.Arrays;

public class AdditionOfArray {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
		int[] num2 = { 3, 2, 3, 4, 5, 6, 7 };

		System.out.println(Arrays.toString(additionOfArray(num1, num2)));

	}

	public static int[] additionOfArray(int[] num1, int[] num2) {
		int length = 0;
		int[] result = { 0 };
		if (num1.length >= num2.length) {
			length = num1.length;
			int[] res = new int[length];
			int[] num3 = new int[length];
			for (int i = 0; i < num2.length; i++) {
				num3[i] = num2[i];
			}
			int count = 0;
			for (int i = 0; i < length; i++) {
				num3[i] = num3[i] + num1[i];
				count++;
			}
			return num3;
		} else {
			length = num2.length;
			int[] res = new int[length];
			int[] num3 = new int[length];
			for (int i = 0; i < num1.length; i++) {
				num3[i] = num1[i];
			}
			int count = 0;
			for (int i = 0; i < length; i++) {
				res[count] = num3[i] + num2[i];
				count++;
			}
			return res;
		}
	}
}

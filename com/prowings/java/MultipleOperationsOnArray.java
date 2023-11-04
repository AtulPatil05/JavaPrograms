package com.prowings.java;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleOperationsOnArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		reverseOrder(new int[] { 7, 6, 5, 4, 3, 2 });
		squareOfElements(new int[] { 7, 6, 5, 4, 3, 2 });
		cubeOfElements(new int[] { 7, 6, 5, 4, 3, 2 });
		copyOneArrayToAnother(new int[] { 7, 6, 5, 4, 3, 2 });
		findPositiveNegativeNums(new int[] { -7, -6, 5, 4, 3, -2 });
		findValuesBtwin80To90(new int[] { 87, 66, 75, 84, 83, 92 });
		findSpecificNumber(new int[] { 1, 37, 45, 20, 30, 48, 59, 5 });
		replaceWithNumber(new int[] { 1, 37, 45, 20, 30, 48, 59, 5 });
		deleteElementReplaceWith0(new int[] { 7, 6, 5, 4, 3, 2 });
		deleteElementAdd0AtEnd(new int[] { 7, 6, 5, 4, 3, 2 });
	}

	private static void deleteElementAdd0AtEnd(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		System.out.println("Enter Number To Delete");
		int input = sc.nextInt();
		int[] counter = new int[num.length];
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != input) {
				counter[count] = num[i];
				count++;
			}
		}
		System.out.println("After Deletion :-" + '\n' + Arrays.toString(counter));
	}

	private static void deleteElementReplaceWith0(int[] num) {

		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		System.out.println("Enter Number To Search");
		int input = sc.nextInt();
		int replace = 0;
		int[] swap = { replace };
		for (int i = 0; i < num.length; i++) {
			if (num[i] == input) {
				System.out.println("Number is Found at Position :- " + (i + 1));
				num[i] = swap[0];

			}
		}
		System.out.println("After Repalcing 0 " + '\n' + Arrays.toString(num));
	}

	private static void replaceWithNumber(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		System.out.println("Enter Number To Search");
		int input = sc.nextInt();
		System.out.println("Enter Number To Replace");
		int replace = sc.nextInt();
		int[] swap = { replace };
		for (int i = 0; i < num.length; i++) {
			if (num[i] == input) {
				System.out.println("Number is Found at Position :- " + (i + 1));
				num[i] = swap[0];

			}
		}
		System.out.println("After Repalcing " + '\n' + Arrays.toString(num));
	}

	private static void findSpecificNumber(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		System.out.println("Enter Number To Search");
		int input = sc.nextInt();
		int[] replace = { 99 };
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == input) {
				System.out.println("Number Is Present at Position :-");
				num[i] = replace[0];
				System.out.println(i + 1);
				System.out.println("After Finding Element in Array :- " + '\n' + Arrays.toString(num));
				count++;
			}
		}
		if (count == 0)
			System.out.println("Number is Not Present");
	}

	private static void findValuesBtwin80To90(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		System.out.println("Numbers Between 80 to 90 :- ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 80 && num[i] <= 90)
				System.out.println(num[i]);
		}
	}

	private static void findPositiveNegativeNums(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		int countPos = 0;
		int countNeg = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0)
				countNeg++;
			else
				countPos++;
		}
		System.out.println(countPos + " :- Positive numbers");
		System.out.println(countNeg + " :- Negative numbers");
		int[] positive = new int[num.length];
		int[] negative = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0)
				negative[i] = num[i];
			else
				positive[i] = num[i];
		}
		System.out.println(Arrays.toString(positive));
		System.out.println(Arrays.toString(negative));
	}

	private static void copyOneArrayToAnother(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		int[] copyArray = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			copyArray[i] = num[i];
		}
		System.out.println("Copy Array :- " + '\n' + Arrays.toString(copyArray));
	}

	private static void cubeOfElements(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		int[] cube = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			cube[i] = num[i] * num[i] * num[i];
		}
		System.out.println("Cube of Array :- " + '\n' + Arrays.toString(cube));

	}

	private static void squareOfElements(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		System.out.println("Square of Every Element :- ");
		for (int i = 0; i < num.length; i++) {
			int res = num[i] * num[i];
			System.out.println(res);
		}
	}

	private static void reverseOrder(int[] num) {
		System.out.println("Original Array :- " + '\n' + Arrays.toString(num));
		int[] rev = new int[num.length];
		for (int i = num.length - 1, a = 0; i >= 0; i--, a++) {
			rev[a] = num[i];
		}
		System.out.println("Reverse Array :- " + '\n' + Arrays.toString(rev));
	}
}
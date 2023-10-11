package com.prowings.java;

import java.util.Scanner;

public class PrimeNumberRange {

	static Scanner scan = new Scanner(System.in);

	static boolean primeNumberRange(int checkNumber) {
 		if (checkNumber <= 1)
			return false;

 		for (int i = 2; i <= checkNumber / 2; i++) {
			if (checkNumber % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter Start Range : ");
		int startRange = scan.nextInt();
		System.out.println("Enter End Range : ");
		int endRange = scan.nextInt();
		System.out.println("Prime Numbers Are :-");
		for (int i = startRange; i < endRange; i++) {
			if (primeNumberRange(i)) {
				System.out.println(i);

			}
		}
	}
}

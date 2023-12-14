///// SWAPPING NUMBERS WITHOUT USING THIRD VARIABLE/////////
package com.prowings.java;

import java.util.Scanner;

class SwappingNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Before Swapping Numbers");
		System.out.println("Number A  :- " + num1);
		System.out.println("Number B  :- " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swapping Numbers");
		System.out.println("Number A  :- " + num1);
		System.out.println("Number B  :- " + num2);
	}
}
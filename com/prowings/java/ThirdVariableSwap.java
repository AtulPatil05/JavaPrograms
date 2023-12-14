///// SWAPPING NUMBERS USING THIRD VARIABLE/////////
package com.prowings.java;

import java.util.Scanner;

class ThirdVariableSwap {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Before Swapping Numbers");
		System.out.println("Number A  :- " + num1);
		System.out.println("Number B  :- " + num2);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping Numbers");
		System.out.println("Number A  :- " + num1);
		System.out.println("Number B  :- " + num2);
	}
}
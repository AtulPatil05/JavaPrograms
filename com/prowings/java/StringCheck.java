package com.prowings.java;

import java.util.Scanner;

public class StringCheck {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("Enter Boolean Value");
		boolean b = sc.nextBoolean();
		
		System.out.println(stringChecker(s, b));
	}

	private static char stringChecker(String s, boolean b) {
		char[] chArry = s.toCharArray();
		return (b == true) ? chArry[0] : chArry[chArry.length - 1];
	}

}

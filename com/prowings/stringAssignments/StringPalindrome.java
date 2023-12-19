package com.prowings.stringAssignments;

import java.util.Scanner;

public class StringPalindrome {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any String");
		String str = sc.next();
		System.out.println(isPalindrome(str));
	}

	public static String isPalindrome(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--)
			s += str.charAt(i);
		if (s.equals(str))
			return "Enter String is Palindrome ";
		else
			return "Enter String is Not Palindrome ";
	}
}
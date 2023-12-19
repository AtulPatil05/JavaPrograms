package com.prowings.stringAssignments;

import java.util.Scanner;

public class ReverseString {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any Word");
		String word = sc.next();
		System.out.println("Reverse String using Buffer : " + reverseString1(word));
		System.out.println("Reverse String using char[] : " + reverseString2(word));
		System.out.println("Reverse String using another String : " + reverseString3(word));
	}
	
	// Reverse String using String Buffer Method
	public static String reverseString1(String word) {
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		String s = new String(sb);
		return s;
	}

	// Reverse String using Char Array
	public static String reverseString2(String word) {
		char[] ch = word.toCharArray();
		int j =0;
		for(int i = word.length()-1;i>=0;i--)
			ch[j++] = word.charAt(i);
			return new String(ch);
	}

	// Reverse String using another String
	public static String reverseString3(String word) {
		String s = "";
		for (int i = word.length() - 1; i >= 0; i--)
			s += word.charAt(i);
		return s;
	}

}

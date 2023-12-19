package com.prowings.stringAssignments;

import java.util.Scanner;

public class ReplaceCharacters {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Any String");
		String str = sc.next();
		System.out.println("Enter old Character to be replace");
		char oldChar = sc.next().charAt(0);
		System.out.println("Enter new Character to get replace ");
		char newChar = sc.next().charAt(0);
		System.out.println(replaceCharchters(str, oldChar, newChar));
		System.out.println(replaceCharchters1(str, oldChar, newChar));
	}

	// Replace Characters using method
	public static String replaceCharchters(String str, char oldChar, char newChar) {

		return str.replace(oldChar, newChar);
	}

	// Replace Characters using Char[]
	public static String replaceCharchters1(String str, char oldChar, char newChar) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < ch.length; j++)
				if (oldChar == ch[i])
					ch[i] = newChar;
		}
		return new String(ch);
	}
}

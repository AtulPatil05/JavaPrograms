package com.prowings.stringAssignments;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String sentence = sc.nextLine();
		System.out.println("After Removing Spaces : " + removeSpaces(sentence));
		System.out.println("After Removing Spaces : " + removeSpaces1(sentence));
	}

// Reverse String Using Another String
	public static String removeSpaces1(String sentence) {
		String s = "";
		for (int i = 0; i < sentence.length(); i++)
			if (sentence.charAt(i) != ' ')
				s += sentence.charAt(i);
		return s;
	}

	// Reverse String Using Method
	public static String removeSpaces(String sentence) {
		return sentence.replace(" ", "");
	}
}

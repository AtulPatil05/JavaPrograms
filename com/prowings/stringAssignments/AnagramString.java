package com.prowings.stringAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter First String");
		String word1 = sc.nextLine();
		System.out.println("Enter Second String");
		String word2 = sc.nextLine();
		System.out.println(isAnagramOrNot(word1, word2));
	}

	public static String isAnagramOrNot(String word1, String word2) {
		char[] ch1 = word1.toCharArray();
		char[] ch2 = word2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s1 = new String(ch1);
		s1 = s1.replaceAll("[ ,-.]", "");
		String s2 = new String(ch2);
		s2 = s2.replaceAll("[ ,-.]", "");
		return s1.equals(s2) ? "String is Anagram" : "String is not Anagram";
	}
}
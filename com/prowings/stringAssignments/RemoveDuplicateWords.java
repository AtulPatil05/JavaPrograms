package com.prowings.stringAssignments;

import java.util.Scanner;

public class RemoveDuplicateWords {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Any Word");
		String word = sc.next();
		System.out.println("After Removing Duplicat Words :"+removeDuplicates(word));
	}

	public static String removeDuplicates(String word) {
		char[] ch = word.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (word.charAt(i) == ch[j])
					ch[j] = ' ';
			}
		}
		String s = new String(ch);
		s = s.replace(" ", "");
		return s;
	}
}
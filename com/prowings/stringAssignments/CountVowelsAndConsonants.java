package com.prowings.stringAssignments;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Word");
		String word = sc.next();
		word = word.toLowerCase();
		countVowels(word);
	}

	public static void countVowels(String word) {
		int countVowels = 0;
		int countConsonants = 0;
		char[] ch = word.toCharArray();
		for (int i = 0; i < word.length(); i++)
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			countVowels++;
		else
			countConsonants++;
		System.out.println("There are "+ countVowels +" Vowels in above Word");
		System.out.println("There are "+ countConsonants +" Consonanats in above Word");
	}
}
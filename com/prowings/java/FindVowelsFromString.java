package com.prowings.java;

import java.util.Scanner;

public class FindVowelsFromString {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String input = sc.nextLine();
		System.out.print("Total Vowels ");
		System.out.println("in above string :- "+countVowels(input));;
	}

	private static int countVowels(String input) {
		int count = 0;
		String s2 = input.toLowerCase();
		char[] ch = s2.toCharArray();
		for(int i =0;i<input.length();i++) {
			if(ch[i]=='a'||
					ch[i]=='e'||
					ch[i]=='i'||
					ch[i]=='o'||
					ch[i]=='u')
				count++;
		}
		return count;
	}

}

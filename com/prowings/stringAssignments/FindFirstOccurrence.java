package com.prowings.stringAssignments;

import java.util.Scanner;

public class FindFirstOccurrence {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter Character/String to find its index ");
		String ch = sc.next();
		str = str.replaceAll("[ ,.-]", "");
		System.out.println(ch + ": First Occurred at index :" + findFirstOccurence(str, ch));
	}

	public static int findFirstOccurence(String str,String ch) {
		return str.indexOf(ch)+1;
	}
}
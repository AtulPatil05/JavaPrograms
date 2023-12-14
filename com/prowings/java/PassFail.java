package com.prowings.java;

import java.util.*;

class PassFail {
	public static String marks(int marks) {
		if (marks >= 35) {
			return "Pass";
		} else {
			return "Fail";
		}
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Marks :- ");
		int marks = sc.nextInt();
		System.out.println("Remark :- " + marks(marks));
	}
}
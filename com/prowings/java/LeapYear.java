package com.prowings.java;

import java.util.Scanner;

class LeapYear {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int year = sc.nextInt();
		if (leapYear(year))
			System.out.println("Year is Leap");
		else
			System.out.println("Year is Not Leap");
	}

	public static boolean leapYear(int year) {
		return (year % 4 == 0) ? ((year % 100 == 0) && (year % 400 == 0)) ? true : false : false;
	}
}
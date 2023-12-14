package com.prowings.java;

import java.util.*;

public class GradeCalculator {
	static Scanner sc = new Scanner(System.in);

	public static String gradeCalculator(int[] marks) {
		int avg = 0;
		int sum = 0;
		for (int m : marks) {
			System.out.println("Enter Mark");
			m = sc.nextInt();
			sum += m;
		}
		System.out.println(sum);
		avg = sum / marks.length;
		System.out.println(avg);
		return avg <= 40 ? "C grade"
				: avg >= 40 && avg <= 60 ? "B grade" : avg >= 60 && avg <= 100 ? "A grade" : "invalid grade";
	}

	public static void main(String[] args) {
		System.out.println("Enter How many Subjects are there");
		int i = sc.nextInt();

		int[] marks = new int[i];

		System.out.println("grade is :- " + gradeCalculator(marks));
	}
}

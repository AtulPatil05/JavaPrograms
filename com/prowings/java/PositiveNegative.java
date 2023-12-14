package com.prowings.java;

import java.util.*;

class PositiveNegative {
	public static String isPositiveOrNot(int num) {
		if (num >= 0) {
			if (num == 0) {
				return "Number is Zero";
			} else {
				return "Number is Positive";
			}
		} else {
			return "Number is Negative";
		}

	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = sc.nextInt();
		System.out.println(num + ":- " + isPositiveOrNot(num));
	}

}
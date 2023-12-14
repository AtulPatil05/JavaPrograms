package com.prowings.java;

import java.util.*;

class SmallestFromFour {
	public static String largestNumber(int num1, int num2, int num3, int num4) {
		if ((num1 < num2) && (num1 < num3) && (num1 < num4)) {
			return "Num1 is Small";
		} else if ((num2 < num1) && (num2 < num3) && (num2 < num4)) {
			return "Num2 is Small";
		} else if ((num3 < num1) && (num3 < num2) && (num3 < num4)) {
			return "Num3 is Small";
		} else if ((num4 < num1) && (num4 < num2) && (num4 < num3)) {
			return "Num4 is Small";
		}

		else if ((num4 == num1) && (num4 == num2) && (num4 == num3)) {
			return "All are Same";
		}

		else if ((num2 == num1) && (num2 == num3) && (num2 < num4)) {
			return "Num1 and Num2 and num3 is Smaller than num4";
		} else if ((num2 == num1) && (num2 == num4) && (num2 < num3)) {
			return "Num1 and Num4 and num2 is Smaller than num3";
		} else if ((num2 == num3) && (num2 == num4) && (num2 < num1)) {
			return "Num2 and Num3 and num4 is Smaller than num1";
		} else if ((num3 == num4) && (num3 == num1) && (num3 < num2)) {
			return "Num1 and Num3 and num4 is Smaller than num2";
		}

		else if ((num1 == num2) && (num3 == num4) && (num2 < num4)) {
			return "Num1 and Num2 is Smaller than num4 and num3";
		} else if ((num1 == num3) && (num2 == num4) && (num1 < num4)) {
			return "Num1 and num3 is Smaller than num4 and num2";
		} else if ((num1 == num4) && (num3 == num2) && (num1 < num3)) {
			return "Num1 and Num4 is Smaller than num2 and num3";
		} else if ((num2 == num3) && (num1 == num4) && (num2 < num1)) {
			return "Num2 and Num3 is Smaller than num1 and num4";
		}

		else if ((num1 == num2) && (num1 < num3) && (num1 < num4)) {
			return "num1 and num2 is smallest";
		} else if ((num1 == num3) && (num1 < num2) && (num1 < num4)) {
			return "num1 and num3 is smallest";
		} else if ((num1 == num4) && (num1 < num3) && (num1 < num2)) {
			return "num1 and num4 is smallest";
		} else if ((num2 == num3) && (num2 < num1) && (num2 < num4)) {
			return "num2 and num3 is smallest";
		} else if ((num2 == num4) && (num2 < num3) && (num2 < num1)) {
			return "num1 and num2 is smallest";
		} else if ((num3 == num4) && (num3 < num1) && (num3 < num2)) {
			return "num3 and num4 is smallest";
		}

		else {
			return "Invalid number";
		}
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Enter num3");
		int num3 = sc.nextInt();
		System.out.println("Enter num4");
		int num4 = sc.nextInt();
		System.out.println(largestNumber(num1, num2, num3, num4));
	}
}
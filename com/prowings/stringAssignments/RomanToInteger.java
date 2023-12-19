package com.prowings.stringAssignments;

import java.util.Scanner;

public class RomanToInteger {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Roman Number");
		String romanNumber = sc.next();
		romanNumber = romanNumber.toUpperCase();
		System.out.println("Integer value of "+romanNumber+
				" :"+romanToInteger(romanNumber));
	}

	public static String romanToInteger(String romanNumber) {
		int currentNumber = 0;
		int previousNumber = 0;
		int result = 0;
		for(int i = romanNumber.length()-1;i>=0;i--) {
			switch(romanNumber.charAt(i)) {
			case 'I': currentNumber = 1;break;
			case 'V': currentNumber = 5;break;
			case 'X': currentNumber = 10;break;
			case 'L': currentNumber = 50;break;
			case 'C': currentNumber = 100;break;
			case 'D': currentNumber = 500;break;
			case 'M': currentNumber = 1000;break;
			default:
				return "Invalid Roman Number";
			}
			if(currentNumber>=previousNumber)
				result += currentNumber;
			else
				result -= currentNumber;
				previousNumber = currentNumber;
		}
		return String.valueOf(result);
	}
}
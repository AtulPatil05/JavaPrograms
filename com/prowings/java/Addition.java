package com.prowings.java;

import java.util.Scanner;

class Addition {
	static Scanner sc = new Scanner(System.in);

	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		int res = addition(a, b);
		System.out.println("Addition is :- " + res);
	}
}
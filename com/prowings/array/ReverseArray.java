package com.prowings.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		revrseArray(new int[] {3,5,6,7,8});
	}

	private static void revrseArray(int[] num) {
		int length = 0;
		int[] dp = new int[num.length];
		for(int i=num.length-1;i>=0;i--) {
			dp[length++]=num[i];
		}
		System.out.println(Arrays.toString(dp));
	}
}
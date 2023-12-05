package com.prowings.java;

public class HarmonicSeries {
	public static void main(String[] args) {
		int n = 10; // The number of terms in the harmonic series
		double sum = 0.0;
		
		for (int i = 1; i <= n; i++) 
			sum = 1.0 /i ;
		System.out.println("The sum of the first " + n + " terms of the harmonic series is: " + sum);
	}

}

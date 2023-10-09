package com.prowings.java;
import java.util.*;
class EvenOrOdd
{
	public static String isEvenOrNot(int number)
	{
		if(number%2==0)
		{
			if (number!=0)
			  return "Number is Even";
		    else
			  return "Number is Neutral";
		}
		else
		{
		  return "Number is Odd";
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int number = sc.nextInt();
		System.out.println(number+ " " +isEvenOrNot(number));
	}
}
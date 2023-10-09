package com.prowings.java;
import java.util.*;
class LargestFromThree
{
	public static String largestNumber(int num1,int num2,int num3)
	{
		if((num1>num2) && (num1>num3))
		{
			return "Num1 is Large";
		}
		else if ((num2>num1) && (num2>num3))
		{
			return "Num2 is Large";
		}
		else if ((num3>num1) && (num3>num2))
		{
			return "Num3 is Large";
		}
		else if ((num2==num1) && (num2>num3))
		{
			return "Num1 and Num2 is Larger than num3";
		}
		else if ((num3==num1) && (num3>num2))
		{
			return "Num1 and Num3 is Larger than num2";
		}
		else if ((num3==num2) && (num2>num1))
		{
			return "Num2 and Num3 is Larger than num1";
		}
		else if ((num1==num2)&&(num2==num3))
		{
			return "All are Same";
		}
		else
		{
		return "Invalid number";
		}		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Enter num3");
		int num3 = sc.nextInt();
		System.out.println(largestNumber(num1,num2,num3));
	}
}
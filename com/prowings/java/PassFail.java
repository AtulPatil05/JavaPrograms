package com.prowings.java;
import java.util.*;
class PassFail
{
	public static String marks(int marks)
	{
		if(marks>=35)
		{
				return "Pass";
		}
		else
		{
		  return "Fail";
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks :- ");
		int marks = sc.nextInt();
		System.out.println("Remark :- "+marks(marks));
	}
}
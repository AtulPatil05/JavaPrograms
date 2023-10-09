package com.prowings.java;

class OddNumbers
{
	public static void oddNumbers()
	{
		int i;
		for(i=1;i<=100;i++)
		{
		if(i % 2 != 0)
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		oddNumbers();
	}
}
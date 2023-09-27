import java.util.*;
class LargestFromTwo
{
	public static String largestNumber(int num1,int num2)
	{
		if(num1>=num2)
		{
			if(num1>num2)
				return "Num1 is Largest";
			else
				return "num1 and num2 Both are Same";
		}
		else
		{
		  return "Num2 is Largest";
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter num1 is :- "+num1);
		int num2 = sc.nextInt();
		System.out.println("Enter num2 is :- "+num2);
		System.out.println(largestNumber(num1,num2));
	}
}
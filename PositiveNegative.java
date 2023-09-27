import java.util.*;
class PositiveNegative
{
	public static String isPositiveOrNot(int num)
	{
		if(num>=0)
		{
			if(num==0)
			{
				return "Number is Zero";
			}
			else
			{
				return "Number is Positive";
			}
		}
		else
		{
				return "Number is Negative";
		}
		
	}
	public static void main(String[] args)
	{
	Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num+":- "+isPositiveOrNot(num));
	}
	
}
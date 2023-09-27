import java.util.*;
class SwitchCaseCalculator
{
	public static float calculator(float num1, float num2, String operator)
	{
		float f = 1.0f;
		String s = operator.toLowerCase();
		switch(s)
		{
			case "+":
			return num1+num2;
			
			case "-":
			return num1-num2;
			
			case "*":
			return num1*num2;
			
			case "/":
			return num1/num2;
			
			case "%":
			return num1%num2;
			
			default:
			return f;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		float num1 = sc.nextFloat();
		System.out.println("Enter num2");
		float num2 = sc.nextFloat();
		System.out.println("Enter Operator to perform");
		String operator = sc.next();
		System.out.println("Result is :- "+calculator(num1,num2,operator));
	}
}
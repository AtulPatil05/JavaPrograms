import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); 
		if(leapYear(year))
			System.out.println("Year is Leap");
		else
			System.out.println("Year is Not Leap");
	}
	public static boolean leapYear(int year)
	{
		return (year % 4 == 0)? ((year % 100 == 0) && (year % 400 == 0)) ? true : false: false;
	}
}
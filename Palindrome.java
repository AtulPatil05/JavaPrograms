import java.util.Scanner;
class Palindrome{
	public static void palindrome(int i){
		int j = i;
		int res = 0;
		int rem = 0;
		 while (i != 0) {
      rem = i % 10;
      res = res * 10 + rem;
      i = i /  10;
	  System.out.println(res);
    }
	if (res == j)
		 System.out.println("Number is Palindrome");
    else
		 System.out.println("Number is Not-Palindrome");
	}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int j = sc.nextInt();
palindrome(j);
}
}	
 /*D:\ME>java Palindrome
123321
1
12
123
1233
12332
123321
Number is Palindrome

D:\ME>java Palindrome
134
4
43
431
Number is Not-Palindrome*/
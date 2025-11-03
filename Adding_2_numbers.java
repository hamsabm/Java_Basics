Take two numbers num1 and num2 as input from stdin and print the sum of those two numbers.

import java.util.Scanner;
public class add
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(x+y);
		sc.close();
	}
}

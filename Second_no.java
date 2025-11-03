//The average of two numbers is X. The first number is Y. Find the second number.

import java.util.Scanner;
public class Second
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=2*x-y;
        System.out.println(z);
        scanner.close();
    }
}

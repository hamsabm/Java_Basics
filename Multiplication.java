//Take two numbers num1 and num2 as input and you need to multiply them.

import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x*y;
        System.out.println(z);
        sc.close();
    }
}

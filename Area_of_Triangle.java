//Program to find the area of the triangle by using heron’s formula.
//Note:Area =[square root of]√s(s - a)(s - b)(s - c)
//where s is semi perimeter, or (a + b + c)/2.

import java.util.Scanner;
public class area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*(s-a)(s-b)(s-c));
        System.out.printf("%.2f",area);
        sc.close();
    }
}

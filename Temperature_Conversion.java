//Program to find the Fahrenheit value from the Celcius value.

import java.util.Scanner;
public class temp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=32+(x*9/5);
        System.out.printf("%.2f",y);
        sc.close();
    }
}

//You'll be given a person's height in inches. Write a program to convert it into centimeters.

import java.util.Scanner;
public class ic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double cm=n*2.54;
        System.out.printf("%.2f",cm);
        sc.close();
    }
}

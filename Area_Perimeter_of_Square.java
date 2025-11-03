//Given side of the square.Calculate the Area and perimeter of a square.

import java.util.Scanner;
public class AP
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int area=n*n;
        int per=4*n;
        System.out.println(area+" "+per);
        sc.close();
    }
}

//Given Radius of Sphere (R).Calculate volume of Sphere.

import java.util.Scanner;
public class Sphere
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double vol=(4.0/3.0) 3.14 Math.pow(r, 3);
        System.out.printf("%.2f",vol);
        sc.close();
    }
}

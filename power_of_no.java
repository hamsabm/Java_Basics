//Python.math module provides access to the mathematical functions defined by the C standard.
//One of the widely used function is math.pow(x, y) which Returns x raised to the power y.
//Now, you are given three integers x, y and M. You have to print ( x ^ y ) Mod M. 

import java.util.Scanner;
public class power{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int M=sc.nextInt();
        long z=(long)Math.pow(x,y)%M;
        System.out.println(z);
        sc.close();
    }
}

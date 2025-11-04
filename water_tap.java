//When two taps are working together to fill an empty tank, you can calculate the time it takes to fill the tank using the concept of rates.
//Tap A fill the tank in X minutes.
//Tap B fill the tank in Y minutes.

import java.util.Scanner;
public class Taps{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x*y/(x+y);
        System.out.println(z);
    }
}

//King loves to go on tours with his friends.
//King has N cars that can seat 5 people each and M cars that can seat 7 people each. Determine the maximum number of people that can travel together in these cars.

import java.util.Scanner;
public class Seats
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=5*x+7*y;
        System.out.println(z);
        sc.close();
    }
}

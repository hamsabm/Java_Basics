//Ravi has invented 1-minute Instant Noodles. As the name suggests, each packet takes exactly 1 minute to cook. Ravi's Restaurant has X stoves and only 1 packet can be cooked on a single stove at any minute.
//How many customers can Ravi serve in Y minutes if each customer orders exactly 1 packet of noodles?

import java.util.Scanner;
public class noodles
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=x*y;
        System.out.println(z);
        scanner.close();
    }
}

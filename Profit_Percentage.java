//Given Cost Price and Selling Price. Calculate the Profit Percentange.

import java.util.Scanner;
public class profit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double CP=sc.nextDouble();
        double SP=sc.nextDouble();
        double profit=SP-CP;
        double pp=(profit/CP)*100;
        System.out.printf("%.2f",pp);
        sc.close();
    }
}

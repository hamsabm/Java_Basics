//Pavan Playing a mobile game. In the game Pavan's character is "Unstoppable force" that means he can perform special attack.However for each special attack it costs A points to "Unstoppable force". If Pavan currently has B points,determine the number of special attacks he performed.

import java.util.Scanner;
public class Attack
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int attack=b/a;
        System.out.println(attack);
        sc.close();
    }
}

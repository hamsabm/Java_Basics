//Given P,T,R and then find Simple interest . 

import java.util.Scanner;
public class Interest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int in=(p*t*r)/100;
        System.out.println(in);
        sc.close();
    }
}

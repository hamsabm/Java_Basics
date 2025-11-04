//Given an integer minutes .Convert the given minutes into HOURS and MINUTES form.

import java.util.Scanner;
public class time{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hour=n/60;
        int min=n%60;
        System.out.println(hour +" Hour(s) "+min+" Minute(s)");
        sc.close();
    }
}

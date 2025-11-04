//Convert the given integer (in seconds) to hours, minutes and seconds.

import java.util.Scanner;
public class time{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hour=n/3600;
        int min=(n%3600)/60;
        int sec=n%60;
        System.out.println("H:M:S-"+hour+":"+min+":"+sec);
        sc.close();
    }
}

//Given number of days (D). Convert that days(D) into years, weeks.
//Note: Ignore Odd days.

import java.util.Scanner;
public class Days {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int d=sc.nextInt();
int week=(d%365)/7;
int year=d/365;
System.out.println(year);
System.out.println(week);
sc.close();
}

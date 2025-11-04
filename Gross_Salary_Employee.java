//This program will read Basic Salary, HRA and DA of an employee, calculate the PF on Basic Salary and finally print the PF and Gross Salary of the employee.
//Note: PF = 12% of the Basic Salary and Gross Salary = Basic Salary + HRA + DA + PF

import java.util.Scanner;
public class salary{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double x=sc.nextDouble();
double y=sc.nextDouble();
double z=sc.nextDouble();
double pf=0.12*x;
double g=x+y+z+pf;
System.out.printf("\n%.2f",pf);
System.out.printf("\n%.2f",g);
}
}

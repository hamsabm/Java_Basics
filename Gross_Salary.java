//Given basic salary of an employee as input and calculate its gross salary according to following.
//Basic Salary <=10000 ==> DA = 80% & HRA = 20%
//Basic Salary <=20000 ==> DA = 90% & HRA = 25%
//Basic Salary >20000 ==> DA = 95% & HRA = 30%
//Gross Salary = Basic Salary + DA + HRA
//Note: Display the gross salary in a single line with 2 decimal places after point.

import java.util.*;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        double DA = 0, HRA = 0;

        if (basic <= 10000) {
            DA = basic * 0.80;
            HRA = basic * 0.20;
        } else if (basic <= 20000) {
            DA = basic * 0.90;
            HRA = basic * 0.25;
        } else {
            DA = basic * 0.95;
            HRA = basic * 0.30;
        }

        double gross = basic + DA + HRA;
        System.out.printf("%.2f", gross);
    }
}

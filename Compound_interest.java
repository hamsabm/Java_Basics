//Given a principle amount , time and rate of interset . Find the Total Amount using Compound interest .

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double a = p * Math.pow((1 + r / 100.0), t);

        System.out.printf("%.2f", a);
        sc.close();
    }
}

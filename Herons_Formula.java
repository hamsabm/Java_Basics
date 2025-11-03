//Find the area of Triangle using Heron's formula.

import java.util.Scanner;
public class herons{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*(s-a)(s-b)(s-c));
        System.out.printf("%.4f", area);
        scanner.close();
    }
}

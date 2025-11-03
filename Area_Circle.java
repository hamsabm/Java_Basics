//Given the radius of the circle. Find the Area of a circle.

import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double area=3.14*x*x;
        System.out.printf("%.2f",area);
        sc.close();
    }
}

//You'll be given 2 integers num1 and num2, find the Average of those 2 integers.

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double avg = (x + y) / 2.0;
        System.out.printf("Average of %d and %d is: %.2f", x, y, avg);
        sc.close();
    }
}

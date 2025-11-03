//Romeo has X 5 rupee coins and Y 10 rupee coins. Romeo goes to a shop to buy chocolates for Juliet where each chocolate costs Z rupees. Find the maximum number of chocolates that Romeo can buy for Juliet.

import java.util.Scanner;

public class RJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int choc = (x * 5 + y * 10) / z;
        System.out.println(choc);
        sc.close();
    }
}

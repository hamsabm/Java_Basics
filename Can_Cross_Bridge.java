//You are given that a mango weighs X kilograms and a truck weighs Y kilograms. You want to cross a bridge that can withstand a weight of Z kilograms.
Find the maximum number of mangoes you can load in the truck so that you can cross the bridge safely.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z, r;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        r = (z - y) / x;
        System.out.println(r);
        scanner.close();
    }
}

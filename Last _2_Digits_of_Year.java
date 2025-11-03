//Given an Integer Year. Print the last two digits of Year.

import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x % 100;
        System.out.printf("%02d", y);
        sc.close();
    }
}

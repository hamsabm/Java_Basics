//Convert the Speed kilometer per hour to meter per second.

import java.util.Scanner;
public class CodeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        float m;
        System.out.print("Enter an integer: ");
        n = scanner.nextInt();
        m = (float) (n * 5) / 18.0f;
        System.out.printf("%.2f", m);
        scanner.close();
    }
}

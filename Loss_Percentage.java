//Find the loss percentage with given Cost Price and Selling Price

import java.util.Scanner;

public class LossPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double loss = x - y;
        double LP = (loss / x) * 100;
        System.out.printf("%.2f", LP);
        sc.close();
    }
}

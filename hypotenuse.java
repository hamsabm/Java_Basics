//Find the Hypotenuse of a right angled triangle with two given sides X,Y.

import java.util.*;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double hypotenuse = Math.sqrt((x * x) + (y * y));
        
        System.out.printf("%.2f", hypotenuse);
    }
}

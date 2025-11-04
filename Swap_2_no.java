//Given two integers "a" and "b" and we have to swap their values without using any temporary variable.

import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
        sc.close();
    }
}

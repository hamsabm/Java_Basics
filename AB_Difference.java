//Vijay is taking his baby steps into the world of programming.
//The very first program he's tasked to write is as follows: "Given two integers A and B, print A+B."
//Unfortunately, Vijay makes a typo: his program outputs A×B instead of A+B.
//Given the values of A and B, can you help Vijay find the absolute difference between the correct answer and the value his program prints?

import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int pro = A * B;
        int diff = A + B;
        int result = pro - diff;
        System.out.println(Math.abs(result));
        sc.close();
    }
}

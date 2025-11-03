//Aditya had collected N notes of Rs.2000 to pay his total college fees. However, the government banned Rs.2000 notes.
//Aditya wants to pay the same amount using Rs.500 notes only. Find the number of notes Aditya needs.

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = (n*2000)/500;
        System.out.println(result);
        sc.close();
    }
}

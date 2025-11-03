//Write a Program to print the color name by taking the Color code as input.
V -> Violet
I -> Indigo
B -> Blue
G -> Green
Y -> Yellow
O -> Orange
R -> Red
//Note: If none of the above mentioned character is entered as input, print -1 as output.

import java.util.*;
public class Color
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.nextLine().charAt(0);
        switch(s)
        {
            case 'V':System.out.println("Violet");break;
            case 'I':System.out.println("Indigo");break;
            case 'B':System.out.println("Blue");break;
            case 'G':System.out.println("Green");break;
            case 'Y':System.out.println("Yellow");break;
            case 'O':System.out.println("Orange");break;
            case 'R':System.out.println("Red");break;
            default:System.out.println("-1");break;
        }
        sc.close();
    }
}

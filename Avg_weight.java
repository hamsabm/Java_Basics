//The average weight of a group of three boys is X kgs. The individual weights (in kgs) W1 (Boy1 ) and W2(Boy2) are given. Find the weight of the third boy.

import java.util.Scanner;
public class Weight
{
    public static void main(String[] args)
    {
        int x,w1,w2,w3;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        w1=sc.nextInt();
        w2=sc.nextInt();
        w3=3*x-w1-w2;
        System.out.println(w3);
        sc.close();
    }
}

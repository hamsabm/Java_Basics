//Consider a disk has 2 surfaces, each surface is divided into T tracks and each track is divided into S sectors, each sector is divided into B blocks. Each block has 512 bytes of memory. So find the capacity of the disk (in KB's).

import java.util.Scanner;
public class bytes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=x*y*z;
        System.out.println(a+" "+"KB");
        sc.close();
    }
}

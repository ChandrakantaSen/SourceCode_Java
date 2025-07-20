package Puspendu;

import java.util.*;
class triangularno
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the limit :");
        int lim=sc.nextInt();
        int tri=3;
        System.out.println("Triangular numbers from 3 to "+lim+" are :");
        for(int i=3;tri<=lim;i++)
        {
            System.out.print(tri+" ");
            tri=tri+i;
        }
    }
}
    
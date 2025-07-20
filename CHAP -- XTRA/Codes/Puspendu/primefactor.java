package Puspendu;

import java.util.*;
class primefactor
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number :");
        int n=sc.nextInt();
        System.out.println("The Prime Factors of "+n+" are :");
        int i=2;
        while(n>1)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
            else
            i++;
        }
    }
}
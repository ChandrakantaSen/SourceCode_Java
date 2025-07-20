package All;

import java.util.*;
class Prime_factors
{
    Scanner sc=new Scanner(System.in);
    int n;
    Prime_factors()
    {
        n=0;
    }
    void input()
    {
        System.out.println("Enter the number whose prime factors are to be found :");
        n=sc.nextInt();
    }
    boolean isPrime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    void display()
    {
        int copy=n,i;
        for(i=2;i<=copy;i++)
        {
            if((isPrime(i))&&(copy%i==0))
            {
                System.out.println(i);
                copy=(copy/i);
                i=1;
            }
        }
    }
    public static void main()
    {
        Prime_factors ob=new Prime_factors();
        ob.input();
        System.out.println("The prime factors of input number are :");
        ob.display();
    }
}
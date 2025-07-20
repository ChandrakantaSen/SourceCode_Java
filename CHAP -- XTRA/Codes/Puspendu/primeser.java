package Puspendu;

import java.util.*;
class primeser
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        primeser ob=new primeser();
        System.out.println("Please enter the lower limit :");
        int llim=sc.nextInt();
        System.out.println("Please enter the upper limit :");
        int ulim=sc.nextInt();
        if(llim>=ulim)
        {
            System.out.println("Wrong Input");
            System.exit(0);
        }
        System.out.println("The Prime numbers from "+llim+" to "+ulim+" are :");
        for(int i=llim;i<=ulim;i++)
        {
            if(ob.check(i)==true)
            System.out.println(i);
        }
    }
    public boolean check(int n)
    {
        int flag=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            flag++;
        }
        if(flag==2)
        return true;
        else
        return false;
    }
}
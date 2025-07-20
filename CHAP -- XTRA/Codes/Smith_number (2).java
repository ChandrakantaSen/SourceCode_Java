import java.util.*;
class Smith_number
{
    Scanner sc=new Scanner(System.in);
    int n;
    Smith_number()
    {
        n=0;
    }
    void input()
    {
        System.out.println("Enter the number which is to be checked :");
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
    int SumOfDigit(int x)
    {
        int sum=0;
        while(x!=0)
        {
            sum=sum+(x%10);
            x=x/10;
        }
        return sum;
    }
    int calculate()
    {
        int copy=n,i,sum=0;
        for(i=2;i<=copy;i++)
        {
            if((isPrime(i))&&(copy%i==0))
            {
                sum+=SumOfDigit(i);
                copy=(copy/i);
                i=1;
            }
        }
        return sum;
    }
    public static void main()
    {
        Smith_number ob=new Smith_number();
        ob.input();
        if(ob.SumOfDigit(ob.n)==ob.calculate())
        System.out.println("Smith number");
        else
        System.out.println("Not a Smith number");
    }
}
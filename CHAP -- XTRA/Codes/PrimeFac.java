import java.util.*;
class PrimeFac
{
    int num[],freq[];
    PrimeFac()
    {
        num=new int[50];
        freq=new int[50];
        for(int i=0;i<50;i++)
        {
            num[i]=0;
            freq[i]=0;
        }
    }
    void enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers into the array :");
        for(int i=0;i<5;i++)
        {
            num[i]=sc.nextInt();
        }
    }
    void frefac()
    {
        for(int i=0;i<50;i++)
        {
            for(int j=1;j<=num[i];j++)
            {
                if(num[i]%j==0&&isPrime(j))
                freq[i]++;
            }
        }
    }
    boolean isPrime(int x)
    {
        if(x==1)
        return false;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    void disp()
    {
        System.out.println("Number \t Freq. of prime numbers");
        for(int i=0;i<50;i++)
        System.out.println(num[i]+" \t "+freq[i]);
    }
}
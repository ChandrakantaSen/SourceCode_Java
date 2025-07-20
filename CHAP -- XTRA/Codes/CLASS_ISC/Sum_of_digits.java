import java.util.*;
class Sum_of_digits
{
    void number(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            if(isPrime(sumOfDigit(num[i])))
            {
                System.out.println(num[i]);
            }
        }
    }
    boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    int sumOfDigit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}
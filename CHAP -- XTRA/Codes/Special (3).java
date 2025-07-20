import java.util.*;
class Special
{
    int N;
    Special()
    {
        N=0;
    }
    Special(int x)
    {
        N=x;
    }
    int facto(int x)
    {
        if((x==1)||(x==0))
        return 1;
        else 
        return x*facto(x-1);
    }
    void isSpecial()
    {
        int copy=N,sum=0;
        while(copy!=0)
        {
            sum+=facto(copy%10);
            copy=copy/10;
        }
        if(sum==N)
        System.out.println("Special Number");
        else
        System.out.println("Not a Special Number");
    }
}
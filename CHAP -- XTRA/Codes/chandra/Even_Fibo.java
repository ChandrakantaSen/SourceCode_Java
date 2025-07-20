import java.util.*;
class Even_Fibo
{
    int isEven(int p)
    {
        if(p%2==0)
        {
            return 0;  
        }
        else
        {
            return 1;
        }
    }
    void fibo()
    {
        int i;
        int a=0,b=1,c;
        for(i=3;i<=10;i++)
        {
            c=(a+b);
            a=b;
            b=c;
            //System.out.print(" "+c);
            if(isEven(c)==0)
            {
                System.out.println(" "+c);
            }
        }
    }
    
    public static void main()
    {
        Even_Fibo obj = new Even_Fibo();
        obj.fibo();
    }
}
import java.io.*;
class fibo
{
    int a,b,c,n1,s=0;
    fibo(int n)
    {
        n1=n;
    }
    void show()
    {   
        a=0;
        b=1;
        c=0;
        for(int i=1;i<=n1;i++)
        {
            s=s+a;
            System.out.println(a+" ");
            c=a+b;
            b=a;
            a=c;
        }
    }
}
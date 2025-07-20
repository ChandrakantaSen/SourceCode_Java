import java.io.*;
class hcf
{
    void fn(int a,int b,int h)
    {
        if(a%h==0&&b%h==0)
        {
            System.out.println(h);
            return ;
        }
        fn(a,b,h-1);
    }
    int sma(int p,int q)
    {
        if(p<q)
        {
            return p;
        }
        else
        {
            return q;
        }
    }
}
        
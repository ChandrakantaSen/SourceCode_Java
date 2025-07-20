import java.io.*;
class lcm
{
    void fn(int a,int b,int m)
    {
        if(m%a==0&&m%b==0)
        {
            System.out.println(m);
            return ;
        }
        fn(a,b,m+1);
    }
    int lar(int p,int q)
    {
        if(p>q)
        {
            return p;
        }
        else
        {
            return q;
        }
    }
}
        
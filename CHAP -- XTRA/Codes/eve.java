import java.io.*;
class eve
{
    void fn(int p,int q)
    {
        if(p%2!=0)
        {
            p++;
        }
        if(p>q)
        {
            return ;
        }
        System.out.print(p+" ");
        fn(p+2,q);
    }
}
        
import java.io.*;
class p
{
    void fn(int p,int q)
    {
        if(p>q)
        {
            return ;
        }
        System.out.println(p);
        fn(p+1,q);
        System.out.println(p);
    }
}
        
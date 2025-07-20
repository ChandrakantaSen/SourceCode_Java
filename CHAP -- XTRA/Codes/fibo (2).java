import java.io.*;
class fibo
{
    void fn(int a,int b,int n)
    {
        if(n<=0)
        {
            return ;
        }
        System.out.print(a+" ");
        fn(b,a+b,n-1);
    }
}
        
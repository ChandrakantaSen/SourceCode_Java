import java.io.*;
class rhhr
{
    public void fac(int a,int b,int c)
    {
        System.out.println("  a="+a+",  b="+b+",  c="+c+".");
        System.out.print("The second highest number is = ");
        if((a>b)&&(a<c))
        {
            System.out.print(a);
        }
        else if((b>a)&&(b<c))
        {
            System.out.print(b);
        }
        else if((c>a)&&(c<b))
        {
            System.out.print(c);
        }
        System.out.print(".");
    }
}
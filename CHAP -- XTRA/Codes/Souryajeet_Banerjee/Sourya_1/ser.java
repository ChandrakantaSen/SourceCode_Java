import java.io.*;
class ser
{
    public void fac(int a,int n)
    {
        int f=1,i;
        double s=0;
        for(i=1;i<=n;i++)
        {
            f*=i;
            s=s+(Math.pow(a,i)/(a+f));
        }
        System.out.println("    S = (a^1/a+1!)+(a^2/a+2!)+(a^3/a+3!)+....+(a^n/a+n!)");
        System.out.println(" => S =  "+s);
    }
}
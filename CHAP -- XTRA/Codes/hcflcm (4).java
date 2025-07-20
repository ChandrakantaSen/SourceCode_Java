package All;

import java.io.*;
public class hcflcm
{
    int a,b;
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int x,y;
        System.out.println("Enter two numbers");
        x=Integer.parseInt(in.readLine());
        y=Integer.parseInt(in.readLine());
        hcflcm t=new hcflcm(x,y);
        t.calculate();
    }
    hcflcm(int x,int y)
    {
        a=x;
        b=y;
    }
    void calculate()
    {
        int i,hcf=1,lcm=1,t=a*b;
        for(i=1;i<t;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                hcf=i;
            }
        }
        System.out.println("HCF="+hcf);
        for(i=1;i<t;i++)
        {
            if((a%i==0))
            {
                lcm=lcm*i;
                a=a/i;
            }
            if(b%i==0)
            {
                lcm=lcm*i;
                b=b/i;
            }
        }
        System.out.println("LCM="+lcm);
    }
}
                
        
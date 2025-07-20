package All;

import java.io.*;
class compositemagicnumber
{
    public static void magic()throws IOException
    {
        int m,n,i,s=0,c=0,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to  vheck whether it is comositemagic or not");
        n=Integer.parseInt(br.readLine());
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c>=1)
        {
            m=n;
            while(m>9)
            {
            while(m>0)
            {
                d=m%10;
                s=s+d;
                m=m/10;
            }
            if(s>9)
            {
                m=s;
                s=0;
            }
        }
    }
            if(s==1)
            {
                System.out.println(n+" is a magic composite number");
            }
            else
            {
                System.out.println(n+" is not a magic composite number");
            }
        }       
    public static void main()throws IOException
    {
 magic();
    }
}      
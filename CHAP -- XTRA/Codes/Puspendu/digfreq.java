package Puspendu;

import java.io.*;
class digfreq
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number to compute the frequency of its digits :");
        int n=Integer.parseInt(br.readLine());
        int d,ds,ctr=0,m=n;
       for(int i=0;i<=9;i++)
       {
           while(m>0)
           {
               d=m%10;
               if(d==i)
               {
                   ctr++;
                }
                m=m/10;
            }
            m=n;
            if(ctr==0)
            continue;
            else
            System.out.println("The frequency of "+i+" is "+ctr);
            ctr=0;
        }
    }
}


            
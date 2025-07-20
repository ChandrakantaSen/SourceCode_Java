package All;

import java.io.*;
public class krishnamurthy
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,temp,rem,i,f=1,sum=0;
        System.out.println("Enter a number");
        n=Integer.parseInt(in.readLine());
        temp=n;
        while(temp>0)
        {
            rem=temp%10;
            for(i=1;i<=rem;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            f=1;
            temp=temp/10;
        }
        if(sum==n)
        System.out.println("Krishnamurthy number");
        else
        System.out.println("Not a Krishanamurthy number");
    }
}

                
            
        
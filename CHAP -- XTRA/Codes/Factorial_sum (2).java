package All;

import java.io.*;
class Factorial_sum
{
    public static void main(String args[])throws IOException
    {
        int n,fac=1,sum=0,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            fac=1;
            for(int j=1;j<=i;j++)
            {
                fac=fac*j;
            }
            sum=sum+fac;
        }
        System.out.println("Sum = "+sum);
    }
}
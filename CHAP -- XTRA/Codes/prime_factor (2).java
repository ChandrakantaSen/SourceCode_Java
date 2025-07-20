package All;

import java.io.*;
public class prime_factor
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            int n,i,j,c=0;
            System.out.println("Enter a number");
            n=Integer.parseInt(in.readLine());
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    for(j=1;j<=i;j++)
                    {
                        if(i%j==0)
                        c=c+1;
                    }
                }
                if(c==2)
                {
                    System.out.println(i);
                }
                c=0;
            }
        }
    }
            
            
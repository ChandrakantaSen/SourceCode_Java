package All;

import java.io.*;

public class check_fibo_element
{
    public static void main(String[] args) throws IOException 
    {
        int f0=0,f1=1,f2;
        int m,n,k=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the range: ");
        n=Integer.parseInt(in.readLine());
        System.out.println("Enter the value to be searched: ");
        m=Integer.parseInt(in.readLine());
        for(int i=0;i<n;i++)
        {
            f2=f0+f1;
            f0=f1;
            f1=f2;
            if(f2==m)
            {
                k=1;
                break;
            }
        }
        
        if(k==1)
            System.out.println("Found");
        else
            System.out.println("Not Found");        
    }
}

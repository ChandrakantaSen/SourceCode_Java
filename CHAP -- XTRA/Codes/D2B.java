package All;

import java.io.*;
class D2B
{
    public static void main(String args[])throws IOException
    {
        int i,j=1,m=0,n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Decimal no: ");
        n=Integer.parseInt(in.readLine());
        
        while(n!=0)
        {
            int d=n%2;
            m=m+d*j;
            j=j*10;
            n=n/2;
        }
        System.out.println("Binary No is: "+m);
    }
}
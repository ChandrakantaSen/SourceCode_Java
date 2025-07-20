package All;

import java.io.*;
class B_2_D
{
    public static void main(String args[])throws IOException
    {
        int i,j=1,m=0,n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Binary no: ");
        n=Integer.parseInt(in.readLine());
        
        while(n!=0)
        {
            int d=n%10;
            m=m+d*j;
            j=j*2;
            n=n/10;
        }
        System.out.println("Decimal No is: "+m);
    }
}
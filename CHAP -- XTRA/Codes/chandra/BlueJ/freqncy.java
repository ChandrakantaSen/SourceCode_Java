import java.io.*;
class freqncy
{
    public static void main(String args[])throws IOException
    {
        int n,i,t,c=0,d;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        n= Integer.parseInt(in.readLine());
        
        for(i=0;i<=9;i++)
        {
            t=n;
            while(t>0)
            {
                d=t%10;
                if(d==i)
                {
                    c++;
                }
                t=t/10;
            }
            if(c>1)
            {
                System.out.println("Frequency of "+i+" is: "+c);
            }
            c=0;
        }
    }
}
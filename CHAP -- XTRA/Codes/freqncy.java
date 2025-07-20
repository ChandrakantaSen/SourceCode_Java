import java.io.*;
class freqncy
{
    public static void main(String args[])throws IOException
    {
        int n,c=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        n = Integer.parseInt(in.readLine());
        for(int i=0; i<=9; i++)
        {
            int t=n;
            while(t>0)
            {
                int d=t%10;
                if(d==i)
                {
                    c++;
                }
                t=t/10;
            }
            if(c!=0)
            {
                System.out.println("The Frequency of "+i+" = "+c);
            }
            c=0;

        }
    }
}

import java.io.*;

class PalinSeries
{
    public static void main(String args[])throws IOException
    {
        int lr,ur,rev=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the lower bound: ");
        lr = Integer.parseInt(in.readLine());
        System.out.print("Enter the upper bound: ");
        ur = Integer.parseInt(in.readLine());
        
        System.out.println("Palindrome Series is: ");
        for(int i=lr;i<=ur;i++)
        {
            int n=i;
            while(n!=0)
            {
                int d = n%10;
                rev = rev*10 + d;
                n = n/10;
            }
            if(rev == i)
            {
                System.out.print(rev+" ");
            }
            rev=0;
        }
    }
}
import java.io.*;
class magic
{
    public static void main(String args[])throws IOException
    {
        int p,n,sum = 0;
        int b,c,d;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number to be checked");
        n = Integer.parseInt(in.readLine());

        sum = n;
        while(sum>9)
        {
            n = sum;
            sum = 0;
            while(n>0)
            {
                d=n%10;
                sum = sum + d;
                n = n/10;
            }
        }
        if(sum == 1)
        {
            System.out.println("Number is Magic");
        }
        else
        {
            System.out.println("Number is not Magic");
        }
    }
}
import java.io.*;
class WeakArm
{
    public static void main(String args[])throws IOException
    {
        int n,c=0,d,t;
        double sum=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        n = Integer.parseInt(in.readLine());
        t=n;
        while(t!=0)
        {
            c++;
            t=t/10;
        }
        t=n;
        while(t!=0)
        {
            d = t%10;
            sum = sum + Math.pow(d,c);
            System.out.println("sum is: "+(int)sum);
            t=t/10;
            c--;
        }
        if(sum==n)
        {
            System.out.println("Weakarm Number");
        }
        else
        {
            System.out.println("Weakarm Number");
        }

    }
}

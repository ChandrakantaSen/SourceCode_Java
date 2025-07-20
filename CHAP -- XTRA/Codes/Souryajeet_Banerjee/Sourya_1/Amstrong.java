import java.io.*;
class Amstrong
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        int n1=n;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=s+(r*r*r);
        }
        if(s==n1)
        {
            System.out.println("Amstrong number = "+s);
        }
        else
        {
            System.out.println("Not a Amstrong number = "+s);
        }
    }
}
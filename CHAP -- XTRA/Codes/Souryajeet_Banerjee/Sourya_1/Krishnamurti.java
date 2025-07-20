/*145*/
import java.io.*;
class Krishnamurti
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0,f=1;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        int n1=n;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            for(int j=1;j<=r;j++)
            {
                f=f*j;
            }
            s=s+f;
            f=1;
        }
        if(s==n1)
        {
            System.out.println("Krishnamurti number = "+s);
        }
        else
        {
            System.out.println("Not a Krishnamurti number = "+s);
        }
    }
}
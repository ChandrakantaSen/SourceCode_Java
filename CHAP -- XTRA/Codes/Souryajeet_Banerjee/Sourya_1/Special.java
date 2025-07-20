/*59*/
import java.io.*;
class Special
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0,j=1,c=0;
        System.out.print("Enter the number ");
        n=Integer.parseInt(br.readLine());
        int n1=n;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=s+r;
            j=j*r;
        }
        c=c+s+j;
        if(c==n1)
        {
            System.out.println("Special Number = "+c);
        }
        else
        {
            System.out.println("Not A Special Number = "+c);
        }
    }
}
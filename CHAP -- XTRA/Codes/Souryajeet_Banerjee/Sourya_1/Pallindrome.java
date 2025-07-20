/*121*/
import java.io.*;
class Pallindrome
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
            s=(s*10)+r;
        }
        if(s==n1)
        {
            System.out.println("Pallindrome number = "+s);
        }
        else
        {
            System.out.println("Not a Pallindrome number = "+s);
        }
    }
}
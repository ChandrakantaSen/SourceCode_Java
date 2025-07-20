import java.io.*;
class special
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,a,b,s,p;
        System.out.println("Enter a 2-digit no.");
        n=Integer.parseInt(br.readLine());
        a=n/10;
        b=n%10;
        s=a+b;
        p=a*b;
        if(s+p==n)
        {
            System.out.println("Special 2-digit no");
        }
        else
        {
            System.out.println("Not a special 2-digit no");
        }
    }
}

import java.io.*;
class fibonacci
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=1,c=0,n;
        System.out.println("Enter the range of the numbers ");
        n=Integer.parseInt(br.readLine());
        while(c<=n)
        {
            System.out.println(a);
            c=a+b;
            b=a;
            a=c;
        }
    }
}
        
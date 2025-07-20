import java.io.*;
class Factorial
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        double s=0,f=1;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                f=f*i;
            }
            s=s+i/f;
        }
        System.out.print("Factorial Series = "+s);
    }
}
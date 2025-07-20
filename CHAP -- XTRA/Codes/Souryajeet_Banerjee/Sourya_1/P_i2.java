import java.io.*;
class P_i2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter any odd number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
            System.out.println();
        }
        for(int i=1;i<=n+1;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=n;i>=1;i--)
        {
           for(int j=1;j<=i;j++)
           {  
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
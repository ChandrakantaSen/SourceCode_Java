import java.io.*;
class P_14
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
               System.out.print(j);
           }
           for(int k=i-1;k>=1;k--)
           {
               System.out.print(k);
           }
            System.out.println();
        }
    }
}
import java.io.*;
class P_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {  
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
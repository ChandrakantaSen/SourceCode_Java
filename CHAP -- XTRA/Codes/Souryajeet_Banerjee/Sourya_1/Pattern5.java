import java.io.*;
class Pattern5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            c=i*i*i;
            System.out.print(c);
            System.out.print("  ");
        }
    }
} 
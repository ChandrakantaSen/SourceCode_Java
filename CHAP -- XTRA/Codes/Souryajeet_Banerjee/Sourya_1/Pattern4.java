import java.io.*;
 class Pattern4
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i=i+4)
        {
            c=i;
            System.out.print(c);
            System.out.print("  ");
        }
    }
} 
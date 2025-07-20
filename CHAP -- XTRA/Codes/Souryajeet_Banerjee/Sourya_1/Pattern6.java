import java.io.*;
class Pattern6
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        double c=0,j;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            j=(i+1);
            c = c + i/j;
        }
        System.out.print(c);
        System.out.print("  ");
    }
} 
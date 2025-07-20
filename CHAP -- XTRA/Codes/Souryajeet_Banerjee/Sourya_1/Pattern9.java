import java.io.*;
class Pattern9
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the number of loop");
        n=Integer.parseInt(br.readLine());
        int a;
        System.out.println("Enter the number");
        a=Integer.parseInt(br.readLine());
        double c=0,j=1;
        for(int i=1;i<=n;i++)
        {
            j=j*a/i;
            c=c+j;
        }
        System.out.print(c);
    }
}
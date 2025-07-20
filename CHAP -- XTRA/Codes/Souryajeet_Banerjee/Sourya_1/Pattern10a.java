import java.io.*;
class Pattern10a
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
            c=c+(j);
            j=j*-1;
            j=j*a/i;
        }
        System.out.print(c);
    }
}
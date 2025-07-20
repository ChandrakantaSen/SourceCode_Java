import java.io.*;
class Factorials
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double s=0,f=1;
        int n;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        System.out.print("Factorial Series = ");
        for(int g=1;g<=n;g++)
        {
            for(int i=1;i<=g;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    f=f*i;
                }
                s=s+i/f;
            }
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
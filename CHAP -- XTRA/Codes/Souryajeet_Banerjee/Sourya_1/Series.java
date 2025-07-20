import java.io.*;
class Series
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double n,s=0,f=1,c=0;
        System.out.println("Enter the number");
        n=Double.parseDouble(br.readLine());
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                s=s+j+(j+1);
                System.out.print(s+"/");
                f=f*j*(j+1);
                System.out.print(f+"+");
            }
            c=c+s/f;
            System.out.println(" = "+c);
        }
        System.out.print(c);
    }
}
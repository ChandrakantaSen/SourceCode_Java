import java.io.*;
class Composite 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c!=2)
        {
            System.out.println("Composite number = "+n);
        }
        else
        {
            System.out.println("Prime number = "+n);
        }
    }
} 